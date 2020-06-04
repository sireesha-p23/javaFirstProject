package com.sapients.employee;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
public class AddEmployeeTest {
	private AddEmployee emp;
	@Before
	public void setup() {
		emp=new AddEmployee();
	}
	@Test
	public void addEmployee_method_should_add_an_employee_in_list() {
		Employee e1=new Employee();
		e1.setId(8001);
		e1.setName("Siri");
		e1.setCity("Vijayawada");
		emp.addEmployee(e1);
	}
	@Test
	public void getEmployee_should_return_details_of_employee() {
		Employee e1=new Employee();
		e1.setId(8001);
		e1.setName("Siri");
		e1.setCity("Vijayawada");
		emp.addEmployee(e1);
		Employee e2=new Employee();
		e2.setId(8002);
		e2.setName("Divya");
		e2.setCity("Lucknow");
		emp.addEmployee(e2);
		Employee e3=new Employee();
		e3.setId(8003);
		e3.setName("Adhrija");
		e3.setCity("Kolkata");
		emp.addEmployee(e3);
		int id=8001;
		Employee empdetails1=emp.getEmployee(id);
		assertEquals("User [id=8001,name=Siri,city=Vijayawada]",empdetails1.toString());
		id=8002;
		Employee empdetails2=emp.getEmployee(id);
		assertEquals("User [id=8002,name=Divya,city=Lucknow]",empdetails2.toString());
		id=8003;
		Employee empdetails3=emp.getEmployee(id);
		assertNotEquals("User [id=8002,name=Divya,city=Lucknow]",empdetails3.toString());
	}
}
