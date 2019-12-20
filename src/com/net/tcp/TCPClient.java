package com.net.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class TCPClient {

	public static void main(String[] args) throws IOException{
		Socket khdtjz=new Socket("10.2.103.19",8899);
		InputStream is=khdtjz.getInputStream();
		byte[] zjhc=new byte[1024];
		int b=is.read(zjhc);
		while(b!=-1) {
			System.out.println(new String(zjhc,0,b,"UTF-8"));
			b=is.read(zjhc);
		}
		is.close();
		khdtjz.close();
	}

}
