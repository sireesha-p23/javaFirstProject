package com.sapients.employee;

import java.util.ArrayList;
import java.util.List;


public class AddEmployee {
	List<Employee> empl=new ArrayList<>();
	
	void addEmployee(Employee emp) {
		empl.add(emp);
	}
	Employee getEmployee(int eid) {
		for(Employee e:empl)
		{
			if(e.getId()==eid) {
				return e;
			}
		}
		return null;
	}
}
