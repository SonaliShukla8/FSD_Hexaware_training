package pojo;

import java.util.Comparator;

public class CustomerComparator implements Comparator<Customer> {

	@Override
	public int compare(Customer o1, Customer o2) {
		String s1=o1.getCustomerName();
		String s2=o2.getCustomerName();
		return s1.compareTo(s2);
	}

}
