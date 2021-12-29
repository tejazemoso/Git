package com.basicsstrong.oop;

import java.util.ArrayList;
import java.util.List;

class College
{
	String name;
	private List<Teacher> teachers;
	public College(String name,List<Teacher> teachers){
		this.name=name;
		this.teachers=teachers;
	}
	public List<Teacher> getTeachers()
	{
		return teachers;
	}
}
class Teacher{
	String name;
	String subject;
	public Teacher(String name,String sub) {
		this.name=name;
		subject=sub;
	}
	@Override
	public String toString() {
		return "[Teacher : "+name+",Subject : "+subject+"]";
	}
	
}
public class AggregationDemo {

	public static void main(String[] args) {
		List<Teacher> teachers = new ArrayList<Teacher>();
		teachers.add(new Teacher("A","Java"));
		teachers.add(new Teacher("B","Python"));
		
		College college= new College("MyCollege",teachers);
		List<Teacher> col=college.getTeachers();
		System.out.println(col);
	}

}

