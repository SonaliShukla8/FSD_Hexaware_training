package threads;

public class Mutlithread {

	public static void main(String[] args) {
		  int n = 8; 
	      for (int i = 0; i < n; i++) {
	           Thread obj= new Thread(new Demo2());
	           obj.start();
	      }

	}

}
