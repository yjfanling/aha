package aha;

import org.junit.Test;

public class Tongsort {
	public void tongsort(int[] A,int n){
		int[] res=new int[n+1];
		for(int i=0;i<A.length;i++)
		{
			res[A[i]]++; 
		}
		for(int i=n;i>=0;i--)
		{
			for(int j=0;j<res[i];j++)
				System.out.print(i+" ");
		}
	}
	@Test
	public void test(){
		int[] A={5,3,5,2,8};
		tongsort(A, 10);
	}
}
