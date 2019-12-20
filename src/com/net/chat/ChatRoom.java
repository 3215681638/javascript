package com.net.chat;

import java.net.DatagramSocket;
import java.net.SocketException;
import java.util.Scanner;

public class ChatRoom {

	public static void main(String[] args) throws Exception {
		/*Scanner sc=new Scanner(System.in);
		System.out.println("请输入聊天程序开启的端口号：");
		
		System.out.println("聊天初始化完成");*/
		int port=5000;
		DatagramSocket udp_socket=new DatagramSocket(port);	
		DatagramSocket receiver_socket=new DatagramSocket(3000);	
		new Thread(new ChatReceiver(udp_socket),"接收程序").start();
		new Thread(new ChatSender(udp_socket,port),"发送程序").start();
	}

}
