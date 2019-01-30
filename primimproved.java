package aha;

import java.util.Scanner;

public class primimproved {
	static int n;
	static int size;
	static int[] dis=new int[7];
	static int[] h=new int[7];
	static int[] pos=new int[7];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int[] book=new int[7];
		int m=sc.nextInt();
		int[] u=new int[19];
		int[] v=new int[19];
		int[] w=new int[19];
		int[] first=new int[7];
		int[] next=new int[19];
		int inf=Integer.MAX_VALUE;
		int count=0,sum=0;
		for(int i=1;i<=m;i++)
		{
			u[i]=sc.nextInt();
			v[i]=sc.nextInt();
			w[i]=sc.nextInt();
		}
		for(int i=m+1;i<=2*m;i++)
		{
			u[i]=v[i-m];
			v[i]=u[i-m];
			w[i]=w[i-m];
		}
		for(int i=1;i<=n;i++)
			first[i]=-1;
		for(int i=1;i<=2*m;i++)
		{
			next[i]=first[u[i]];
			first[u[i]]=i;
		}
		book[1]=1;
		count++;
		for(int i=2;i<=n;i++)
			dis[i]=inf;
		int k=first[1];
		while(k!=-1)
		{
			dis[v[k]]=w[k];
			k=next[k];
		}
		size=n;
		for(int i=1;i<=size;i++)
		{
			h[i]=i;
			pos[i]=i;
		}
		for(int i=size/2;i>=1;i--)
			siftdown(i);
		pop();
		while(count<n){
			int j=pop();
			book[j]=1;
			count++;
			sum=sum+dis[j];
			k=first[j];
			while(k!=-1)
			{
				if(book[v[k]]==0&&dis[v[k]]>w[k])
				{
					dis[v[k]]=w[k];
					siftup(pos[v[k]]);
				}
				k=next[k];
			}
		}
		System.out.println(sum);
	}
	public static void swap(int x,int y)
	{
		int t=h[x];
		h[x]=h[y];
		h[y]=t;
		
		t=pos[h[x]];
		pos[h[x]]=pos[h[y]];
		pos[h[y]]=t;
	}
	public static void siftdown(int i){
		int t,flag=0;
		while(i*2<=size&&flag==0)
		{
			if(dis[h[i]]>dis[h[i*2]])
			{
				t=i*2;
			}
			else
				t=i;
			if(i*2+1<=size)
			{
				if(dis[h[t]]>dis[h[i*2+1]])
					t=i*2+1;
			}
			if(t!=i)
			{
				swap(t,i);
				i=t;
			}
			else
				flag=1;
		}
	}
	public static void siftup(int i)
	{
		int flag=0;
		if(i==1)
			return;
		while(i!=1&&flag==0)
		{
			if(dis[h[i]]<dis[h[i/2]])
				swap(i,i/2);
			else
				flag=1;
			i=i/2;
		}
	}
	public static int pop(){
		int t;
		t=h[1];
		pos[t]=0;
		h[1]=h[size];
		pos[h[size]]=1;
		size--;
		siftdown(1);
		return t;
	}
}
