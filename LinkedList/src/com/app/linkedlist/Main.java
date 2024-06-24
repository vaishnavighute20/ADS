package com.app.linkedlist;

public class Main {

	public static void main(String[] args) {
     LinkedList l1= new LinkedList();
    l1.insert(10);
    l1.insert(20);
    l1.insert(30);
    l1.insert(40);
    l1.display();

    System.out.println("60 added first position");
    l1.insert(60, 1);
    l1.display();
    System.out.println("70 added 4 position");

    l1.insert(70, 4);
    l1.display();
    System.out.println("80 added 8 position");

    l1.insert(80, 8);
    l1.display();
    System.out.println("isinserted or not");
    boolean isInserted =l1.insert(90, 10);
    System.out.println(isInserted);
    l1.display();
    
    System.out.println("reserve list");
    l1.displayReverse();
    
    System.out.println("reverse display");
    l1.displayReverse(l1.getHead());

    System.out.println();
    l1.display();
    System.out.println("reserve list");
    l1.displayReverse();
    l1.display();
    
    System.out.println("delete position 1");
    l1.deleteByPosition(1);
    l1.display();
    System.out.println("delete position 4");

    l1.deleteByPosition(4);
    l1.display();
    System.out.println("delete position 6");

    l1.deleteByPosition(6);
    l1.display();
    System.out.println("delete position 6");

    l1.deleteByPosition(6);
    l1.display();

//    l1.deleteByVal(80);
//    l1.display();
//    l1.deleteByVal(70);
//    l1.display();
//    l1.deleteByVal(60);
//    l1.display();
//    l1.deleteByVal(80);
//    l1.display();
//
//    l1.insert(80, 4);
//    l1.insert(80, 6);
//    l1.display();
//
//    while( l1.deleteByVal(80) );
//
//    l1.display();
    
    
    
    

	}

}
