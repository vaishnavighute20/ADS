package com.app.sll;

public class SinglyLinkedList {
	
private Node head;
	
	public SinglyLinkedList()
	{
		head=null;
	}

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}
	
	public boolean insert(int data)
	{
		Node newNode = new Node(data);
		if(newNode == null)
		{
			return false;
		}
		if(head==null)
		{
			head=newNode;
			return true;
		}
		Node temp=head;
		while(temp.getNext() != null)
		{
			
			if(temp.getData() == data)
			{
				return false;
			}
			temp=temp.getNext();
		}
		temp.setNext(newNode);
		return true;
	}
	
	public boolean insert(int pos,int data)
	{
		Node newNode=new Node(data);
		Node temp=head;
		for(int i=1;i<pos-1;i++)
		{
			temp=temp.getNext();
		}
		newNode.setNext(temp.getNext());
		temp.setNext(newNode);
		return true;
	}
	
	public void delete(int pos)
	{
		Node temp=head;
		for(int i=1;i<pos-1;i++)
		{
			temp=temp.getNext();
		}
		temp.setNext(temp.getNext().getNext());
	}
	
	public void CountElement()
	{
		Node temp=head;
		int count=0;
		while(temp !=null)
		{
			count++;
			temp=temp.getNext();
		}
		System.out.println(count);
	}
	
	public void sort()
	{
		Node current=head;
		Node prev=null;
		Node next=head.getNext();
		while(next != null)
		{
			
			if(current.getData()>next.getData())
			{
				int temp=current.getData();
				current.setData(next.getData());
				next.setData(temp);
			}
			prev=current;
			current=next;
			next=next.getNext();
		}
	}
	
	public void SortByDesc()
	{
		boolean swapped;
		do
		{
		 swapped=false;
		Node current=head;
		Node next=head.getNext();
		while(next != null)
		{
			if(current.getData() < next.getData())
			{
				int temp=current.getData();
				current.setData(next.getData());
				next.setData(temp);
				swapped=true;
			}
			
			current=next;
			next=next.getNext();
			
		}
		}while(swapped);
	}
	public void RemoveDuplicate()
	{
		Node temp=head;
		Node next=head;
		while(temp.getNext() != null)
		{
			if(temp.getData() == next.getData())
			{
				temp.setNext(next.getNext());
			}
			next=next.getNext();
			if(next==null)
			{
				temp=temp.getNext();
				next=head;
			}
		}
	}
	
	public void SearchByData(int data)
	{
		Node current=head;
		int count=0;
		while(current != null)
		{
			count++;
			if(current.getData() == data)
			{
				System.out.println(current.getData() + " at position "+count);
				return;
			}
			
			current=current.getNext();
		}
	}
	public void SearchByPos(int pos)
	{
		Node current=head;
		for(int i=1;i<pos-1;i++)
		{
			current=current.getNext();
		}
		System.out.println(current.getData());
	}
	

	public void Maximum()
	{
	Node temp=head;
	int a=temp.getData();
	while (temp.getNext() != null)
	{
	if(a<temp.getData())
	{
	a = temp.getData();
	System.out.println();
	}
	temp=temp.getNext();
	}

	System.out.println(a+ " is Max element");

	}

	public void Minimum()
	{
	Node temp=head;
	int a=temp.getData();
	while (temp.getNext() != null)
	{
	if(a>temp.getData())
	{
	a = temp.getData();
	System.out.println();
	}
	temp=temp.getNext();
	}


	System.out.println(a+ " is Min element");

	}


	public void display()
	{
		Node temp=head;
		while(temp != null)
		{
			System.out.print(temp.getData()+" ");
			temp=temp.getNext();
		}
		System.out.println();
	}


}
