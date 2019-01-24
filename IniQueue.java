package aha;

import org.junit.Test;

public class IniQueue<E> {
	private Object[] array;
	private int size=0;
	private int inicount=0;
	private int increase=0;
	public IniQueue(int inicount){
		this.inicount=inicount;
		array=new Object[inicount];
	}
	public IniQueue(){
		inicount=100;
		increase=10;
		array=new Object[inicount];
	}
	public IniQueue(int inicount,int increase){
		this.inicount=inicount;
		this.increase=increase;
		array=new Object[inicount];
	}
	public void add(E e){
		if(size<inicount)
		{
			array[size]=e;
		}
		else
		{
			Object[] newArray=new Object[inicount+increase];
			for(int i=0;i<size;i++)
				newArray[i]=array[i];
			newArray[size]=e;
			array=newArray;
		}
		size++;
	}
	public E poll()
	{
		if(getsize()==0)
			return null;
		E tmp=(E)array[0];
		for(int i=0;i<size-1;i++)
			array[i]=array[i+1];
		array[size-1]=null;
		size--;
		return tmp;
	}
	public E peek(){
		if(getsize()==0)
			return null;
		return (E)array[0];
	}
	public int getsize()
	{
		return size;
	}
	public boolean isEmpty(){
		return size==0;
	}
	@Test
	public void test(){
		IniQueue<Integer> queue=new IniQueue<Integer>();
		int[] q={6,3,1,7,5,8,9,2,4};
		for(int i=0;i<q.length;i++)
		{
			queue.add(q[i]);
		}
		System.out.print(queue.poll()+"");
		while(!queue.isEmpty())
		{
			queue.add(queue.poll());
			System.out.print(queue.poll()+"");
		}
	}
}
