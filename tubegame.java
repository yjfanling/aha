package aha;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class tubegame {
	static int[][] map=new int[20][20];
	static int[][] book=new int[20][20];
	static int n,m;
	static Queue<BFSNode> q=new LinkedList<BFSNode>();
	public static void dfs(int x,int y,int front)
	{
		if(x==n-1&&y==m)
		{
			while(!q.isEmpty())
			{
				System.out.print("("+q.peek().x+","+q.poll().y+")");
			}
			return;
		}
		if(x<0||x>n-1||y<0||y>m-1){
			return;
		}
		if(book[x][y]==1)
			return ;
		book[x][y]=1;
		q.add(new BFSNode(x,y));
		if(map[x][y]>4)
		{
			if(front==1)
				dfs(x,y+1,1);
			else if(front==2)
				dfs(x+1,y,2);
			else if(front==3)
				dfs(x,y-1,3);
			else if(front==4)
				dfs(x-1,y,4);
		}
		else if(map[x][y]>0&&map[x][y]<5)
		{
			if(front==1)
			{
				dfs(x+1,y,2);
				dfs(x-1,y,4);
			}
			else if(front==2)
			{
				dfs(x,y+1,1);
				dfs(x,y-1,3);
			}
			else if(front==3)
			{
				dfs(x-1,y,4);
				dfs(x+1,y,2);
			}
			else if(front==4)
			{
				dfs(x,y+1,1);
				dfs(x,y-1,3);
			}
		}
		book[x][y]=0;
		q.poll();
		return;
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		m=sc.nextInt();
		int startx=sc.nextInt();
		int starty=sc.nextInt();
		for(int i=0;i<n;i++)
			for(int j=0;j<m;j++)
				map[i][j]=sc.nextInt();
		dfs(startx,starty,1);
	}

}
