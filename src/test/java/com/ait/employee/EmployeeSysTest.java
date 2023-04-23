package com.ait.employee;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.ait.employee.EmployeeSys;



class EmployeeSysTest{
	private EmployeeSys myEmployeeSys;
	
	@BeforeEach
	public void setUp() {
		myEmployeeSys = new EmployeeSys();
	}
	
	@Test //1-1
	void testValidUserLogin() {
		assertEquals(true, myEmployeeSys.login("root", "admin"));
	}
	
	@Test //1-2
	void testUserLoginInvalidUserName() {
		assertEquals(false, myEmployeeSys.login("roots", "admin"));
	}
	
	@Test //1-3
	void testUserLoginInvalidPassword() {
		assertEquals(false, myEmployeeSys.login("root", "admins"));
	}
	
	@Test //2-1
	void testNoEmployeesInSystem() {
		assertEquals(0, myEmployeeSys.getNumberOfEmployees());
	}
	
	@Test //2-2
	void testOneEmployeesInSystem() {
		assertEquals(true, myEmployeeSys.login("root", "admin"));
		Employee employee = new Employee("980MS", "David", 29);
		myEmployeeSys.addEmployee(employee);
		assertEquals(true, myEmployeeSys.addEmployee(employee));
	}
	
	
	  @Test //2-3 
	  void testAddEmployeeUserNotLoggedIn() { assertEquals(true,
	  myEmployeeSys.login("root", "admin")); 
	  Employee employee = new
	  Employee("980MA", "DaviR", 22); 
	  myEmployeeSys.addEmployee(employee);
	  assertEquals(true, myEmployeeSys.addEmployee(employee)); 
	  assertEquals(2, myEmployeeSys.getNumberOfEmployees());
	  }
	 
	
	@Test //2-4
	void testTwoEmployeesInSystem() {
		assertEquals(true, myEmployeeSys.login("root", "admin"));
		Employee employee = new Employee("980MS", "David", 29);
		Employee employeetwo = new Employee("980MM", "Dan", 24);
		myEmployeeSys.addEmployee(employee);
		myEmployeeSys.addEmployee(employeetwo);
		assertEquals(true, myEmployeeSys.addEmployee(employee));
	}
	
	
	  
	  @Test //Test 3-1
		void testUserLogOut() {
		  myEmployeeSys.login("root", "admin");
			assertEquals(true, myEmployeeSys.userLoggedIn);
			Employee employee = new Employee("980MM", "Davie", 33);
			myEmployeeSys.addEmployee(employee);
			myEmployeeSys.logOut();
			assertEquals(false, myEmployeeSys.userLoggedIn);
			assertEquals(1, myEmployeeSys.getNumberOfEmployees());
		}

		@Test //Test 4-1
		void testChangePasswordSuccess() {
			assertTrue(myEmployeeSys.changePassword("admin", "new_password"));
		}

		@Test //Test 4-2
		void testChangePasswordUnSuccess() {
			assertFalse(myEmployeeSys.changePassword("wrong_password", "new_password"));
			

		}
	 
	 
	
	
	
	
}