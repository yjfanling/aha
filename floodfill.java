package aha;

import java.util.Scanner;

public class floodfill {
	static int[][] map=new int[20][20];
	static int[][] book=new int[20][20];
	static int[][] next={{0,1},{1,0},{0,-1},{-1,0}};
	static int n,m;
	static int color=0;
	public static void dfs(int x,int y,int c)
	{
		for(int i=0;i<4;i++)
		{
			int tx=x+next[i][0];
			int ty=y+next[i][1];
			if(tx<0||tx>n-1||ty<0||ty>m-1)
				continue;
			if(map[tx][ty]>0&&book[tx][ty]==0)
			{
				book[tx][ty]=1;
				map[tx][ty]=c;
				dfs(tx,ty,color);
			}
		}
		return;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		m=sc.nextInt();
		for(int i=0;i<n;i++)
			for(int j=0;j<m;j++)
				map[i][j]=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				if(book[i][j]==0&&map[i][j]>0)
				{
					color--;
					book[i][j]=1;
					map[i][j]=color;
					dfs(i,j,color);
				}
			}
		}
		System.out.println("一共有"+Math.abs(color)+"个小岛");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(map[i][j]<0)
					System.out.print("   "+map[i][j]);
				else
					System.out.print("    "+map[i][j]);
			
			}
			System.out.println();
		}
	}
}
