package com.app.stack;

public class Main {

	public static void main(String[] args) {
 
		Stack<String> s=new Stack<>(5);
		s.push("Pune");
		s.push("Mumbai");
		s.push("Ausa");
		System.out.println(s.peek());
		System.out.println(s.isEmpty());
		System.out.println(s.pop());
		System.out.println(s.peek());
		
		DoubleStack ds=new DoubleStack(10);
		ds.push1(1);
		ds.push1(2);
		ds.push2(10);
		ds.push2(20);
		System.out.println(ds.pop1());
		System.out.println(ds.pop1());
		
		System.out.println();
		
		System.out.println(ds.pop2());
		System.out.println(ds.pop2());
	}

}
