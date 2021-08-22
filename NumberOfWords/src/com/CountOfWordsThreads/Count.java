package com.CountOfWordsThreads;


public class Count extends Thread{
	
	private String[] str;
	private int idx;
	private int n;
	private Words t;
	private int m;
	public Count(String[] str, int idx, int n, Words t, int m) {
		this.str = str;
		this.idx = idx;
		this.n = n;
		this.t = t;
		this.m = m;
	}
	static int i = 0;
	public void run() {
		i++;
		//System.out.println(Thread.currentThread().getName()+" ");
		int c = t.countWords(str, idx, n, t, m, i);
		if(i == 5) {
			System.out.println(c);
		}
		
		/*for (int k = 0; k < Integer.MAX_VALUE; ++k) {
			for (int l = 0; l < 10; ++l)
				System.out.print(l);
			System.out.println(k);
		}*/
		
		//latch.countDown();
	}
}
