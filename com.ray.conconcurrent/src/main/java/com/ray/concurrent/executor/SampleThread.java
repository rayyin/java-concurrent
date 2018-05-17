package com.ray.concurrent.executor;

public class SampleThread implements Runnable {
	
	private final String name;
	 
	public SampleThread(String name) {
		super();
		this.name = name;
	}
 
	public void run() {
		try {
			System.out.println("Fetching data from "+name+" by "+Thread.currentThread().getName());
			Thread.sleep(5000); // Reading file
			System.out.println("Read file successfully: "+name+" by "+Thread.currentThread().getName());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public String getName() {
		return name;
	}
}
