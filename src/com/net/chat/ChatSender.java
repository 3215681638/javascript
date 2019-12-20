package com.net.chat;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class ChatSender implements Runnable {

	private DatagramSocket socket;
	private int port;
	public ChatSender(DatagramSocket socket, int port) {
		this.socket=socket;
		this.port=port;
	}
	@Override
	public void run() {
		Scanner sc=new Scanner(System.in);
		while(true) {
			try {
				System.out.println("输入要发送的消息：");
				String str=sc.nextLine();
				byte[] hcqsz=str.getBytes("UTF-8");
				System.out.println("输入对端的IP：");
				String ip=sc.nextLine();
				DatagramPacket packet=new DatagramPacket(hcqsz,hcqsz.length,InetAddress.getByName(ip),port);
				socket.send(packet);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}		
	}

}
