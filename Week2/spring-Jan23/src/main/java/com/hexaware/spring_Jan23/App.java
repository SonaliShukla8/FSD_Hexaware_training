package com.hexaware.spring_Jan23;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.hexaware.spring_Jan23.bean.Users;
import com.hexaware.spring_Jan23.config.AppConfig;
import com.hexaware.spring_Jan23.exception.UserNotFoundException;
import com.hexaware.spring_Jan23.service.IUserService;
import com.hexaware.spring_Jan23.service.UserServiceImp;
/**
 * Hello world!
 *
 */
public class App 
{
	static Scanner scanner = new Scanner(System.in);
    public static void main( String[] args ) throws UserNotFoundException
    {
    	ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		IUserService service = context.getBean(UserServiceImp.class);

		boolean flag = true;
		while (flag) {
			System.out.println("****WELCOME Product Management System ***");
			System.out.println("1. INSERT");
			System.out.println("2. UPDATE");
			System.out.println("3. DELETE");
			System.out.println("4. SELECT BY ID");
			System.out.println("5. SELECT ALL");
			System.out.println("6. EXIT");

			int choice = scanner.nextInt();
			switch (choice) {
			case 1:  
				Users user= readData();

				boolean isInserted = service.createUser(user);

				if (isInserted) {
					System.out.println("Record inserted successfully...");
				} else {

					System.err.println("Insert fail");
				}

				break;
				
			case 2:
				Users updatedUser = readData();

				boolean isUpdated = service.updateUser(updatedUser);

				if (isUpdated) {
					System.out.println("Record Updated successfully...");
				} else {
					throw new UserNotFoundException();
				}

				break;
			case 3:
				System.out.println("Enter User Id");

				int uid = scanner.nextInt();

				boolean isDeleted = service.deleteUserById(uid);

				if (isDeleted) {
					System.out.println("Record Deleted successfully...");
				} else {

					throw new UserNotFoundException();
				}
				break;
			case 4:
				System.out.println("Enter User Id");

				int uid1 = scanner.nextInt();

				Users userFound = service.selectUserById(uid1);

				if (userFound != null) {
					System.out.println(userFound);
				} else {

					throw new UserNotFoundException();
							
				}

				break;
			case 5:
				List<Users>  list =		service.selectAllUsers();
				
				for (Users users : list) {
					
						System.out.println(users);
					
				}
				break;
			case 6:
				flag=false;
				break;
			}
		}

	

		}
	public static Users readData() {

		Users user = new Users();

		System.out.println("Enter User Id");

		user.setUserId(scanner.nextInt());

		System.out.println("Enter User Name");

		user.setUserName(scanner.next());
		System.out.println("Enter User Email");
        user.setEmail(scanner.next());
		System.out.println("Enter User Password");
		user.setPassword(scanner.next());
		System.out.println("Enter UserType");

		user.setUserType(scanner.next());

		return user;
    }
}
