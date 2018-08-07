package com.cg.ui;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.controller.Controller;
import com.cg.employee.Employee;

public class UI {
	int choice;
	Scanner get=new Scanner(System.in);
	ApplicationContext context=new ClassPathXmlApplicationContext("employee.xml");
	Controller appController=(Controller) context.getBean("controller");
	Employee employee=(Employee) context.getBean("employee");
	public void display()
	{
	 System.out.println("Enter your choice");
	 choice=get.nextInt();
	do {
		switch(choice) {
		case 1:
		{
			
		break;
		}
		}
		
	}
	while(choice!=9);
	}
}

