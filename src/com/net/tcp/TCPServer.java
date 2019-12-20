package com.net.tcp;

import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {

	public static void main(String[] args) throws Exception {
		ServerSocket fwqtjz=new ServerSocket(8899);
		while(true) {
			Socket khdtjz=fwqtjz.accept();
			Thread thread=new Thread(()->{
				try {
					int port=khdtjz.getPort();
					System.out.println("端口"+port+"连接成功");
					OutputStream os=khdtjz.getOutputStream();
					String s="Holle,this from 10.2.103.19 TCP SERVER.";
					byte[] b=s.getBytes("UTF-8");
					os.write(b);
					os.close();
				} catch (IOException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}			
			});
			thread.start();
		}		
	}

}
