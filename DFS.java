package aha;

import java.util.Scanner;

public class DFS {
	static int[] book=new int[10];
	static int[] a=new int[10];
	static int n;
	public static  void dfs(int step) {
		if(step==n+1)
		{
			for(int i=1;i<=n;i++)
				System.out.print(a[i]+" ");
			System.out.println();
			return;
		}
		for(int i=1;i<=n;i++)
		{
			if(book[i]==0)
			{
				a[step]=i;
				book[i]=1;
				dfs(step+1);
				book[i]=0;
			}
		}
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		dfs(1);
		
	}

}