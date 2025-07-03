package com.cc._02_Threading;

public class MyRunnable implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("======>Child Started<=====");
		for(int i=1;i<=100;i++)
		{
			System.out.println(i+" Child Started");
		}
		System.out.println("=====>Child Ended<=====");
		
	}
	
	
	
	

}
