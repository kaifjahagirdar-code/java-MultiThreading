package com.cc._02_Threading;

public class MyRunnableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("====>Main Started<===");
		MyRunnable r1= new MyRunnable();
		Thread t1= new Thread(r1);
		
		t1.start();
		
		for(int i=111;i<=200;i++)
		{
			System.out.println(i+" Main Started");
		}
		System.out.println("========>Main Ended<======");
		

	}

}
