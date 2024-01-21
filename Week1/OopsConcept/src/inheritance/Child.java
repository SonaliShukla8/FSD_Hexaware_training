package inheritance;

public class Child extends Parent{
      int cid=99; 
      public Child() {
    	  super();
    	  System.out.println("Child object created");
      }
      public void m2() {
    	  System.out.println("m2() is called from child...");
      }
      public String toString() {
    	  return "toString() method called.";
      }
      public static void main(String args[]) {
    	  Child c=new Child();
    	  System.out.println(c.toString());
    	  System.out.println(c.cid);
    	 c.m2();
      }
}
