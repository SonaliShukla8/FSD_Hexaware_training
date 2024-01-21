package functional_interface;

public class Demo {
 public static void main(String args[]) {
	 //LAMBDA 
	 MyInterface mi=(int a,int b)->{return  a+b;};
	    System.out.println(mi.add(5,5));
 }
}
