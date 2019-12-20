package com.net;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Receiver_UDP {

	public static void main(String[] args) throws Exception {
		DatagramSocket server=new DatagramSocket(8900);
		byte[] zjsz=new byte[1024];
		DatagramPacket dp=new DatagramPacket(zjsz,zjsz.length);
		System.out.println("等待接收数据");
		while(true){
			server.receive(dp);
			String neirong=new String(dp.getData());
			System.out.println(dp.getAddress().getHostAddress()+":"+neirong);
		}
	}

}
