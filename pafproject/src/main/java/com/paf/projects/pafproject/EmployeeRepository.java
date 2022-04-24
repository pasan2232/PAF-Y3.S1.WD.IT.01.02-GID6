package com.paf.projects.pafproject;

import java.util.ArrayList;
import java.util.list;
import java.sql.*;

public class EmployeeRepository {
	
	
	Connection con=null;
	List<Employee> employees;
	public EmployeeRepository() {
		
		String url="jdbc:mysql://localhost:3606/employeepafproject?serverTimeZone="UTC";
		String username = "root";
		String password= "foxbat25";
		try {
			class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url,username,password);
		} catch (Exception e) {
			System.out.println(e);
		}
				
		
		employees = new ArrayList<>();
		
		Employee e1 = new Employee();
		e1.setName("Chamuiditha");
		e1.setAge(30);
		e1.setEid(101);
		e1.setPosition("Electrical engineer");
		e1.setSalary(200000);
		
		Employee e2 = new Employee();
		e2.setName("Pasindu");
		e1.setAge(31);
		e1.setEid(102);
		e1.setPosition("Manager");
		e1.setSalary(400000);
		
		Employee e3 = new Employee();
		e3.setName("Naveen");
		e1.setAge(51);
		e1.setEid(035);
		e1.setPosition("Director");
		e1.setSalary(800000);
		
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
	}
	
	public List<Employee> getAllEmployee(){
		return employees;
	}
	
	public Employee createEmployee(Employee e1) {
		String insertSql = "INSERT INTO 'employees'('eid','name','age','position','salary') VALUES (?,?,?,?,?) ";
		try {
			PreparedStatement st = con.prepareStatement(insertSql);
			st.setInt(1, e1.eid);
			st.setString(2, e1.name);
			st.setInt(3, e1.age);
			st.setString(4, e1.position);
			st.setInt(5, e1.salary);
			
			st.executeUpdate();
		}catch (Exception e) {
			System.out.println();
			//TODD: handle exception
		}
		
		return e1;
		
		}
		
	}
	

	

}
