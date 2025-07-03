package com.cc._05__overridingstart;

public class MyThread extends Thread{

	@Override
	public synchronized void start() {
		// TODO Auto-generated method stub
			System.out.println("start() method");

			}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("run() method ");
	}
	
}
