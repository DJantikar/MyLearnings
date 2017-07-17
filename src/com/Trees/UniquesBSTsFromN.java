package com.Trees;

import java.util.Arrays;

public class UniquesBSTsFromN {
	public static void main(String[] args) {
		int n=4;
		int[] solutions = new int[n+1];
		Arrays.fill(solutions, -1);		
		int sum=findUniqueBSTs(solutions,n);
		System.out.println(sum);
	}
	//static int possibilities;
	private static int  findUniqueBSTs(int[] roots,int n) {
		if(n==0 || n==1){
			return 1;
		}
		int p=0;
		for(int i=0 ; i<n ;i++){	
			if(roots[i]==-1){
				roots[i]=findUniqueBSTs(roots,i);
			}
			if(roots[n-i-1]==-1){
				roots[n-i-1]=findUniqueBSTs(roots,n-i-1);
			}
			p+=roots[i]*roots[n-i-1];
		}
		return p;
	}

}
