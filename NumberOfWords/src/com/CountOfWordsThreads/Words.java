package com.CountOfWordsThreads;

public class Words {
	int count = 0;
	
	public synchronized int countWords(String[] str, int idx, int x, Words w, int m, int c) {
		for(int i = idx; i < idx+x; ++i) {
			String k = str[i];
			//System.out.println(k);
			String[] s = k.trim().split(" ");
			count += s.length;
		}
		if(idx!=0)
			idx++;
		while(c==5 && idx<m) {
			String k = str[idx];
			//System.out.println(k);
			String[] s = k.trim().split(" ");
			count += s.length;
			idx++;
		}
		return count;
	}
}