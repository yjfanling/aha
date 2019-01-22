package aha;

public class moniList {
	public static void main(String[] args){
		int[] date=new int[11];
		int[] next=new int[11];
		int length=1;
		int[] array={2,3,5,8,9,10,18,26,32};
		date[0]=-1;
		next[0]=1;
		for(int i=1;i<=array.length;i++)
		{
			date[i]=array[i-1];
			length++;
		}
		for(int i=1;i<array.length;i++)
		{
			next[i]=i+1;
		}
		next[length]=0;
		int tmp=6;
		int i=0;
		while(i<length&&date[next[i]]<tmp)
		{
			i++;
		}
		if(i==length)
		{
			date[length]=tmp;
			next[length-1]=length;
			next[length]=0;
		}
		else{
			date[length]=tmp;
			next[length]=next[i];
			next[i]=length;
		}
		int j=0;
		while(date[next[j]]!=-1)
		{
			System.out.print(date[next[j]]+" ");
			j=next[j];
		}
		
	}
}
