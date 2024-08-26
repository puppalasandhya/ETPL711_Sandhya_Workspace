//copy constructor
package com.evergent.corejava.constructor;

public class Student9 {
	String name;
	int age;
	public Student9(String name ,int age)
	{
		this.name=name;
		this.age=age;
	}
	public Student9(Student9 s)
	{
		this.name=s.name;
		this.age=s.age;
	}
	public void display()
	{
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
	}

	public static void main(String[] args) {
		Student9 student1=new Student9("Bhanu",20);
		Student9 student2=new Student9(student1);
		student1.display();
		student2.display();
		

	}

}