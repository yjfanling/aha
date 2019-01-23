package aha;

import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;
public class BFS {
	public static void main(String[] args){
		int n,m;
		Queue<BFSNode> queue=new LinkedList<BFSNode>();
		int[][] a=new int[50][50];
		int[][] book=new int[50][50];
		int[][] next={{0,1},{1,0},{0,-1},{-1,0}};
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		m=sc.nextInt();
		for(int i=0;i<n;i++)
			for(int j=0;j<m;j++)
				a[i][j]=sc.nextInt();
		int startx=sc.nextInt();
		int starty=sc.nextInt();
		int p=sc.nextInt();
		int q=sc.nextInt();
		boolean flag=false;
		queue.add(new BFSNode(startx,starty,0));
		book[startx][starty]=1;
		while(!queue.isEmpty()){
			BFSNode tmp=queue.poll();
			for(int i=0;i<4;i++)
			{
				int tx=tmp.x+next[i][0];
				int ty=tmp.y+next[i][1];
				if(tx<0||tx>n-1||ty<0||ty>m-1)
					continue;
				if(book[tx][ty]==0&&a[tx][ty]==0)
				{
					book[tx][ty]=1;
					queue.add(new BFSNode(tx,ty,tmp.s+1));
				}
				if(tx==p&&ty==q)
				{
					flag=true;
					break;
				}
			}
			if(flag)
				break;
		}
		if(!queue.isEmpty()&&queue.size()!=1)
		{
			queue.poll();
		}
		System.out.println(queue.poll().s);
	}
}

