package cursorDemo;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;
import java.util.Set;
import java.util.SortedSet;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;

public class CursorDemo {
	
	ArrayList<Integer> al=new ArrayList<Integer>();
	Vector<Integer> vr=new Vector<Integer>();
	LinkedHashSet<Integer> set=new LinkedHashSet<Integer>( );
	Queue<Integer> queue=new LinkedList<Integer>();
	SortedSet<Integer> st1=new TreeSet<Integer>();
	TreeSet<Integer> ts1=new TreeSet<Integer>();
	Hashtable<Integer, String> ht=new Hashtable<Integer, String>();
	Stack<Integer> stk=new Stack<Integer>();
	Iterator<Integer> itr;
	Enumeration<Integer> enm;
	ListIterator<Integer> lst;
		
	int arr[]= {10,40,20,30,50};
	String str[]= {"A","B","C","D","E"};
	
	public void arrayList_VectorElements()
	{
		System.out.println("Initilise ArrayList using Array");
		
		for (int i = 0; i < arr.length; i++) {
			al.add(arr[i]);
			vr.add(arr[i]);
			ht.put(arr[i], str[i]);
			
		}
		System.out.println("ArrayList Initised");
	}
	
	public void insertElements()
	{
		System.out.println("Insert Elements in collections using collections");
		set.addAll(al);
		queue.addAll(al);
		st1.addAll(al);
		ts1.addAll(al);
		stk.addAll(al);
	}
	
	private void display() {
		System.out.println("Elements of ArrayList are "+al);
		System.out.println("Elements of Vector are "+vr);
		System.out.println("Elements of LinkedHashSet are "+set);
		System.out.println("Elements of LinkedList are "+queue);
		System.out.println("Elements of TreeSet are "+st1);
		System.out.println("Elements of TreeSet are "+ts1);
		System.out.println("Elements of Hashtable are "+ht); 

	}
	
	public void iteratorDisplay()
	{
		System.out.println("Will work on all collections");
		
		System.out.println("Elements of ArrayList are Using Iterator ");
		itr=al.iterator();
		while(itr.hasNext())
		{
			System.out.print(", "+ itr.next());
		}
		System.out.println();
		System.out.println("Elements of Vector are ");
		itr=vr.iterator();
		while(itr.hasNext())
		{
			System.out.print(", "+itr.next());
		}
		System.out.println();
		System.out.println("Elements of LinkedHashSet are Using Iterator");
		itr=set.iterator();
		while(itr.hasNext())
		{
			System.out.print(", "+itr.next());
		}
		System.out.println();
		System.out.println("Elements of LinkedList are Using Iterator ");
		itr=queue.iterator();
		while(itr.hasNext())
		{
			System.out.print(", "+itr.next());
		}
		System.out.println();
		System.out.println("Elements of TreeSet are Using Iterator ");
		itr=st1.iterator();
		while(itr.hasNext())
		{
			System.out.print(", "+itr.next());
		}
		System.out.println();
		System.out.println("Elements of TreeSet are Using Iterator ");
		itr=ts1.iterator();
		while(itr.hasNext())
		{
			System.out.print(", "+itr.next());
		}
		System.out.println();
		
		Set<Integer> valSet=ht.keySet();
		System.out.println("Elements of Hashtable are Using Iterator ");
		itr=valSet.iterator();
		
		while(itr.hasNext())
		{
			int key=itr.next();
			System.out.print("Key is= "+key+", Value is= "+ht.get(key)+",");
		}
		System.out.println();
		
	}

	public void enumratorDisplay()
	{
		enm=stk.elements();
		System.out.println("Elements of Stack are Using Enumarator ");
		
		while(enm.hasMoreElements())
		{
			int Val=enm.nextElement();
			  System.out.print(Val+",");
		}
		System.out.println();
		enm=vr.elements();
		System.out.println("Elements of Vector are Using Enumarator ");
		
		while(enm.hasMoreElements())
		{
			int Val=enm.nextElement();
			  System.out.print("Key : "  + Val);
		}
		System.out.println();
		System.out.println("Elements of Hashtable are Using Enumarator ");
		enm=ht.keys();
		while(enm.hasMoreElements())
		{
			int Val=enm.nextElement();
			  System.out.print("Key : "  + Val+" " 
	                    + "Value is : "  + ht.get(Val)+" ");
		}
		System.out.println();
	}
	public void listiteratorDiplay()
	{
		System.out.println("Elements of ArrayList are Using ListIterator ");
		lst=al.listIterator();
		
		while(lst.hasNext())
		{
			System.out.print(", "+lst.next());
		}
		System.out.println("ArrayList Elements in Reverse Direction");
		while(lst.hasPrevious())
		{
			System.out.print(", "+lst.previous());
		}
		System.out.println();
		
	}
	public static void main(String[] args) {
		CursorDemo cd=new CursorDemo();
		cd.arrayList_VectorElements();
		cd.insertElements();
		cd.display();
		cd.iteratorDisplay();
		cd.enumratorDisplay();
		cd.listiteratorDiplay();
	}

}
