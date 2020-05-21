package com.spring.javacontainer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StudentsDataRunner {
	public static void main( String[] args )
    {
	 	Scanner scan=new Scanner(System.in);
		List<StudentsData> students=new ArrayList<StudentsData>();
    	ApplicationContext context = new AnnotationConfigApplicationContext(StudentsJavaContainer.class);
    	
    	//--------------------------------data-----------------------------------------
    	StudentsData student= context.getBean(StudentsData.class);
 		students.add(student);
    	students.get(0).setSid(8001);
    	students.get(0).setName("Sireesha");
    	students.get(0).setCity("Vijayawada");
    	
    	student= context.getBean(StudentsData.class);
 		students.add(student);
    	students.get(1).setSid(8002);
    	students.get(1).setName("Divyaa");
    	students.get(1).setCity("Lucknow");
    	
    	student= context.getBean(StudentsData.class);
 		students.add(student);
    	students.get(2).setSid(8003);
    	students.get(2).setName("Sneha");
    	students.get(2).setCity("Kolkata");
    	
    	student= context.getBean(StudentsData.class);
 		students.add(student);
    	students.get(3).setSid(8004);
    	students.get(3).setName("Chaitra");
    	students.get(3).setCity("Chennai");
    	
    	student= context.getBean(StudentsData.class);
 		students.add(student);
    	students.get(4).setSid(8005);
    	students.get(4).setName("Lekha");
    	students.get(4).setCity("Hyderabad");
    	
    	student= context.getBean(StudentsData.class);
 		students.add(student);
    	students.get(5).setSid(8006);
    	students.get(5).setName("Dhruva");
    	students.get(5).setCity("Indore");
    	
    	student= context.getBean(StudentsData.class);
 		students.add(student);
    	students.get(6).setSid(8007);
    	students.get(6).setName("Lakshmi");
    	students.get(6).setCity("Vizag");
    	
    	student= context.getBean(StudentsData.class);
 		students.add(student);
    	students.get(7).setSid(8008);
    	students.get(7).setName("Jinal");
    	students.get(7).setCity("Surat");
    	
    	student= context.getBean(StudentsData.class);
 		students.add(student);
    	students.get(8).setSid(8009);
    	students.get(8).setName("Krupa");
    	students.get(8).setCity("Ahmedabad");
    	
    	student= context.getBean(StudentsData.class);
 		students.add(student);
    	students.get(9).setSid(8010);
    	students.get(9).setName("Nivetha");
    	students.get(9).setCity("Agra");
    	//-------------------------------------------------------------------------------------------

		try {
			StudentsData getstudent=null;
			System.out.println("Enter id:");
			int inputid=scan.nextInt();
			for(int i=0;i<10;i++)
			{
				if(students.get(i).getSid()==(inputid)) {
					getstudent=students.get(i);
				}
			}
			System.out.println("Details of student with id : "+inputid+"\n"+"Name: "+getstudent.getName()+" "+" City: "+student.getCity());
			getstudent=null;
		}
		catch(Exception e) {
			System.out.println("Invalid id (Id not found)");
			e.printStackTrace();
		}
    }
}
