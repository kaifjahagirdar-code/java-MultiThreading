package com.cc._01_Threading;

public class MyThread extends Thread{

	@Override
	public void run() {
	  System.out.println("======>Child Started==<====");
	  for(int i=1;i<=100;i++)
	  {
		  System.out.println(i+" Child Started");
	  }
	  System.out.println("=====>Child Ended<====");
	
	}
	
}
