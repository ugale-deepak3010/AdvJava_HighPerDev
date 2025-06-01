package com.my_main.a5_Concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class B2_ExecutorService {

	public static void main(String[] args) {
		
		ExecutorService executorService= Executors.newFixedThreadPool(2);
		
		executorService.submit(new Class99());
		executorService.submit(new Class1());
		executorService.submit(new Class2());
		executorService.submit(new Class3());
		
		executorService.submit(new Class1());
		executorService.submit(new Class2());
		executorService.submit(new Class3());
		
		executorService.submit(new Class1());
		executorService.submit(new Class2());
		executorService.submit(new Class3());
		
		executorService.submit(new Class1());
		executorService.submit(new Class2());
		executorService.submit(new Class3());
		
		executorService.submit(new Class1());
		executorService.submit(new Class2());
		executorService.submit(new Class3());
		
		executorService.submit(new Class1());
		executorService.submit(new Class2());
		executorService.submit(new Class3());
		
		executorService.submit(()->System.out.println("From Lamda"));

		executorService.shutdown();// if not stop then will be live for forever.
	}

}

class Class1 extends Thread{

	@Override
	public void run() {
		System.out.println("From Class1 "+this.getName());
	}
}

class Class2 extends Thread{
	
	@Override
	public void run() {
		System.out.println("From Class2 "+this.getName());
	}
}

class Class3 extends Thread{
	
	@Override
	public void run() {
		System.out.println("From Class3 "+this.getName());
	}
}

class Class99 implements Runnable{
	
	@Override
	public void run() {
		System.out.println("From Class99 ");
	}
}
