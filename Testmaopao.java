package aha;
public class Testmaopao {
	String Name=null;
	int Goal=0;
	public Testmaopao(String Name,int Goal)
	{
		this.Name=Name;
		this.Goal=Goal;
	}
	public static void main(String[] args){
		Testmaopao[] test=new Testmaopao[5];
		String[] name={"huhu","haha","xixi","hengheng","gaoshou"};
		int[] goal={5,3,5,2,8};
		for(int i=0;i<name.length;i++)
		{
			test[i]=new Testmaopao(name[i],goal[i]);
		}
		for(int i=1;i<test.length;i++)
		{
			for(int j=0;j<test.length-i;j++)
			{
				if(test[j].Goal<test[j+1].Goal)
				{
					Testmaopao tmp=test[j];
					test[j]=test[j+1];
					test[j+1]=tmp;
				}
			}
		}
		for(int i=0;i<test.length;i++)
			System.out.print(test[i].Name+" ");
	}
}
