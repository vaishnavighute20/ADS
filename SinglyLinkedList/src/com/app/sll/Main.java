package com.app.sll;

import java.util.Scanner;

public class Main
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
LinkedList list=new LinkedList();

list.insertList(8);
list.insertList(1);
list.insertList(2);
list.insertList(5);
list.insertList(7);
list.insertList(4);




do
{
System.out.println();
//System.out.println("a. Add a element in LinkedList");
System.out.println("a. Find the max element.");
System.out.println("b. Find the min element.");
System.out.println("c. Sum of all even elements from LL.");
System.out.println();
System.out.println("Select Any: ");
switch(sc.next())
{
/*
* case "a"://add a element to LL
* System.out.println("Enter the Data to add in LinkedList.");
* list.insertList(sc.nextInt()); break;
*/

case "a"://Find the max element
list.findMax();
break;

case "b"://Find the min element.
list.findMin();
break;

case "c"://Sum of all even elements from LL.
list.calculateSum();
break;
default:
break;

}

}while(true);


}

}




