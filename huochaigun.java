package aha;

import java.util.Scanner;

import org.junit.Test;

public class huochaigun {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int count=0;
		for(int a=0;a<=1111;a++)
		{
			for(int b=0;b<=1111;b++)
			{
				if(count(a)+count(b)+count(a+b)==m-4)
				{
					System.out.println(a+"+"+b+"="+(a+b));
					count++;
				}
			}
		}
		System.out.println("一共可以拼出"+count+"个不同的等式");
	}
	public static int count(int x)
	{
		int[] f={6,2,5,5,4,5,6,3,7,6};
		int num=0;
		while(x/10!=0)
		{
			num+=f[x%10];
			x=x/10;
		}
		num+=f[x];
		return num;
	}
	@Test
	public void test(){
		System.out.println(count(52));
	}
}
