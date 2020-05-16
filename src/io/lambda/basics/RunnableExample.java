package io.lambda.basics;

public class RunnableExample {

	public static void main(String[] args) {
		Thread myThread = new Thread(new Runnable(){

			@Override
			public void run() {
				System.out.println("Inside runnable..!!!");
			}
			
		});
		myThread.start();
		
		Thread lambdaThread = new Thread(()->System.out.println("Lambda runnable"));
		lambdaThread.start();
		for(int i=1; i<=10; i++)
		System.out.println("Thread name: "+lambdaThread.getName());
		System.out.println("Thread name: "+lambdaThread.getName());
		System.out.println("Thread name: "+lambdaThread.getName());
		System.out.println("Thread name: "+lambdaThread.getName());
		System.out.println("Thread name: "+lambdaThread.getName());
		System.out.println("Thread name: "+lambdaThread.getName());
		System.out.println("Thread name: "+lambdaThread.getName());
	}
}
