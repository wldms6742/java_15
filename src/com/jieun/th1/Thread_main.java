package com.jieun.th1;

public class Thread_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread_1 t1 = new Thread_1();
		Thread_2 t2 = new Thread_2();
		Thread_3 t3 = new Thread_3();//runnable인터페이스 구현->start없음
		Thread_4 t4 = new Thread_4();
		
		Thread t5 = new Thread(t3);
		Thread t6 = new Thread(t4);//runnable 인터페이스 run을 부르기위해서
		t1.start();//run을 호출
		t2.start();
		t5.start();
		t6.start();
		
		
	}

}
