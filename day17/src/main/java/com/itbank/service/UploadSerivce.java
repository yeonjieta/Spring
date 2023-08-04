package com.itbank.service;

import java.io.File;
import java.io.FileInputStream;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.itbank.model.UploadDTO;
import com.itbank.repository.UploadDAO;
import com.jcraft.jsch.Channel;
import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.JSch;

import com.jcraft.jsch.Session;


@Service
public class UploadSerivce {
	
	// 업로드받은 파일을 현재 컴퓨터(WAS, Tomcat)에 저장하지 않는다.
	
	private String serverIP = "192.168.1.100";
	private int serverPort = 22;
	private String serverUser = "root";
	private String serverPass = "1";
	private ChannelSftp chSftp = null;  // 이게 jcraft
	
	@Autowired private UploadDAO dao;

	public int insert(UploadDTO dto) throws Exception {
		// 1) 업로드 받은 파일을 웹서버에 임시로 생성한다.
		MultipartFile f = dto.getUpload();
		File dest = new File(f.getOriginalFilename());
		f.transferTo(dest); // 임시로 생성했기 때문에 나중에 지워야한다.
		
		// 2) 웹서버에 생성한 임시 파일을 대상 서버에 전송하기 위해 SFTP로 연결한다.
		Session sess =null;
		Channel channel = null;
		JSch jsch = new JSch();
		
		sess = jsch.getSession(serverUser, serverIP, serverPort);
		sess.setPassword(serverPass);
		sess.setConfig("StrictHostKeyChecking", "no");
		sess.connect(); //ssh protocol로 연결됨 
		
		System.out.println("sftp> connected");
		
		channel = sess.openChannel("sftp");  // ssh접속의 채널을 sfpt로 설정
		channel.connect();
		
		chSftp = (ChannelSftp) channel;
		
		FileInputStream fis = new FileInputStream(dest);
		chSftp.cd("/var/www/html");   // 접속 이후 명령어 전달( cd /var/www/html)
		chSftp.put(fis, dest.getName()); //  put 1.jpg    최상위로 가서 이 이름으로 upload 하겠다
		System.out.println("sftp> transfer complete");
		
		fis.close();
		chSftp.isClosed();
		
		String filePath = "";   // dto에 넣어줄 파일의 경로
		filePath += "http://";
		filePath += serverIP;
		filePath += "/" + dest.getName();
		
		dto.setFilePath(filePath);
		
		// 전송경로를 dto에 세팅한 이후 dao로 넘겨서 업로드 한다.
		// 전송이 끝났으면, 임시 파일은 제거한다.
		dest.delete();
		
		return dao.insert(dto);
	}

	public List<UploadDTO> selectAll() {
		return dao.selectAll();
	}

}
