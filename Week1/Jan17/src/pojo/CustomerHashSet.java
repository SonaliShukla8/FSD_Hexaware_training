package pojo;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CustomerHashSet {

	public static void main(String[] args) {
		Set<Customer> set=new HashSet<Customer>();
		set.add(new Customer(101,"Vipin Agrawal","vipin23@gmail.com"));
		set.add(new Customer(108,"Priya Singh","priyasingh123@gmail.com"));
		set.add(new Customer(103,"Divya Khatri","dkhatri99@gmail.com"));
		set.add(new Customer(109,"Arya Jain","arya78@gmail.com"));
		set.add(new Customer(105,"Samadh Joshi","sjoshi90@gmail.com"));
		System.out.println(set);
		
		
		Set<Customer> set2=new TreeSet<Customer>(new CustomerComparator());
		set2.add(new Customer(101,"Vipin Agrawal","vipin23@gmail.com"));
		set2.add(new Customer(108,"Priya Singh","priyasingh123@gmail.com"));
		set2.add(new Customer(103,"Divya Khatri","dkhatri99@gmail.com"));
		set2.add(new Customer(109,"Arya Jain","arya78@gmail.com"));
		set2.add(new Customer(105,"Samadh Joshi","sjoshi90@gmail.com"));
	    System.out.println(set2);
	}

}
