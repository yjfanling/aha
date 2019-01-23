package aha;

import java.util.Scanner;

public class zhadanDFS {
	static int[][] map=new int[20][20];
	static int[][] book=new int[20][20];
	static int mx,my;
	static int max;
	static int[][] next={{0,1},{1,0},{0,-1},{-1,0}};
	static int n,m;
	public static void dfs(int x,int y)
	{
		if(getNum(x,y)>max)
		{
			max=getNum(x,y);
			mx=x;
			my=y;
		}
		for(int i=0;i<4;i++)
		{
			int tx=x+next[i][0];
			int ty=y+next[i][1];
			if(tx<0||tx>n-1||ty<0||ty>m-1)
				continue;
			if(book[tx][ty]==0&&map[tx][ty]==2)
			{
				book[tx][ty]=1;
				dfs(tx,ty);
			}
		}
		return;
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		m=sc.nextInt();
		int startx=sc.nextInt();
		int starty=sc.nextInt();
		max=getNum(startx,starty);
		mx=startx;
		my=starty;
		book[startx][starty]=1;
		for(int i=0;i<n;i++)
			for(int j=0;j<m;j++)
				map[i][j]=sc.nextInt();
		dfs(startx,starty);
		System.out.println("将炸弹放置在("+mx+","+my+")处，最多可以消灭"+max+"个敌人");
	}
	public static int getNum(int i,int j){
		int x=i,y=j;
		int sum=0;
		while(map[x][y]!=0)
		{
			if(map[x][y]==1)
				sum++;
			x--;
		}
		x=i;
		y=j;
		while(map[x][y]!=0)
		{
			if(map[x][y]==1)
				sum++;
			x++;
		}
		x=i;
		y=j;
		while(map[x][y]!=0)
		{
			if(map[x][y]==1)
				sum++;
			y--;
		}
		x=i;
		y=j;
		while(map[x][y]!=0)
		{
			if(map[x][y]==1)
				sum++;
			y++;
		}
		return sum;
	}
}
