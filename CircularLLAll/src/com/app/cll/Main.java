package com.app.cll;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
 
		Scanner sc=new Scanner(System.in);
		CircularLinkedList cll=new CircularLinkedList();
		boolean exit=false;
		while(!exit)
		{
			System.out.println(""
					+ "1.Insert the data\n"
					+ "2.Display data\n"
					+ "3.Insert at position\n"
					+ "4.Delete by value\n"
					+ "5.Delete by position\n"
					+ "6.Count number of element\n"
					+ "7.Remove duplicate\n"
					+ "8.Sort by ascending\n"
					+ "9.Sort by descending\n"
					+ "10.Minimum element\n"
					+ "11.Maximum element\n"
					+ "12.Search\n0.Exit");
			
			System.out.println("Enter the choice : ");
			int ch= sc.nextInt();
			switch(ch)
			{
			case 1:
				cll.insert(10);
				cll.insert(20);
				cll.insert(30);
				cll.insert(10);
				break;
			case 2:
				cll.display();
				break;
			case 3:
				cll.insert(25, 3);
				cll.insert(40, 5);
				break;
			case 4:
				cll.deletebyval(30);
				break;
			case 5:
				cll.deleteBypos(4);
				break;
			case 6:
				System.out.println(cll.CountNumberOfElement());  
				break;
			case 7:
				cll.duplicate();
				break;
			case 8:
				cll.SortByAsc();
				break;
			case 9:
				cll.SortByDesc();
				break;
			case 10:
				cll.minimum();
				break;
			case 11:
				cll.maximum();
				break;
			case 12:
				cll.search(20);
				break;
			case 0:
				exit = true;
				break;
				
			}
		}
		
		
		
		cll.display();
	}
	}


