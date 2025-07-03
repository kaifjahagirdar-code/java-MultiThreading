package com.cc._03_startrun;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread t1= new MyThread();
		t1.run();
		for(int i=1;i<=10;i++)
		{
			System.out.println("Main Thread: "+i);
		}

	}

}
