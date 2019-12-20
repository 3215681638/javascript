package com.net;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Sender_UDP {

	public static void main(String[] args) throws Exception {
		DatagramSocket client=new DatagramSocket(19600);
		String str="来自董攀的问候";
		byte[] hcqsz=str.getBytes("UTF-8");
		DatagramPacket packet=new DatagramPacket(hcqsz,hcqsz.length,InetAddress.getByName("10.2.103.31"),8900);
		System.out.println("开始发送信息.....");
		client.send(packet);
		client.close();
	}

}
