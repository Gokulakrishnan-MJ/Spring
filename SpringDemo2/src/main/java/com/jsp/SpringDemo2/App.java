package com.jsp.SpringDemo2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jsp.SpringDemo2.beans.Employee;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("META-INF/beans.xml");
		Employee employee = (Employee) applicationContext.getBean("employee3");

		System.out.println(employee.getEmployeeName());
		Employee emp = applicationContext.getBean(Employee.class);
		System.out.println(emp.getEmployeeName());
	}
}

