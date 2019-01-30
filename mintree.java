package aha;

import java.util.Scanner;

public class mintree {
	 public static void main(String[] args)
	 {
		 int[] f=new int[1001];
		 eadge[] e=new eadge[1001];
		 int count=0,sum=0;;
		 Scanner sc=new Scanner(System.in);
		 int n=sc.nextInt();
		 int m=sc.nextInt();
		 for(int i=1;i<=m;i++)
		 {
			 e[i]=new eadge();
			 e[i].u=sc.nextInt();
			 e[i].v=sc.nextInt();
			 e[i].w=sc.nextInt();
		 }
		 quicksort(e,1,m);
		 for(int i=1;i<=n;i++)
		 {
			 f[i]=i;
		 }
		 for(int i=1;i<=m;i++)
		 {
			 if(merge(f,e[i].u,e[i].v))
			 {
				 count++;
				 sum+=e[i].w;
			 }
			 if(count==n-1)
				 break;
		 }
		 System.out.println(sum);
	 }

	private static boolean merge(int[] f, int u, int v) {
		// TODO Auto-generated method stub
		 int q=getf(f,u);
		 int p=getf(f,v);
		 if(q!=p)
		 {
			 f[p]=q;
			 return true;
		 }
		return false;
	}

	private static int getf(int[] f, int u) {
		// TODO Auto-generated method stub
		if(f[u]==u)
			return u;
		else
		{
			f[u]=getf(f,f[u]);
			return f[u];
		}
	}

	private static void quicksort(eadge[] e, int i, int j) {
		// TODO Auto-generated method stub
		int left=i;
		int right=j;
		if(left>right)
			return;
		while(left!=right)
		{
			
			while(left<right&&e[left].w<=e[i].w)
				left++;
			while(left<right&&e[right].w>=e[i].w)
				right--;
			if(left<right)
			{
				eadge t=e[left];
				e[left]=e[right];
				e[right]=t;
			}
		}
		eadge tmp=e[i];
		e[i]=e[left];
		e[left]=tmp;
		quicksort(e,i,left-1);
		quicksort(e, left+1, j);
	}
}
