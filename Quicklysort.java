package aha;

import org.junit.Test;

public class Quicklysort {
	public void quicklysort(int[] A ){
		quicklysortcore(A,0,A.length-1);
	}

	private void quicklysortcore(int[] a, int start, int end) {
		// TODO Auto-generated method stub
		if(start>end)
			return;
		int com=a[start];
		int startindex=start;
		int endindex=end;
		while(start!=end)
		{
			while(start<end&&end>=0&&a[end]>=com)
				end--;
			while(start<end&&start<a.length&&a[start]<=com)
				start++;
			if(start<end)
			{
				swap(a,start,end);
			}
			
		}
		a[startindex]=a[start];
		a[start]=com;
		quicklysortcore(a,startindex, start-1);
		quicklysortcore(a, end+1, endindex);
		return;
	}
	@Test
	public void test(){
		int[] A={6,1,2,7,9,3,4,5,10,8};
		quicklysort(A);
		for(int i=0;i<A.length;i++)
			System.out.print(A[i]+" ");
	}

	private void swap(int[] a, int start, int end) {
		// TODO Auto-generated method stub
		int tmp=a[start];
		a[start]=a[end];
		a[end]=tmp;
	}
}
