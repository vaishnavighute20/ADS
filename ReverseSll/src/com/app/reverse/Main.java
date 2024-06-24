package com.app.reverse;

public class Main {

	public static void main(String[] args) {
		
		Linkedlist l1= new Linkedlist();
		l1.insert(10);
		l1.insert(20);
		l1.insert(30);
		l1.insert(40);
		l1.insert(50);
		l1.display();
		
		System.out.println("reverse list");
		l1.reverse();
		l1.display();


		
 
	}

}
