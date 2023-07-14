package com.object;

public class Employee {

	int id;
	String name;
	float salary;
	
	void insert(int id,String name,float salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	void display() {
		System.out.println(id+" "+name+" "+salary);
	}
}
class TestEmployee{
	public static void main(String[] args) {
		Employee e1=new Employee();
		Employee e2=new Employee();
		e1.insert(101, "Altaf", 22000);
		e2.insert(102, "Izhar", 30000);
		e1.display();
		e2.display();
	}
}
