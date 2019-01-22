package aha;

public class insertTest {
	public static void main(String[] args){
		int[] a={2,3,5,8,9,10,18,26,32};
		List res=new List(-1);
		List t=res;
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
		System.out.println();
		for(int i=0;i<a.length;i++)
		{
			t.next=new List(a[i]);
			t=t.next;
		}
		t=res;
		int tmp=6;
		while(t.next!=null&&t.next.val<tmp)
		{
			t=t.next;
		}
		if(t.next==null)
			t.next=new List(tmp);
		else
		{
			List m=new List(tmp);
			m.next=t.next;
			t.next=m;
		}
		t=res.next;
		while(t!=null)
		{
			System.out.print(t.val+" ");
			t=t.next;
		}
			
	}
}
