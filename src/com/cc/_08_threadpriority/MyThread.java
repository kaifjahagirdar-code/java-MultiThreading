package com.cc._08_threadpriority;

public class MyThread extends Thread{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Child Thread: "+ Thread.currentThread().getPriority());
		
	}
	

}
