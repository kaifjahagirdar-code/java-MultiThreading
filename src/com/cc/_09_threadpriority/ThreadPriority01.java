package com.cc._09_threadpriority;

public class ThreadPriority01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread t1= new MyThread();
		t1.start();
		t1.setPriority(10);
		Thread.currentThread().setPriority(1);
		for(int i=1;i<=10;i++) {
			System.out.println("Main Thread: ");
		}
		System.out.println(Thread.currentThread().getPriority()+" - "+t1.getPriority());
        
	}

}
