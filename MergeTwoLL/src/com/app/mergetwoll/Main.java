package com.app.mergetwoll;

public class Main {

	public static void main(String[] args) {
 
		Linkedlist l1=new Linkedlist();
		Linkedlist l2=new Linkedlist();

		
		System.out.println("first list");
		l1.insert(10);
		l1.insert(20);
		l1.insert(30);
		l1.insert(40);
		l1.insert(50);
		l1.display();
		System.out.println();
		System.out.println("second list");
		l2.insert(11);
		l2.insert(21);
		l2.insert(31);
		l2.insert(41);
		l2.insert(51);
		l2.display();
		System.out.println();
		System.out.println("merged list");
 
		Linkedlist.merge(l1, l2);
		

		
		
		
		
		

	}

}
