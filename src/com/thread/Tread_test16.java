package com.thread;

import java.util.ArrayList;
import java.util.List;

public class Tread_test16 {
	public static void main(String[] args) {
		List<Object>goods=new ArrayList<>();
		long start=System.currentTimeMillis();
		Thread t1=new Thread(()->{
			int num=0;
			while(System.currentTimeMillis()-start<30) {
			synchronized(goods){
				if(goods.size()>0)
				{
					try {
						goods.wait();
					}catch(InterruptedException e) {
						e.printStackTrace();
					}
				}else {
					goods.add("��Ʒ"+(++num));
					System.out.println("������Ʒ"+num);
				}			
				}
			}
		},"������");
		Thread t2=new Thread(()->{
			int num=0;
			while(System.currentTimeMillis()-start<=30) {
				synchronized(goods){
					if(goods.size()<=0)
					{
						goods.notify();
					}else {
						goods.add("��Ʒ"+(++num));
						System.out.println("������Ʒ"+num);
					}			
					}
			}
		},"������");
		t1.start();
		t2.start();
	}

}
