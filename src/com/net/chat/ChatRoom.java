package com.net.chat;

import java.net.DatagramSocket;
import java.net.SocketException;
import java.util.Scanner;

public class ChatRoom {

	public static void main(String[] args) throws Exception {
		/*Scanner sc=new Scanner(System.in);
		System.out.println("����������������Ķ˿ںţ�");
		
		System.out.println("�����ʼ�����");*/
		int port=5000;
		DatagramSocket udp_socket=new DatagramSocket(port);	
		DatagramSocket receiver_socket=new DatagramSocket(3000);	
		new Thread(new ChatReceiver(udp_socket),"���ճ���").start();
		new Thread(new ChatSender(udp_socket,port),"���ͳ���").start();
	}

}
