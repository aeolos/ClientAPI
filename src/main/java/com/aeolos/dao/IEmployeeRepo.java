package com.aeolos.dao;

import java.util.List;

import com.aeolos.model.Callback;
import com.aeolos.model.Employee;
import com.aeolos.model.Timeslot;

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
	List<Timeslot> getTimeslot(String date);
	String updateTimeSlot(String date, String slot);
	String updateCallbackStatus(Long paramid, String paramstatus);
}
