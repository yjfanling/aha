package aha;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class zhuanjibfs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] map=new int[6][6];
		int[] book=new int[6];
		int min=Integer.MAX_VALUE;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		for(int i=1;i<=m;i++)
		{
			int a=sc.nextInt();
			int b=sc.nextInt();
			map[a][b]=1;
			map[b][a]=1;
		}
		int start=sc.nextInt();
		int end=sc.nextInt();
		Queue<BFSNode> q=new LinkedList<BFSNode>();
		q.add(new BFSNode(start,0));
		book[start]=1;
		while(!q.isEmpty())
		{
			BFSNode tmp=q.poll();
			if(tmp.x==end)
			{
				min=tmp.y;
				break;
			}
			for(int i=1;i<=n;i++)
			{
				if(book[i]==0&&map[tmp.x][i]==1)
				{
					q.add(new BFSNode(i,tmp.y+1));
					book[i]=1;
				}
			}
		}
		System.out.println(min);
	}

}
//5 7 1 5
//1 2
//1 3
//2 3
//2 4
//3 4
//3 5
//4 5