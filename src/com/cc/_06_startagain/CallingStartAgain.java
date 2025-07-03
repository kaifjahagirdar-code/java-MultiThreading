package com.cc._06_startagain;

public class CallingStartAgain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        MyThread t1= new MyThread();
		
        t1.start();
        t1.start();
		
		for(int i=1;i<=10;i++)
		{
			System.out.println("Main Thread- "+i);
		}

	}

}
