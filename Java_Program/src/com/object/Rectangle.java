package com.object;

public class Rectangle {

	int length;
	int width;
	
	void insert(int l,int w){
		length=l;
		width=w;
	}
		void display() {
			System.out.println(length*width);
		}
}
		class TestRectangle{
			public static void main(String args[]) {
				Rectangle s1=new Rectangle();
				s1.insert(15,5);
				s1.display();
			}
}
