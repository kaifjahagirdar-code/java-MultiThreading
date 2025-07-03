package com.cc._06_startagain;

public class MyThread extends Thread{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<=10;i++)
		{
		System.out.println("Child Thread- "+i);
	}
	}

}
