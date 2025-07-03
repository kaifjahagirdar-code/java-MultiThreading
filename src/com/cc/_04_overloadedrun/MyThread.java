package com.cc._04_overloadedrun;

public class MyThread extends Thread{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++)
		{
			System.out.println("============>Child Thread");
		}
	}
	
	public void run(int x) {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++)
		{
			System.out.println("Child Thread"+x);
		}
	}
	
	
}
