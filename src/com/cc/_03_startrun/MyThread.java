package com.cc._03_startrun;

public class MyThread extends Thread{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<=10;i++)
		{
			System.out.println("Child Thread- "+i);
		}
	}
	
	

}
