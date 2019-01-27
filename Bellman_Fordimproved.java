package aha;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Bellman_Fordimproved {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] dis=new int[6];
		int[] u=new int[8];
		int[] v=new int[8];
		int[] w=new int[8];
		int[] book=new int[6];
		int[] first=new int[6];
		int[] next=new int[8];
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int inf=Integer.MAX_VALUE;
		for(int i=1;i<=n;i++)
			first[i]=-1;
		for(int i=1;i<=m;i++)
		{
			u[i]=sc.nextInt();
			v[i]=sc.nextInt();
			w[i]=sc.nextInt();
			next[i]=first[u[i]];
			first[u[i]]=i;
		}
		for(int i=2;i<=n;i++)
		{
			dis[i]=inf;
		}
		Queue<Integer> q=new LinkedList<Integer>();
		q.add(1);
		book[1]=1;
		while(!q.isEmpty()){
			int k=first[q.peek()];
			while(k!=-1)
			{
				if(dis[v[k]]>dis[u[k]]+w[k])
				{
					dis[v[k]]=dis[u[k]]+w[k];
					if(book[v[k]]==0)
					{
						q.add(v[k]);
						book[v[k]]=1;
					}
				}
				k=next[k];
			}
			book[q.poll()]=0;
		}
		for(int i=1;i<=n;i++)
		{
			System.out.print(dis[i]+" ");
		}
	}
}
//5 7
//1 2 2 
//1 5 20 
//2 3 3
//2 5 7
//3 4 4
//4 5 5
//5 3 6