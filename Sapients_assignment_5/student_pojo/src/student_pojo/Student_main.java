package student_pojo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Citycomparator implements Comparator<Student>{

	@Override
	public int compare(Student student1, Student student2) {
		return student1.getCity().compareTo(student2.getCity());
	}
	
}
public class Student_main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter num of students");
		int n=scan.nextInt();
		List<Student> students=new ArrayList<>();
		System.out.println("enter id,name,city in this order");
		for(int i=0;i<n;i++) {
			int id=scan.nextInt();
			String name=scan.next();
			String city=scan.next();
			Student student=new Student();
			student.setId(id);
			student.setName(name);
			student.setCity(city);
			students.add(student);
			student=null;
		}
		for(int i=0;i<n;i++)
			{
			System.out.println("student "+(i+1)+" : "+students.get(i).getId()+" " +students.get(i).getName()+" "+students.get(i).getCity());

			}
		System.out.println("Enter city :");
		String selectcity=scan.next();
		System.out.println("The following are the students from "+selectcity);
		for(int i=0;i<n;i++)
		{
			if(students.get(i).getCity().equals(selectcity))
			{
				System.out.println(students.get(i).getName());
			}
		}
		
		Collections.sort(students);
		
		System.out.println("Name wise sorted list of students:");
		for(int i=0;i<n;i++)
		{
				System.out.println(students.get(i).getName());
		}
		
		Collections.sort(students,new Citycomparator());
		System.out.println("Name wise sorted list of students:");
		for(int i=0;i<n;i++)
		{
				System.out.println(students.get(i).getCity());
		}
		try {
			System.out.println("Enter id:");
			int inputid=scan.nextInt();
			Student student=null;
			for(int i=0;i<n;i++)
			{
				if(students.get(i).getId()==(inputid)) {
					student=students.get(i);
				}
			}
			System.out.println("Details of student with id : "+inputid+"\n"+"Name: "+student.getName()+" "+"City: "+student.getCity());
			student=null;
		}
		catch(Exception e) {
			System.out.println("Invalid id (Id not found)");
		}
		finally {
			System.gc();
		}
	}
}
