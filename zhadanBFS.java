package aha;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class zhadanBFS {
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
		for(int i=0;i<n;i++)
			for(int j=0;j<m;j++)
				map[i][j]=sc.nextInt();
		q.add(new BFSNode(startx,starty,getNum(startx,starty)));
		book[startx][starty]=1;
		BFSNode maxNode=new BFSNode(startx,starty,getNum(startx,starty));
		while(!q.isEmpty())
		{
			BFSNode tmp=q.poll();
			for(int i=0;i<4;i++)
			{
				int tx=tmp.x+next[i][0];
				int ty=tmp.y+next[i][1];
				if(tx<0||tx>n-1||ty<0||ty>m-1)
					continue;
				if(book[tx][ty]==0&&map[tx][ty]==2)
				{
					book[tx][ty]=1;
					q.add(new BFSNode(tx,ty,getNum(tx,ty)));
					if(getNum(tx,ty)>maxNode.s)
						maxNode=new BFSNode(tx,ty,getNum(tx,ty));
				}
			}
		}
		System.out.println("将炸弹放置在("+maxNode.x+","+maxNode.y+")处，最多可以消灭"+maxNode.s+"个敌人");
	}
	public static int getNum(int i,int j){
		int x=i,y=j;
		int sum=0;
		while(map[x][y]!=0)
		{
			if(map[x][y]==1)
				sum++;
			x--;
		}
		x=i;
		y=j;
		while(map[x][y]!=0)
		{
			if(map[x][y]==1)
				sum++;
			x++;
		}
		x=i;
		y=j;
		while(map[x][y]!=0)
		{
			if(map[x][y]==1)
				sum++;
			y--;
		}
		x=i;
		y=j;
		while(map[x][y]!=0)
		{
			if(map[x][y]==1)
				sum++;
			y++;
		}
		return sum;
	}
}
//13 13 3 3
//0 0 0 0 0 0 0 0 0 0 0 0 0 
//0 1 1 2 1 1 1 0 1 1 1 2 0 
//0 0 0 2 0 1 0 1 0 1 0 1 0 
//0 2 2 2 2 2 2 2 0 2 2 1 0 
//0 1 0 2 0 0 0 2 0 1 0 1 0 
//0 1 1 2 1 1 1 2 0 2 1 1 0 
//0 1 0 2 0 1 0 2 0 2 0 2 0
//0 0 1 2 2 2 1 2 2 2 2 2 0 
//0 1 0 2 0 1 0 0 0 2 0 1 0 
//0 2 2 2 1 0 1 1 1 2 1 1 0 
//0 1 0 2 0 1 0 1 0 2 0 1 0 
//0 1 1 2 1 1 1 0 1 2 1 1 0 
//0 0 0 0 0 0 0 0 0 0 0 0 0
