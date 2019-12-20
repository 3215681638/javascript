package com.net;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Net_test1 {

	public static void main(String[] args) throws Exception {
		InetAddress localadd=InetAddress.getLocalHost();
		InetAddress jhadd=InetAddress.getByName("www.hbjhart.com");
		System.out.println("本机IP为："+localadd.getHostAddress());
		System.out.println("江职服务器的IP地址为："+jhadd.getHostAddress());
		if(jhadd.isReachable(3000)) {
			System.out.println("江职服务器3秒可达");
		}
		System.out.println("江职服务器域名为："+jhadd.getHostName());
	}

}
