package aha;

import java.util.Scanner;

public class chenshidfs {
	static int min=Integer.MAX_VALUE;
	static int[][] map=new int[6][6];
	static int[] book=new int[6];
	static int n,m;
	static void dfs(int cur,int dis)
	{
		if(dis>min)
			return ;
		if(cur==n)
			if(dis<min)
			{
				min=dis;
				return;
			}
		for(int i=1;i<=n;i++)
		{
			if(map[cur][i]!=999&&book[i]==0)
			{
				book[i]=1;
				dfs(i,dis+map[cur][i]);
				book[i]=0;
			}
		}
		return;		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		m=sc.nextInt();
		for(int i=1;i<=n;i++)
			for(int j=1;j<=n;j++)
				if(i==j)
					map[i][j]=0;
				else
					map[i][j]=999;
		for(int i=1;i<=m;i++)
		{
			int a=sc.nextInt();
			int b=sc.nextInt();
			int d=sc.nextInt();
			map[a][b]=d;
//			map[b][a]=d; /加上这条就是无向图
		}
		book[1]=1;
		dfs(1,0);
		System.out.println(min);
	}

}
