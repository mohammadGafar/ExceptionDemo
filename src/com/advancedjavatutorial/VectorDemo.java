package com.advancedjavatutorial;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		Vector v= new Vector(3,2);
		System.out.println("initial size of vector:"+v.size());
		System.out.println("initial capacity"+v.capacity());
		v.addElement(new Integer(1));
		v.addElement(new Integer(2));
		v.addElement(new Integer(3));
		v.addElement(new Integer(4));
		System.out.println("capacity after 4 additions"+v.capacity());
		
		v.addElement(new Double(5.45));
		v.addElement(new Double(6.22));
		v.addElement(new Double(3.55));
		System.out.println("capacity after 3 additions"+v.capacity());
		
		v.addElement(new Float(9.4));
		v.addElement(new Float(5.2));
		System.out.println("capacity after 2 additions "+v.capacity());
		
		System.out.println("First element:" +(Integer)v.firstElement());
		System.out.println("Last element "+(Float)v.lastElement());
		
		if(v.contains((new Integer(3))))
			System.out.println("vector contains 3");
		Enumeration vEnum = v.elements();
		
		System.out.println("elements in vector");
		
		while(vEnum.hasMoreElements())
			System.out.println(vEnum.nextElement()+" ");
		System.out.println();
	}

}
