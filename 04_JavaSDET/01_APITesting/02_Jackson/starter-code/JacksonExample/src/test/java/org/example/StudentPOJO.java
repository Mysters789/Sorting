package org.example;

public class StudentPOJO {
	private String name;
	private int age;
	private String[] courses;

//	public StudentPOJO() {
//	}
//
//	public StudentPOJO(String name, int age, String[] courses) {
//		this.name = name;
//		this.age = age;
//		this.courses = courses;
//	}

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

	public String[] getCourses() {
		return courses;
	}

	public void setCourses(String[] courses) {
		this.courses = courses;
	}
}