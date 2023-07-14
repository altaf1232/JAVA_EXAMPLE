package com.object;

public class InitializationByRefrence {

	int id;
	String name;
}
class Test{
	public static void main(String[] args) {
		InitializationByRefrence s1=new InitializationByRefrence();
		s1.id=101;
		s1.name="Altaf Malik";
		System.out.println(s1.id);
		System.out.println(s1.name);
	}
}
