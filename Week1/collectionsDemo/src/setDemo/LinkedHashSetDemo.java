package setDemo;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		 Set<Integer>	set2 =	new LinkedHashSet<Integer>();


	       	set2.add(34); 
	       	set2.add(12);  
	       	set2.add(56); 
	       	set2.add(9);  
            set2.add(67);
            set2.add(0);
	       	System.out.println(set2);


	        for (Integer i : set2) {

	        	System.out.println(i);
			}



		}

	}


