package aha;

import java.util.ArrayList;

public class dui {
	int[] a=new int[100];
	int n=0;
	public void swap(int x,int y)
	{
		int tmp=a[x];
		a[x]=a[y];
		a[y]=tmp;
	}
	public void siftdown(int i){
		int t,flag=0;
		while(i*2<=n&&flag==0)
		{
			if(a[i]>a[i*2])
				t=2*i;
			else
				t=i;
			if(i*2+1<=n)
			{
				if(a[t]>a[i*2+1])
					t=i*2+1;
			}
			if(t!=i)
			{
				swap(i,t);
				i=t;
			}
			else
				flag=1;
		}
	}
	public void creat(){
		for(int i=n/2;i>=1;i--)
		{
			siftdown(i);
		}
				
	}
	public void heapsort()
	{
		while(n>1)
		{
			swap(1,n);
			n--;
			siftdown(1);
		}
	}
	public int deletemin(){
		int t=a[1];
		a[1]=a[n];
		n--;
		siftdown(1);
		return t;
	}
}
