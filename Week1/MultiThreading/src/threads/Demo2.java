package threads;

public class Demo2 implements Runnable {

	public void run() {
		try {     
	         System.out.println("Thread " + Thread.currentThread().getId()+ " is running By Java");
	      }
	      catch (Exception e) {              
	         System.out.println("Exception is caught here");
	      }
		
	}

}
