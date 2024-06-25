package com.app.cll;

public class CircularLinkedList {

    private Node head;
	
	public CircularLinkedList()
	{
		head=null;
	}

	public Node getHead() {
		return head;
	}
	
	public boolean insert(int data)
	{
		Node newNode= new Node(data);
		if(newNode == null)
		{
			return false;
		}
		
		if(head == null)
		{
			head=newNode;
			newNode.setNext(head);
			return true;
		}
		
		Node temp=head;
		while(temp.getNext() != head)
		{
//			if(temp.getData() == data)
//			{
//				return false;
//			}
			temp=temp.getNext();
		}
		temp.setNext(newNode);
		newNode.setNext(head);
		return true;
	}
	
	public boolean insert(int data, int pos)
	{
		Node newNode=new Node(data);
		if(newNode == null || pos < 0)
		{
			return false;
		}
		if(pos == 1)
		{
			newNode.setNext(head);
			head=newNode;
			return true;
		}
		Node temp=head;
		for(int i=1;i<pos-1;i++)
		{
//			if(temp.getData() == data)
//			{
//				return false;
//			}
			temp=temp.getNext();
		}
		newNode.setNext(temp.getNext());
		temp.setNext(newNode);
		return true;
	}
	
	public void deletebyval(int data)
	{
		Node temp=head;
		Node prev=null;
		while(temp.getData() != data)
		{
			prev=temp;
			temp=temp.getNext();
		}
		prev.setNext(temp.getNext());
	}
	
	public void deleteBypos(int pos)
	{
		
		Node prev=head;
		Node temp=prev.getNext();
		for(int i=1;i<pos-1;i++)
		{
			prev=temp;
			temp=temp.getNext();
		}
		prev.setNext(temp.getNext());
	}
	
	public int CountNumberOfElement()
	{
		Node temp=head;
		int count=1;
		while(temp.getNext() != head)
		{
			count++;
			temp=temp.getNext();
		}
		return count;
		
	}
		
	public void duplicate()
	{
		if(head==null)
			return;
		Node c=head;
		do {
			Node r=c;
			while(r.getNext()!=head)
			{
				if(r.getNext().getData() == c.getData())
				{
					r.setNext(r.getNext().getNext());
				}
				else
				{
					r=r.getNext();
				}			
			}
			c=c.getNext();
		}while(c!=head);
	}
	
	public void SortByAsc()
	{
		if(head==null || head.getNext() ==head)
		{
			return;
		}
		int temp;
		Node current=head;
		Node index=current;
		do {
			index=current.getNext();
			while(index != head)
			{
				if(current.getData() > index.getData())
				{
					temp=current.getData();
					current.setData(index.getData());
					index.setData(temp);
				}
				index=index.getNext();
			}
			current=current.getNext();
			
		}while(current !=head);
		
	}
	
	public void SortByDesc()
	{
		if(head == null || head.getNext() == head)
		{
			return ;
		}
		int temp;
		Node current=head;
		Node index=current;
		do {
			index=current.getNext();
			while(index.getNext() != head)
			{
				if(current.getData()<index.getData())
				{
					temp=current.getData();
					current.setData(index.getData());
					index.setData(temp);
				}
				index=index.getNext();
			}
			current=current.getNext();
			
		}while(current.getNext()!=head);
	}
	public void minimum()
	{
		if(head==null)
		{
			System.out.println("list is empty");
			return;
		}
		Node cur =head;
		int minVal=head.getData();
		do {
			if(cur.getData()<minVal)
			{
				minVal=cur.getData();
			}
			cur=cur.getNext();
		}
		while(cur !=head);
		System.out.println(minVal);
	}
	
	public void maximum()
	{
		if(head==null)
		{
			System.out.println("List is Empty");
			return;
		}
		Node cur=head;
		int maxval=head.getData();
		do {
			if(cur.getData() > maxval)
			{
				maxval=cur.getData();
			}
			cur=cur.getNext();
		}while(cur != head);
			System.out.println(maxval);
	}
	
	public void search(int data)
	{
		Node temp = head;
		int pos=1;
		do {
			if(temp.getData()==data)
			{
				System.out.println("At index : "+pos);
				return;
			}
			pos++;
			temp=temp.getNext();
		}
		while( temp.getNext() !=head);
		
	}
	public void display()
	{
		Node temp=head;
		if(head == null)
		{
			return;
		}
		do
		{
			System.out.print(temp.getData()+" ");
			temp=temp.getNext();
		}while(temp !=head );
		System.out.println();
	}
}

