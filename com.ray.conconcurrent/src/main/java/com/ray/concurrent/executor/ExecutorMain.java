package com.ray.concurrent.executor;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ExecutorMain {

	public static void main(String[] args) {	
		testFixedThreadPool();
	}
	
	private static void testFixedThreadPool() {
		ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) Executors.newFixedThreadPool(5);
		System.out.println("########## threadPoolExecutor getMaximumPoolSize=" + threadPoolExecutor.getMaximumPoolSize());
		for (int i = 0; i < 10; i++) {
			SampleThread st = new SampleThread("File" + i);
			System.out.println("###########threadPoolExecutor getPoolSize=" + threadPoolExecutor.getPoolSize());
			System.out.println("A new file has been added to read : " + st.getName());
			threadPoolExecutor.execute(st);
		}
		
		threadPoolExecutor.shutdown();
	}
}
