package aha;

public class huiwen {
	public static void main(String[] args){
		String[] a={"a","h","a","h"};
		IniStack<String> stack=new IniStack<String>();
		for(int i=0;i<a.length;i++)
			stack.add(a[i]);
		boolean flag=true;
		for(int i=0;i<a.length;i++)
		{
			if(stack.poll()!=a[i])
				flag=false;
		}
		if(flag)
			System.out.println("yes");
		else
			System.out.println("no");
		
	}
}
