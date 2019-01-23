package aha;

import java.util.Scanner;

public class jiejiu {
	static int[][] book=new int[50][50];
	static int[][] a=new int[50][50];
	static int p,q;
	static int n,m;
	static int min=Integer.MAX_VALUE;
	static int[][] next={{0,1},{1,0},{0,-1},{-1,0}};
	public static void dfs(int x,int y,int step){
		int tx,ty;
		if(x==p&&y==q)
		{
			if(step<min)
				min=step;
			return;
		}
		for(int i=0;i<4;i++)
		{
			tx=x+next[i][0];
			ty=y+next[i][1];
			if(tx<0||tx>n-1||ty<0||ty>m-1)
				continue;
			if(a[tx][ty]==0&&book[tx][ty]==0)
			{
				book[tx][ty]=1;
				dfs(tx,ty,step+1);
				book[tx][ty]=0;
			}
		}
		return;
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		m=sc.nextInt();
		for(int i=0;i<n;i++)
			for(int j=0;j<m;j++)
				a[i][j]=sc.nextInt();
		int startx=sc.nextInt();
		int starty=sc.nextInt();
		p=sc.nextInt();
		q=sc.nextInt();
		dfs(startx,starty,0);
		System.out.println(min);
	}
}	