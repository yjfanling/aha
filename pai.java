package aha;

public class pai {
	public static void main(String[] args){
		Queue<Integer> q1=new Queue<Integer>();
		Queue<Integer> q2=new Queue<Integer>();
		IniStack<Integer> stack=new IniStack<Integer>();
		int[] book=new int[10];
		int[] qq1={2,4,1,2,5,6};
		int[] qq2={3,1,3,5,6,4};
		for(int i=0;i<qq1.length;i++)
			q1.add(qq1[i]);
		for(int i=0;i<qq1.length;i++)
			q2.add(qq2[i]);
		while(!q1.isEmpty()&&!q2.isEmpty())
		{
			int t=q1.poll();
			if(book[t]==0)
			{
				stack.add(t);
				book[t]=1;
			}else
			{
				q1.add(t);
				while(!stack.isEmpty()&&stack.peek()!=t)
				{
					book[stack.peek()]=0;
					q1.add(stack.poll());
				}
				book[stack.peek()]=0;
				q1.add(stack.poll());
			}
			if(q1.isEmpty())
				break;
			t=q2.poll();
			if(book[t]==0)
			{
				stack.add(t);
				book[t]=1;
			}else
			{
				q2.add(t);
				while(!stack.isEmpty()&&stack.peek()!=t)
				{
					book[stack.peek()]=0;
					q2.add(stack.poll());
				}
				book[stack.peek()]=0;
				q2.add(stack.poll());
			}
			if(q2.isEmpty())
				break;
		}
		if(q2.isEmpty()){
			System.out.println("小哼win\n");
			System.out.print("小哼当前手中的牌：");
			while(!q1.isEmpty()){
				System.out.print(q1.poll()+" ");
			System.out.println();
			if(!stack.isEmpty()){
				System.out.println("桌上的牌为");
				IniStack<Integer> res=new IniStack<Integer>();
				while(!stack.isEmpty())
					res.add(stack.poll());
				while(!res.isEmpty())
					{
						System.out.print(res.poll()+" ");
					}
			}else
				System.out.println("桌上没牌了");
			}
		}else
		{
			System.out.println("小哈win\n");
			System.out.print("小哈当前手中的牌：");
			while(!q2.isEmpty())
				System.out.print(q2.poll()+" ");
				System.out.println();
				if(!stack.isEmpty()){
					System.out.println("桌上的牌为");
					IniStack<Integer> res=new IniStack<Integer>();
					while(!stack.isEmpty())
						res.add(stack.poll());
					while(!res.isEmpty())
						{
							System.out.print(res.poll()+" ");
						}
				}else
					System.out.println("桌上没牌了");
		}
		
	}
}