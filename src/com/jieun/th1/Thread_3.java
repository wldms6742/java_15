package com.jieun.th1;

public class Thread_3 implements Runnable{
	@Override
	public void run() {
		// TODO Auto-generated method stub
	s3();	
	}
	
	public void s3() {
		for(int i=0;i<10;i++) {
			
			try {
				Thread.sleep(500);	
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			System.out.println("TV보기");
		}
	}
}
