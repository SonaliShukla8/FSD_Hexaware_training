package listDemo;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> al=new LinkedList<String>();  
		al.add("Sonali");  
		al.add("Shivam");  
		al.add("Priya");  
		al.add("Amit");  
		al.add("Payal");
		System.out.println(al);
		Iterator<String> itr=al.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next()); 
		}
		System.out.println("--------Output using List Iterator ----------");
		ListIterator<String> ls=al.listIterator();
		while(ls.hasNext()) {
			System.out.println(ls.next());
		}
		}  

	}


