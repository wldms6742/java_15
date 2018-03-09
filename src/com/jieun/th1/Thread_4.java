package com.jieun.th1;

public class Thread_4 implements Runnable {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		s4();
	}
	public void s4(	) {
		for(int i=0;i<10;i++) {
			try {
				Thread.sleep(700);	
			} catch (Exception e) {
				// TODO: handle exception
			}
			System.out.println("카톡하기");
		}
	}
}
