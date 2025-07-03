package com.cc._07_threadpriority;

public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main Thread: "+Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(15);
		
		MyThread t1= new MyThread();
		t1.start();
		}

}
