package com.app.sll;


public class LinkedList {
private Node head;

public LinkedList() {
this.head = null;
}

public boolean insertList(int data) {
Node newNode = new Node(data);

//check if newNode is null then terminate this condition
if(newNode==null)
{
System.out.println("New Node is Null");

return false;
}


if (head == null) {
head = newNode;
System.out.println("Head->" + head);
return true;
}
//if head is not null then this code will executes
Node temp = head;
while (temp.getNext() != null) 
{
	temp = temp.getNext();
}
temp.setNext(newNode);
System.out.println("Head->" + head);


return true;

}


public void findMax()
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

public void findMin()
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


public void calculateSum()
{
Node temp=head;
int sum = 0;
while (temp!= null)
{
	if(temp.getData() % 2==0)
	{
		sum= sum + temp.getData();
	}

temp=temp.getNext();
}

System.out.println("Sum =" +sum);
}

} 