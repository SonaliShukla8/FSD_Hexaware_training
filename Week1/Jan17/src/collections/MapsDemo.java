package collections;



import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapsDemo {

	public static void main(String[] args) {
		Map<String, Integer>empSal = new HashMap<String, Integer>(10, 0.5f);
		empSal.put("Ramesh", 10000);
		empSal.put("Suresh", 20000);
		empSal.put("Mahesh", 30000);
		empSal.put("Naresh", 1000);
		empSal.put("Nainesh", 15000);
		empSal.put("Rakesh", 10000); // Duplicate Value also allowed but Keys should not be duplicate
		empSal.put("Nilesh", null); //values can also be null
		System.out.println("Original Map: "+ empSal);
		empSal.put("Rohit", 23000);
		empSal.remove("Nilesh");
		System.out.println("Updated Map: "+empSal);
		System.out.println(empSal.keySet());
		System.out.println(empSal.values());
		
		
		
		
		Map<String, Integer> tMap = new TreeMap<String, Integer>();
		tMap.put("Orange", 12);
		tMap.put("Apple", 25);
		tMap.put("Mango", 45);
		tMap.put("Chicku", 10);
		tMap.put("Banana", 4);
		tMap.put("Strawberry", 90);
		System.out.println("Sorted Fruit by Name: "+tMap);
		tMap.put("Pinapple", 87);
		tMap.remove("Chicku");
		System.out.println("Updated Sorted Fruit by Name: "+tMap);
		
		
		
		Map<Integer, String> lmap = new LinkedHashMap<Integer, String>();
		lmap.put(1, "Ananya");
		lmap.put(2, "Arpit");
		lmap.put(3, "Bani");
		lmap.put(4, "Danish");
		lmap.put(5, "Gayatri");
		System.out.println("LinkedHashMap before modification" + lmap);
		System.out.println("Is Employee ID 12 exists: " +lmap.containsKey(12));
		System.out.println("Is Employee name Arpit Exists: "+lmap.containsValue("Arpit"));
		System.out.println("Total number of employees: "+ lmap.size());
		System.out.println("Removing Employee with ID 5: " + lmap.remove(5));
		System.out.println("Removing Employee with ID 6 (which does not exist): " + lmap.remove(6));
		System.out.println("LinkedHashMap After modification" + lmap);
	}
		

	}


