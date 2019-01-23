package aha;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class baodaotanxianBFS {
	static int[][] map=new int[20][20];
	public static void main(String[] args){
		Queue<BFSNode> q=new LinkedList<BFSNode>();
		int[][] book=new int[20][20];
		int[][] next={{0,1},{1,0},{0,-1},{-1,0}};
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int startx=sc.nextInt();
		int starty=sc.nextInt();
		int sum=0;
		for(int i=0;i<n;i++)
			for(int j=0;j<m;j++)
				map[i][j]=sc.nextInt();
		q.add(new BFSNode(startx,starty,0));
		sum++;
		book[startx][starty]=1;
		while(!q.isEmpty())
		{
			BFSNode tmp=q.poll();
			for(int i=0;i<4;i++)
			{
				int x=tmp.x+next[i][0];
				int y=tmp.y+next[i][1];
				if(x<0||x>n-1||y<0||y>m-1)
					continue;
				if(book[x][y]==0&&map[x][y]>0)
				{
					book[x][y]=1;
					q.add(new BFSNode(x,y,0));
					sum++;
				}
				
			}
		}
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