package com.oracle;

public class Employee {
	
	private int eid;
	private  String ename;
	private double salary;
	
	
	
	public String toString(int x,int y) {
	
		return "";
	}
	
	
	
	public String toString() {
		
		
		return "Employee [eid=" + eid + ", ename=" + ename + ", salary=" + salary + "]";
	}


	public Employee(int eid, String ename, double salary) {
		this();
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
		
	}


	public Employee() {
		 
		 super();
		 
		 System.out.println("Employee() called object created"); 
		 
	 }


	public int getEid() {
		return eid;
	}


	public void setEid(int eid) {
		this.eid = eid;
	}


	public String getEname() {
		return ename;
	}


	public void setEname(String ename) {
		this.ename = ename;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}
	 

	

	 
	 
	 

}
