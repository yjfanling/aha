package aha;

import java.util.Scanner;

public class Dijkstra {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] map=new int[10][10];
		int inf=Integer.MAX_VALUE;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int[] dis=new int[10];
		int[] book=new int[10];
		for(int i=1;i<=n;i++)
			for(int j=1;j<=m;j++)
			{
				if(i==j)
					map[i][j]=0;
				else
					map[i][j]=inf;
			}
		for(int i=1;i<=m;i++)
		{
			int a=sc.nextInt();
			int b=sc.nextInt();
			int d=sc.nextInt();
			map[a][b]=d;
		}
		for(int i=1;i<=n;i++)
		{
			if(map[1][i]!=0&&map[1][i]!=inf)
				dis[i]=map[1][i];
			else if(map[1][i]==inf)
				dis[i]=inf;
		}
		book[1]=1;
		for(int i=2;i<=n;i++)
		{
			int min=Integer.MAX_VALUE;
			int mindex=0;
			for(int j=2;j<=n;j++)
			{
				if(book[j]==0&&dis[j]<min)
				{
					min=dis[j];
					mindex=j;
				}
			}
			book[mindex]=1;
			for(int j=1;j<=n;j++)
			{
				if(map[mindex][j]!=inf&&book[j]==0&&dis[j]>dis[mindex]+map[mindex][j])
					dis[j]=dis[mindex]+map[mindex][j];
			}
		}
		for(int i=1;i<=n;i++)
			System.out.print(dis[i]+" ");
	}
}
//6 9
//1 2 1
//1 3 12
//2 3 9
//2 4 3
//3 5 5
//4 3 4
//4 5 13
//4 6 15
//5 6 4
