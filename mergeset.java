package aha;

import java.util.Scanner;

public class mergeset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] f=new int[1001];
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		for(int i=0;i<=n;i++)
			f[i]=i;
		for(int i=1;i<=m;i++)
		{
			int u=sc.nextInt();
			int v=sc.nextInt();
			int t=getf(f,u);
			int p=getf(f,v);
			if(t!=p)
			{
				f[p]=t;
			}
		}
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			if(f[i]==i)
				sum++;
		}
		System.out.println("ÓÐ"+sum+"¸ö·¸×ïÍÅ»ï");
	}

	private static int getf(int[] f, int u) {
		// TODO Auto-generated method stub
		if(f[u]==u)
			return u;
		else
		{
			f[u]=getf(f,f[u]);
			return f[u];
		}
	}
	
}
