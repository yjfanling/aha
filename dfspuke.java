package aha;

public class dfspuke {
	static int[] book=new int[10];
	static int[] a=new int[10];
	static int total=0;
	public static void dfs(int step){
		if(step==10){
			if(a[1]*100+a[2]*10+a[3]+a[4]*100+a[5]*10+a[6]==a[7]*100+a[8]*10+a[9])
			{
				System.out.println((a[1]*100+a[2]*10+a[3])+"+"+(a[4]*100+a[5]*10+a[6])+"="+(a[7]*100+a[8]*10+a[9]));
				total++;
			}
			return;
		}
		for(int i=1;i<=9;i++){
			if(book[i]==0)
			{
				book[i]=1;
				a[step]=i;
				dfs(step+1);
				book[i]=0;
			}
		}
		return;
	}
	public static void main(String[] args){
		dfs(1);
		System.out.println(total/2);
	}
}
