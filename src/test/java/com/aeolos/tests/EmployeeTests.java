package com.aeolos.tests;
import static org.junit.Assert.assertEquals;

import java.util.LinkedList;
import java.util.List;
import org.junit.Test;
import org.mockito.Mockito;
import com.aeolos.dao.EmployeeRepo;
import com.aeolos.model.Employee;
import com.aeolos.service.EmployeeService;

public class EmployeeTests {
	
	EmployeeRepo repo = Mockito.mock(EmployeeRepo.class);
	EmployeeService service = new EmployeeService(repo);
	
	public EmployeeTests() {
		List<Employee> employeeTestList = new LinkedList<>();
		Employee testEmployeeA = new Employee();
		Employee testEmployeeB = new Employee();
		testEmployeeA.setId(11);
	    testEmployeeA.setFirstName("Jimmy");
	    testEmployeeA.setLastName("Hennessy");
		testEmployeeB.setId(12);
	    testEmployeeB.setFirstName("Mags");
	    testEmployeeB.setLastName("Hennessy");
		employeeTestList.add(testEmployeeA);
		employeeTestList.add(testEmployeeB);
		Mockito.when(service.store()).thenReturn(employeeTestList);
		Mockito.when(service.read(11)).thenReturn(testEmployeeA);
	}
		
	@Test
	public void TestGetAllEmployees() {	
		List<Employee> employeeList = new LinkedList<>();
		employeeList = service.store();
		assertEquals(employeeList.size(),2);	
	}
	
	@Test
	public void TestGetEmployeeByID() {	
		Employee testEmployee = new Employee();
		testEmployee = service.read(11);
		assertEquals(testEmployee.getFirstName(),"Jimmy");	
	}

	
}
