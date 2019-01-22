package aha;

public class IniStack<E> {
	Queue<E> q1;
	Queue<E> q2;
	int size=0;
	public IniStack(int inicount,int increase) {
		q1=new Queue<E>(inicount,increase);
		q2=new Queue<E>(inicount,increase);
	}
	public IniStack(){
		q1=new Queue<E>(100,10);
		q2=new Queue<E>(100,10);
	}
	public void add(E e){
		q1.add(e);
		size++;
	}
	public E poll(){
		if(q1.getsize()==0)
			return null;
		while(q1.getsize()!=1)
		{
			q2.add(q1.poll());
		}
		E tmp=q1.poll();
		while(!q2.isEmpty())
		{
			q1.add(q2.poll());
		}
		size--;
		return tmp;
	}
	public E peek(){
		if(q1.getsize()==0)
			return null;
		while(q1.getsize()!=1)
		{
			q2.add(q1.poll());
		}
		E tmp=q1.peek();
		q2.add(q1.poll());
		while(!q2.isEmpty())
		{
			q1.add(q2.poll());
		}
		return tmp;
	}
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return size==0;
	}
}
