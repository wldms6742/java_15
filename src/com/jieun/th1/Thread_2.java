package com.jieun.th1;

public class Thread_2 extends Thread {
	@Override
	public void run() {
	this.s2();
	}
	public void s2() {
		for(int i='A';i<'J';i++) {
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}			
			System.out.println((char)i);
		}
	}
}
