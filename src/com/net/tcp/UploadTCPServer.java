package com.net.tcp;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

class ServerThread implements Runnable{
	private Socket socket;
	public ServerThread(Socket socket) {
		this.socket=socket;
	}
	@Override
	public void run() {
		String ip=socket.getInetAddress().getHostAddress();
		int count=1;
		try {
			File parentFile=new File("D:\\");
			if(!parentFile.exists()) {
				parentFile.mkdir();
			}
			File file=new File(parentFile,ip+"("+count+").jpg");
			while (file.exists()) {
				file=new File(parentFile,ip+"("+count+").jpg");
			}
			InputStream in=socket.getInputStream();
			FileOutputStream fos=new FileOutputStream(file);
			byte[] zjhc=new byte[1024];
			int l=0;
			while((l=in.read(zjhc))!=-1) {
				fos.write(zjhc,0,l);
			}
			OutputStream out=socket.getOutputStream();
			String s=ip+"上传成功";
			zjhc=s.getBytes("UTF-8");
			out.write(zjhc);
			in.close();
			fos.close();
			socket.close();
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}
}
public class UploadTCPServer {

	public static void main(String[] args) throws Exception {
		ServerSocket serverSocket=new ServerSocket(8899);
		while(true) {
			Socket client=serverSocket.accept();
			new Thread(new ServerThread(client)).start();
		}
	}

}
