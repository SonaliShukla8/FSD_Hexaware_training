

package listDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for (int i = 1; i <= 5; i++) {
            list.add(i);
            }
        System.out.println(list);
        
        Iterator<Integer> i = list.iterator();
        while(i.hasNext()) {
        	System.out.println(i.next());
        }
        
        for(Integer in :list) {
        	System.out.println(in);
        	
        }
	}

}
