package com.javatutorial;

interface Message{
	String greet();
}
public class AnonymousInner2 {
	public void displayMessage(Message m){
		System.out.println(" this is an anonymous inner class as an argument");
		
	}
	public static void main(String[] args) {
		AnonymousInner2 inner= new AnonymousInner2();
		inner.displayMessage(new Message(){
			public String greet(){
				return "hello";
			}
		});
	}

}
