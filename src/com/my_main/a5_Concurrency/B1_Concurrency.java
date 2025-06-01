package com.my_main.a5_Concurrency;

public class B1_Concurrency {

	// Thread is lightweight process.
	
	//	synchronized
	
	// Multiple Thread can run inside single process.

	public static void main(String[] args) {

		ThreadExample threadExample = new ThreadExample();
		ThreadExample2 threadExample2 = new ThreadExample2();

		threadExample.run();
		threadExample2.run();

		threadExample.start();
		//don't have threadExample2.start()
		
		
		ThreadExample_ threadExample_ = new ThreadExample_();
		threadExample_.start();
		ThreadExample__ threadExample__ = new ThreadExample__();
		threadExample__.start();
		
		
		Thread thread= new Thread(threadExample__);
		thread.start();

		Thread thread2= new Thread(threadExample2);
		thread2.start();

		Thread thread_lamda= new Thread(()->System.out.println("From Lamda style"));
		thread_lamda.start();
	}

}

class ThreadExample extends Thread {
	@Override
	public void run() {
		System.out.println("ThreadExample:  " + this.getName());
	}
}

class ThreadExample_ extends Thread {
	@Override
	public void run() {
		System.out.println("ThreadExample_:  " + this.getName());
	}
}
class ThreadExample__ extends Thread {
	@Override
	public void run() {
		System.out.println("ThreadExample__:  " + this.getName());
	}
}

class ThreadExample2 implements Runnable {

	@Override
	public void run() {

		System.out.println("ThreadExample2: from Runnable ");
	}

}
