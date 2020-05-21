package com.spring.student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class StudentDataRunner {
	 public static void main( String[] args )
	    {
		 	Scanner scan=new Scanner(System.in);
			List<StudentData> students=new ArrayList<StudentData>();
	    	ApplicationContext factory = new ClassPathXmlApplicationContext("spring.xml");
	    	for(int i=0;i<10;i++)
	    	{
		    	 StudentData student= (StudentData)factory.getBean("student"+i);
	    		students.add(student);
	    	}
			try {
				System.out.println("Enter id:");
				int inputid=scan.nextInt();
				StudentData student=null;
				for(int i=0;i<10;i++)
				{
					if(students.get(i).getSid()==(inputid)) {
						student=students.get(i);
					}
				}
				System.out.println("Details of student with id : "+inputid+"\n"+"Name: "+student.getName()+" "+" City: "+student.getCity());
				student=null;
			}
			catch(Exception e) {
				System.out.println("Invalid id (Id not found)");
				e.printStackTrace();
			}
	    }
}
