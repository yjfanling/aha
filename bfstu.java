package aha;

import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

public class bfstu {
	public static void main(String[] args){
		int sum=0;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int[] book=new int[6];
		int[][] map=new int[6][6];
		for(int i=1;i<=n;i++)
			for(int j=1;j<=m;j++)
				if(i==j)
					map[i][j]=0;
				else
					map[i][j]=999;
		for(int i=1;i<=n;i++)
		{
			int a=sc.nextInt();
			int b=sc.nextInt();
			map[a][b]=1;
			map[b][a]=1;
		}
		Queue<Integer> q=new LinkedList<Integer>();
		q.add(1);
		book[1]=1;
		while(!q.isEmpty()){
			int tmp=q.poll();
			System.out.print(tmp+" ");
			for(int i=1;i<=n;i++)
			{
				if(book[i]==0&&map[tmp][i]==1)
				{
					book[i]=1;
					q.add(i);
				}
			}
		}
		
	}
}
