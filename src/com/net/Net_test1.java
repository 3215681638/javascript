package com.net;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Net_test1 {

	public static void main(String[] args) throws Exception {
		InetAddress localadd=InetAddress.getLocalHost();
		InetAddress jhadd=InetAddress.getByName("www.hbjhart.com");
		System.out.println("����IPΪ��"+localadd.getHostAddress());
		System.out.println("��ְ��������IP��ַΪ��"+jhadd.getHostAddress());
		if(jhadd.isReachable(3000)) {
			System.out.println("��ְ������3��ɴ�");
		}
		System.out.println("��ְ����������Ϊ��"+jhadd.getHostName());
	}

}
