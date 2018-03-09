package com.jieun.th1;

public class Thread_1 extends Thread {
	@Override
	public void run() {
		this.s1();
	}
	public void s1() {
		for(int i = 0; i<10;i++) {
			try {
				Thread.sleep(1000);	
			} catch (Exception e) {
				// TODO: handle exception
			}
			System.out.println("s1 :"+i);
		}
	}
}	
