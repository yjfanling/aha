package aha;

public class meiju {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a=new int[10];
		int[] book=new int[10];
		int total=0;
		int sum=0;
		for(a[1]=1;a[1]<=9;a[1]++)
			for(a[2]=1;a[2]<=9;a[2]++)
				for(a[3]=1;a[3]<=9;a[3]++)
					for(a[4]=1;a[4]<=9;a[4]++)
						for(a[5]=1;a[5]<=9;a[5]++)
							for(a[6]=1;a[6]<=9;a[6]++)
								for(a[7]=1;a[7]<=9;a[7]++)
									for(a[8]=1;a[8]<=9;a[8]++)
										for(a[9]=1;a[9]<=9;a[9]++)
										{
											for(int i=0;i<10;i++)
												book[i]=0;
											for(int i=1;i<=9;i++)
												book[a[i]]=1;
											sum=0;
											for(int i=1;i<=9;i++)
												sum+=book[i];
											if(sum==9&&a[1]*100+a[2]*10+a[3]+a[4]*100+a[5]*10+a[6]==a[7]*100+a[8]*10+a[9])
												total++;
										}
		total=total/2;
		System.out.println(total);
	}
} 

