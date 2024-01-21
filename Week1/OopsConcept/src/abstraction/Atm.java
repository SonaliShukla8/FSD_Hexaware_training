package abstraction;

import java.util.Scanner;

public class Atm {

	public static void main(String[] args) {
		System.out.println("*****WELCOME TO ATM******");
		Scanner scanner=new Scanner(System.in);
		
		boolean flag=true;
		while(flag) {
			System.out.println("Enter 1 for withdraw ");
			System.out.println("Enter 2 for deposit ");
			System.out.println("Enter 3 for eit");
			int choice=scanner.nextInt();
		
		switch(choice) {
		case 1:
			break;
		case 2:
			break;
		case 3:
			break;
		}
		}
	}

}
