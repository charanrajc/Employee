package com.app.Employee;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client
{
 public static void main(String[] args) 
 {
	ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
	 Object obj=context.getBean("emp");
	 if (obj instanceof Employee) {
		Employee new_name = (Employee) obj;
		System.out.println(new_name);
		
	}
 }
}
