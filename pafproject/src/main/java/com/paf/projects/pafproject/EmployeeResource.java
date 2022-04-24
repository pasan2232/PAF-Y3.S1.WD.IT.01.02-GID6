package com.paf.projects.pafproject;

import java.util.ArrayList;



@Path("/employees")
public class EmployeeResource {
	
	EmployeeRepository er=new  EmployeeRepository();

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Employee> getAllEmployees() {
		
		   return er.getAllEmployees();
		}
	
	    @POST
	    @Path("/employee")
	    @Consume(MediaType.APPLICATION_JSON)
	    public Employee addemployee(Employee e1) {
	    	
	    	
	    	return er.createEmployee(e1);
	    }
	    
	
}
