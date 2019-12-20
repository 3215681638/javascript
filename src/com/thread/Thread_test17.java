package com.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class MyThread_6 implements Callable<Object>{

	@Override
	public Object call() throws Exception {
		int i=0;
		while(i++<5) {
			System.out.println(Thread.currentThread().getName()+"��run����������");
		}
		return null;
	}
	
}
public class Thread_test17 {

	public static void main(String[] args) throws Exception, ExecutionException {
		MyThread_6 mt6=new MyThread_6();
		ExecutorService excutor=Executors.newCachedThreadPool();
		Future<Object> rusult1=excutor.submit(mt6);
		Future<Object> rusult2=excutor.submit(mt6);
		excutor.shutdown();
		System.out.println("thread-1����ֵ:"+rusult1.get());
		System.out.println("thread-2����ֵ:"+rusult2.get());
	}

}
