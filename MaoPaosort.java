package aha;

import org.junit.Test;

public class MaoPaosort {
	public static int[] maopaosort(int[] A,int n){
		for(int i=1;i<n;i++)
		{
			for(int j=0;j<n-i;j++)
			{
				if(A[j]<A[j+1])
					swap(A,j,j+1);
			}
		}
		return A;
	}

	private static void swap(int[] a, int j, int i) {
		// TODO Auto-generated method stub
		int tmp=a[j];
		a[j]=a[i];
		a[i]=tmp;
	}
	@Test
	public void test(){
		int[] A={5,3,5,2,8};
		A=maopaosort(A, 5);
		for(int i=0;i<A.length;i++)
			System.out.print(A[i]+" ");
	}
}
