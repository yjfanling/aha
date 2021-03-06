package aha;

import java.util.Scanner;

public class baodaotanxianDFS {
	static int[][] map=new int[20][20];
	static int[][] book=new int[20][20];
	static int[][] next={{0,1},{1,0},{0,-1},{-1,0}};
	static int n,m;
	static int sum=1;
	public static void dfs(int x,int y)
	{
		for(int i=0;i<4;i++)
		{
			int tx=x+next[i][0];
			int ty=y+next[i][1];
			if(tx<0||tx>n-1||ty<0||ty>m-1)
				continue;
			if(map[tx][ty]>0&&book[tx][ty]==0)
			{
				sum++;
				book[tx][ty]=1;
				dfs(tx,ty);
			}
		}
		return;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		m=sc.nextInt();
		int startx=sc.nextInt();
		int starty=sc.nextInt();
		for(int i=0;i<n;i++)
			for(int j=0;j<m;j++)
				map[i][j]=sc.nextInt();
		book[startx][starty]=1;
		dfs(startx,starty);
		System.out.println(sum);
	}

}
//10 10 5 7
//1 2 1 0 0 0 0 0 2 3
//3 0 2 0 1 2 1 0 1 2
//4 0 1 0 1 2 3 2 0 1
//3 2 0 0 0 1 2 4 0 0
//0 0 0 0 0 0 1 5 3 0 
//0 1 2 1 0 1 5 4 3 0
//0 1 2 3 1 3 6 2 1 0
//0 0 3 4 8 9 7 5 0 0
//0 0 0 3 7 8 6 0 1 2
//0 0 0 0 0 0 0 0 0 0
