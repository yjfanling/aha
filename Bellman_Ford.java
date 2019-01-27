package aha;

import java.util.Scanner;

public class Bellman_Ford {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] dis=new int[10];
		int[] u=new int[10];
		int[] v=new int[10];
		int[] w=new int[10];
		int inf=Integer.MAX_VALUE;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		for(int i=1;i<=m;i++)
		{
			u[i]=sc.nextInt();
			v[i]=sc.nextInt();
			w[i]=sc.nextInt();
		}
		for(int i=2;i<=n;i++)
			dis[i]=inf;
		for(int j=1;j<n;j++)
		{
			int check=0;
			for(int i=1;i<=m;i++)
			{
				if(dis[u[i]]!=inf&&dis[v[i]]>dis[u[i]]+w[i])
				{
					dis[v[i]]=dis[u[i]]+w[i];
					check=1;
				}
			}
			if(check==0)
				break;
		}
		int flag=0;
		for(int i=1;i<=m;i++)
		{
			if(dis[v[i]]>dis[u[i]]+w[i])
				flag=1;
		}
		if(flag==1)
			System.out.println("此图含有负权回路");
		for(int i=1;i<=n;i++)
			System.out.println(dis[i]);
	}
	

}
