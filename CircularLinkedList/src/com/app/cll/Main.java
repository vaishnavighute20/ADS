package com.app.cll;

public class Main {

	public static void main(String[] args) {
 
		CircularLinkedList cll=new CircularLinkedList();
         
		cll.insert(10);
		cll.insert(20);
		cll.insert(30);
		cll.insert(40);
		cll.insert(50);
		System.out.println("list of cll");
		cll.display();
		
		System.out.println("insert 60 at 1st position");
		cll.insert(60, 1);
		cll.display();

		System.out.println("insert 70 at 3rd position");
		cll.insert(70, 3);
		cll.display();

		System.out.println("insert 80 at 9th position");
		cll.insert(80, 9);
		cll.display();

		System.out.println("insert 90 at 8 position");
		cll.insert(90, 8);
		cll.display();
//	
//		// delete by value
//		System.out.println("40 delete");
//		cll.deleteByValue(40);
//		cll.display();
//		
//
//		System.out.println("10 delete");
//		cll.deleteByValue(10);
//		cll.display();
//		
//		
		  System.out.println("delete by positiion");
	     	cll.deleteByposition(1);
		    cll.display();
		     
		    cll.deleteByposition(2);
		    cll.display();



	}

}
