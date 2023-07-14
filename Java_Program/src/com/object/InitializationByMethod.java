package com.object;

public class InitializationByMethod {

	int id;
	String name;
	
	InitializationByMethod(int id,String name){
		this.id=id;
		this.name=name;
	}
	void display() {
		System.out.println(id+ " "+name);
	}
}
class Test1{
	public static void main(String[] args) {
		InitializationByMethod s1=new InitializationByMethod(103,"Sageer Ahmad");
		InitializationByMethod s2=new InitializationByMethod(104,"Mohammad Abrar");
		s1.display();
		s2.display();
	}
}
