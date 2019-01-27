package aha;

import java.util.Scanner;

public class Testdui {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dui d=new dui();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		d.n=n;
		for(int i=1;i<=n;i++)
		{
			d.a[i]=sc.nextInt();
		}
		d.creat();
//		for(int i=1;i<=n;i++)
//			System.out.print(d.deletemin()+" ");
		d.heapsort();
		for(int i=1;i<=n;i++)
			System.out.print(d.a[i]+" ");
	}

}
//14
//99 5 36 7 22 17 46 12 2 19 25 28 1 92