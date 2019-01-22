package aha;

import org.junit.Test;

public class sort {
	public int[] maopaosort(int[] A){
		for(int i=0;i<A.length;i++)
		{
			for(int j=i+1;j<A.length;j++)
			{
				if(A[i]<A[j])
					swap(A,i,j);
			}
		}
		return A;
	}
	public int[] insertsort(int[] A){
		
		return A;
	}
	private void swap(int[] a, int i, int j) {
		// TODO Auto-generated method stub
		int tmp=a[i];
		a[i]=a[j];
		a[j]=tmp;
	}
	
	@Test
	public void test()
	{
		int [] A={5,3,5,2,8};
		A=maopaosort(A);
		for(int i=0;i<A.length;i++)
			System.out.print(A[i]+"  ");
	}
}
