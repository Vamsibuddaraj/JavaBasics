package Constructors;

public class Student {
	int age;
	String name;
	
	public Student(int Age,String Name){
		this.age=Age;
		this.name=Name;
	}
	public Student() {
		
	}
	public void Data() {
		System.out.println("Student name is "+name+" and age is "+age);
	}
}
