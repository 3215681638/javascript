package com.net.tcp;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class UploadTCPClient {

	public static void main(String[] args) throws Exception {
		Socket khdtjz=new Socket("10.2.103.17",8899);
		OutputStream os=khdtjz.getOutputStream();
		File khdscdwj=new File("D:\\∂≠≈ .jpg");
		FileInputStream fin=new FileInputStream(khdscdwj);
		byte[] zjhc=new byte[1024];
		int b=fin.read(zjhc);
		while(b!=-1) {
			os.write(zjhc,0,b);
			b=fin.read(zjhc);
		}
		khdtjz.shutdownOutput();
	}

}
