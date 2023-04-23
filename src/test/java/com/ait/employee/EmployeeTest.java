package com.ait.employee;

import static org.junit.jupiter.api.Assertions.*;



import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.ait.employee.Employee;

class EmployeeTest{
	private Employee employee;
	
	@BeforeEach
	public void setUp(){
		employee = new Employee("654DR", "Daniel", 25);
	}
	
	@Test
	void testEmployeeConstructor() {
		assertEquals("654DR", employee.getPpsNumber());
		assertEquals("Daniel", employee.getName());
		assertEquals(25, employee.getAge());
	}
	
	@Test
	void testEmployeeChange() {
		employee.setName("Roads");
		assertEquals("Roads", employee.getName());
	}
	
	@Test
	void testPpsnumChange() {
		employee.setPpsNumber("765RE");;
		assertEquals("765RE", employee.getPpsNumber());
	}
	
	@Test
	void testAgeChange() {
		employee.setAge(23);
		assertEquals(23, employee.getAge());
	}
	
	
	
}