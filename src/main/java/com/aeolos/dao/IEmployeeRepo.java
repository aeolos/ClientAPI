package com.aeolos.dao;

import java.util.List;

import com.aeolos.model.Callback;
import com.aeolos.model.Employee;

public interface IEmployeeRepo {
	
	Employee getEmployee(long id);
	List<Employee> getStoredEmployee();
	Employee save(Employee employee);
	List<Callback> getAllCallbacks();
	Callback getCallback(long id);
	Callback SaveCallback(Callback callback);
	List<Callback> getCallbacksByDateTime(String cbdate, String cbtime);
	String deleteCallback(long id);
	Callback updateCallback(long id, String notes);
}
