package com.jsp.SpringDemo3_Collection_LIst;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jsp.SpringDemo3_Collection_LIst.POJO.Student;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
       ApplicationContext context=new ClassPathXmlApplicationContext("META-INF/beans.xml");
       Student student1=context.getBean(Student.class);
       System.out.println(student1);
    }
}
