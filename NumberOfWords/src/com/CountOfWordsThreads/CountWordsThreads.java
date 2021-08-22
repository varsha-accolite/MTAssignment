package com.CountOfWordsThreads;

import java.io.*;
import java.util.*;

public class CountWordsThreads extends Thread{
	
	public static void main(String args[]) throws IOException, InterruptedException {
		//final CountDownLatch latch = new CountDownLatch(100);
		Words w = new Words();
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		long startTime = System.currentTimeMillis();
		System.out.print(" ");
		int n = 5, idx = 0;
	    int m = Integer.parseInt(reader.readLine());
		int x = m/n;
		String[] str = new String[m+1];
		for(int i = 0; i < m; ++i) 
			str[i] = reader.readLine();
		ArrayList<Count> t = new ArrayList<>();
		for(int i = 0; i < n; ++i) {
			t.add(new Count(str, idx, x, w, m));
			idx += x;
			t.get(i).start();
		}
		for(int i = 0; i < n; ++i)
			t.get(i).join();
		long stopTime = System.currentTimeMillis();
		long timeTaken = stopTime - startTime;
		System.out.println("Time taken : "+timeTaken);
	}
}