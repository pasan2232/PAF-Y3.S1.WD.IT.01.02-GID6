package com.paf.projects.pafproject;

public class Employee {

	public String name;
	public int age;
	public int eid;
	public int salary;
	public String position;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	
	@Override
	public String toString() {
		return  "Employee [name="+ name +", age="+ age +", eid=" +eid+", salary="+ salary+", position="+ position+"]";
	}
	
}
