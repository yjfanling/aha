package aha;

import java.util.Scanner;

public class dfstu {
	static int sum=0;
	static int n,m;
	static int[] book=new int[101];
	static int[][] map=new int[101][101];
	public static void dfs(int cur)
	{
		System.out.print(cur+" ");
		sum++;
		if(sum==n)
			return ;
		int i;
		for( i=1;i<=n;i++)
		{
			if(book[i]==0&&map[cur][i]==1)
			{
				book[i]=1;
				dfs(i);
			}
		}
		return;
	}
	public static void main(String[] args){
		int a,b;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		m=sc.nextInt();
		for(int i=1;i<=n;i++)
			for(int j=1;j<=m;j++)
				if(i==j)
					map[i][j]=0;
				else
					map[i][j]=999;
		for(int i=1;i<=n;i++)
		{
			a=sc.nextInt();
			b=sc.nextInt();
			map[a][b]=1;
			map[b][a]=1;
		}
		book[1]=1;
		dfs(1);
	}
}
