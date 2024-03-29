package streamapi;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamDemo {
	public static void main(String args[]) 
	{
		Stream stream=Stream.of(10,20,30,40,50);
//		long count =stream.count();
//		System.out.println(count);
		Comparator<Integer> comparator = (i1,i2)->{return i1.toString().compareTo(i2.toString());};
		Optional<Integer> optional= stream.max(comparator);
		if(optional.isPresent()) {
			System.out.println(optional.get());
		}
			}

}
