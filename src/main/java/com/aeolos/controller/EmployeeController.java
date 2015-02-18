package com.aeolos.controller;

import java.util.List;

import javax.ws.rs.GET;  
import javax.ws.rs.Path;  
import javax.ws.rs.PathParam;  
import javax.ws.rs.Produces;  
import javax.ws.rs.core.MediaType;  
import com.aeolos.dao.EmployeeRepo;
import com.aeolos.model.Employee; 
import com.aeolos.service.EmployeeService;

@Path("/employee")  
public class EmployeeController{  
	
	private EmployeeRepo repo = new EmployeeRepo();
	private EmployeeService service = new EmployeeService(repo);
		
    @GET  
    @Produces(MediaType.APPLICATION_JSON)  
    @Path("{id}")  
    public Employee read(@PathParam("id") long id) {   	
    	return service.read(id);
    }  
    
    @GET  
    @Produces(MediaType.APPLICATION_JSON) 
    public List<Employee> store() {  
    	return service.store();
    }
    
    
}
    
