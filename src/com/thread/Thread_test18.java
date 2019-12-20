package com.thread;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Thread_test18 {

	public static void main(String[] args) throws Exception, ExecutionException {
		CompletableFuture<Integer> xc1=CompletableFuture.supplyAsync(()->{
			int sum=0,i=0;
			while(i++<10) {
				sum+=i;
				System.out.println(Thread.currentThread().getName()+"线程任务正在执行"+i);	
			}
			return sum;
		});
		CompletableFuture<Integer> xc2=CompletableFuture.supplyAsync(()->{
			int sum=0,i=10;
			while(i++<20) {
				sum+=i;
				System.out.println(Thread.currentThread().getName()+"线程任务正在执行"+i);	
			}
			return sum;
		});
		CompletableFuture<Integer> xcxj=xc1.thenCombine(xc2,(r1,r2)->r1+r2);
		System.out.println("两线程和为："+xcxj.get());
		}
}
