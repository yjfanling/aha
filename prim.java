package aha;

import java.util.Scanner;

public class prim {
	public static void main(String[] args){
		int[][] map=new int[7][7];
		int[] dis=new int[7];
		int[] book=new int[7];
		int count=0;
		int sum=0;
		int inf=Integer.MAX_VALUE;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		for(int i=1;i<=n;i++)
			for(int j=2;j<=n;j++)
				if(i!=j)
					map[i][j]=inf;
		for(int i=1;i<=m;i++)
		{
			int x=sc.nextInt();
			int y=sc.nextInt();
			int d=sc.nextInt();
			map[x][y]=d;
			map[y][x]=d;
		}
		book[1]=1;
		for(int i=2;i<=n;i++)
		{
				dis[i]=map[1][i];
		}
		count++;
		while(count<n)
		{
			int t=0;
			int min=inf;
			for(int i=2;i<=n;i++)
			{
				if(book[i]==0&&dis[i]<min)
				{
					min=dis[i];
					t=i;
				}
			}
			book[t]=1;
			count++;
			sum+=dis[t];
			for(int i=2;i<=n;i++)
			{
				if(book[i]==0&&dis[i]>map[t][i])
					dis[i]=map[t][i];
			}
		}
		System.out.println(sum);
	}
}
