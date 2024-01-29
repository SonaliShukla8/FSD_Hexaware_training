package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springcore.entities.Address;
import com.springcore.entities.Employees;
import com.springcore.service.IService;
import com.springcore.service.ServiceImp;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	 ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    	Employees emp= context.getBean("emp",Employees.class);
//        Address address=context.getBean(Address.class);
//    	 address.setCity("Hyderabad");
    	
    	emp.setEid(101);
    	emp.setName("king");
//    	emp.setAddress(address);
    	System.out.println(emp);
    	Employees emp2= context.getBean("emp",Employees.class);
    	System.out.println(emp2.getAddress());
    	
    	IService service =	 context.getBean(ServiceImp.class);
		service.getService();

		String name =		context.getBean(String.class);
		System.out.println(name);	
    	
    }
}
