package com.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentList {

	public static void main(String[] args) {

		
			List<Student>  studentList = new ArrayList<Student>();

		
			studentList.add(new Student(101, "satish", "Java", 9000));
			studentList.add(new Student(102, "raju", "SQL", 10000));
			studentList.add(new Student(103, "tom", "Python", 12000));
			
			for (Student student : studentList) {
			
				System.out.println(student);
				
			}
			
			
			System.out.println("Iterator for Student list");
			
			Iterator<Student>   it =		studentList.iterator();
			
			while (it.hasNext()) {
				Student student =  it.next();
				System.out.println(student);
				
			}
			
			
			
	}

}
