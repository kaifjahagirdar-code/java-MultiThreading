package com.cc._08_threadpriority;

public class ThreadPriority {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main Thread : " +Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(7);
		MyThread t1= new MyThread();
		t1.start();

	}

}
