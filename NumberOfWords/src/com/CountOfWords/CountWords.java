package com.CountOfWords;

import java.io.*;

public class CountWords {
	public static void main(String args[]) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		long startTime = System.currentTimeMillis();
		System.out.println(" ");
		int n = Integer.parseInt(reader.readLine());
		int count = 0;
		while(n-- > 0) {
			String s = reader.readLine();
			String[] str = s.trim().split(" ");
			count += str.length;
		}
		System.out.println(count);
		long stopTime = System.currentTimeMillis();
		long timeTaken = stopTime - startTime;
		System.out.println("Time taken : "+timeTaken);
	}
}
