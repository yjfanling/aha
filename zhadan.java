package aha;

import java.util.Scanner;

public class zhadan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[][] map=new int[13][13];
		int sum=0;
		int max=Integer.MIN_VALUE;
		int p=0,q=0;
		for(int i=0;i<13;i++)
			for(int j=0;j<13;j++)
				map[i][j]=sc.nextInt();
		for(int i=1;i<12;i++)
		{
			for(int j=1;j<12;j++)
			{
				if(map[i][j]==2)
				{
					sum=0;
					int x=i,y=j;
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
				}
				if(max<sum)
				{
					max=sum;
					p=i;
					q=j;
				}
			}
		}
		System.out.print("将炸弹放置在("+p+","+q+")最多可消灭"+max+"个敌人");
	}
}
//0 0 0 0 0 0 0 0 0 0 0 0 0 
//0 1 1 2 1 1 1 0 1 1 1 2 0 
//0 0 0 2 0 1 0 1 0 1 0 1 0 
//0 2 2 2 2 2 2 2 0 2 2 1 0 
//0 1 0 2 0 0 0 2 0 1 0 1 0 
//0 1 1 2 1 1 1 2 0 2 1 1 0 
//0 1 0 2 0 1 0 2 0 2 0 0 0 
//0 0 1 2 2 2 1 2 2 2 2 2 0 
//0 1 0 2 0 1 0 0 0 2 0 1 0 
//0 2 2 2 1 0 1 1 1 2 1 1 0 
//0 1 0 2 0 1 0 1 0 2 0 1 0 
//0 1 1 2 1 1 1 0 1 2 1 1 0 
//0 0 0 0 0 0 0 0 0 0 0 0 0
