package com.cc._04_overloadedrun;

public class OverloadedDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread t1= new MyThread();
		
		t1.start();
		
		for(int i=1;i<=10;i++)
		{
			System.out.println("Main Thread- "+i);
		}


	}

}
