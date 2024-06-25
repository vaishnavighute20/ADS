package com.app.sll;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
 
		
		SinglyLinkedList sll=new SinglyLinkedList();
		Scanner sc=new Scanner(System.in);
		boolean exit=false;
		while(!exit)
		{
			System.out.println(""
					+ "1.data in the list\n"
					+ "2.Display the data\n"
					+ "3.Delete the data\n"
					+ "4.Count number of node in list\n"
					+ "5.Sort the data\n"
					+ "6.Remove the duplicates\n"
					+ "7.Sort by descending order\n"
					+ "8.Search by data\n"
					+ "9.Search by position\n"
					+ "10.Maximum element of list\n"
					+ "11.Minimum element of list\n0.Exit");
			System.out.println("Enter the choice : ");
			int ch= sc.nextInt();
			switch(ch)
			{
			case 1:
				sll.insert(50);
				System.out.println(sll.insert(10));    
				System.out.println(sll.insert(20));   
				sll.insert(30);
				sll.insert(40);
				sll.insert(3, 25);
				System.out.println(sll.insert(4, 25));
				break;
				
			case 2:
				System.out.println("Data in the list is : ");
				sll.display();
				break;
				
			case 3:
				System.out.println("Enter the position : ");
				int pos=sc.nextInt();
				sll.delete(pos);
				break;
		
			case 4:
				sll.CountElement();
				break;
		
			case 5:
				sll.sort();
				break;
			
			case 6:
				sll.RemoveDuplicate();
				break;
		
			case 7:
				sll.SortByDesc();
				break;
	
			case 8:
				sll.SearchByData(30);
				break;
		
			case 9:
				sll.SearchByPos(4);
				break;
		
			case 10:
				sll.Maximum();
				break;
		
			case 11:
				sll.Minimum();
				break;
		
			case 0:
					exit = true;
					break;
					
			}
		}

	}

}
