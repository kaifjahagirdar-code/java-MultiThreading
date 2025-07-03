package com.cc._01_Threading;

public class MyThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("=====>Main Started<====");
		MyThread t1= new MyThread();
		t1.start();
		
		for(int i=111;i<=200;i++)
		{
			System.out.println(i+" Main Started");
		}
		System.out.println("====>Main Ended<=====");

	}

}
