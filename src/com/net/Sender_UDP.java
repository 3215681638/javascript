package com.net;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Sender_UDP {

	public static void main(String[] args) throws Exception {
		DatagramSocket client=new DatagramSocket(19600);
		String str="���Զ��ʵ��ʺ�";
		byte[] hcqsz=str.getBytes("UTF-8");
		DatagramPacket packet=new DatagramPacket(hcqsz,hcqsz.length,InetAddress.getByName("10.2.103.31"),8900);
		System.out.println("��ʼ������Ϣ.....");
		client.send(packet);
		client.close();
	}

}
