package com.app.sll;

public class Node
{

private int data;
private Node next;


 

// getter and setter
public int getData() {
return data;
}

public Node(int data) {
	super();
	this.data = data;
	this.next = null;
}

public void setData(int data) {
this.data = data;
}

public Node getNext() {
return next;
}

public void setNext(Node next) {
this.next = next;
}

@Override
public String toString() {
return data + "->" + next;
}
}


	 

	 
 
	
	
	
	

