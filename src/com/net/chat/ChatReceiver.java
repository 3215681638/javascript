package com.net.chat;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ChatReceiver implements Runnable {
	private DatagramSocket socket;
	public ChatReceiver(DatagramSocket socket) {
		this.socket=socket;
	}
	@Override
	public void run() {
		byte[] zjsz=new byte[1024];
		DatagramPacket dp=new DatagramPacket(zjsz,zjsz.length);
		while(true){
			try {
				socket.receive(dp);
				String neirong=new String(dp.getData(),"UTF-8");
				System.out.println("ю╢вт"+dp.getAddress().getHostAddress()+":"+neirong);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
