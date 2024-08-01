package com.demo;

public class Student { // POJO  or Entity class
	
	
	private int sid;
	private String sname;
	private  String course;
	private  double fee;
	public Student(int sid, String sname, String course, double fee) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.course = course;
		this.fee = fee;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", course=" + course + ", fee=" + fee + "]";
	}
	
	
	
	
	

}
