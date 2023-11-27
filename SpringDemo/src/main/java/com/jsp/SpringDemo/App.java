package com.jsp.SpringDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jsp.beans.Student;

public class App 
{
    public static void main( String[] args )
    {
    	System.out.println("Hello World");
       ApplicationContext applicationContext=new ClassPathXmlApplicationContext("META-INF/beans.xml");
       Student student = applicationContext.getBean(Student.class);
       System.out.println(student);
    }
}
