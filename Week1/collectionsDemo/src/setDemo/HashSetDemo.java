package setDemo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set=new HashSet<String>();  
		set.add("Akash");  
		System.out.println(set.add("Neeru"));  
		set.add("Jwala");  
		set.add("Bhumi");  
		set.add("Neeru"); 
		System.out.println(set);
		Iterator<String> itr=set.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  

	}

}
