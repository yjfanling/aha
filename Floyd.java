package aha;

import java.util.Scanner;

public class Floyd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] map=new int[10][10];
		int inf=Integer.MAX_VALUE;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
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
		for(int k=1;k<=n;k++)
			for(int i=1;i<=n;i++)
				for(int j=1;j<=m;j++)
				{
					if(map[i][k]<inf&&map[k][j]<inf&&map[i][j]>map[i][k]+map[k][j])
						map[i][j]=map[i][k]+map[k][j];
				}
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
				System.out.print(map[i][j]+" ");
			System.out.println();
		}
		
	}
}
//4 8
//1 2 2
//1 3 6
//1 4 4
//2 3 3
//3 1 7
//3 4 1
//4 1 5
//4 3 12
