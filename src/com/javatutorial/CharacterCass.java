package com.javatutorial;

public class CharacterCass {
	public static char  test(char st){
		System.out.println(st);
		return st;
	}
	public void print(char st){
		System.out.println(st);
	}

	public static void main(String[] args) {
		char ch='J';
		char name[]={'s','d','g','h','k'};
		char c= test('r');
		System.out.println(Character.isLetter( 'z'));
		System.out.println(Character.isLetter('5'));
		
		System.out.println(Character.isDigit('d'));
		System.out.println(Character.isDigit('5'));
		
		System.out.println(Character.isWhitespace('c'));
		System.out.println(Character.isWhitespace( ' '));
		System.out.println(Character.isWhitespace('\n'));
		System.out.println(Character.isWhitespace('\t'));
		
		System.out.println(Character.isUpperCase( 'S'));
		System.out.println(Character.isUpperCase( 's'));
		
		System.out.println(Character.isLowerCase( 'c'));
		System.out.println(Character.isLowerCase( 'D'));
		
		System.out.println(Character.toLowerCase( 'B'));
		System.out.println(Character.toUpperCase('a'));
		
		System.out.println(Character.toString('c'));
		
	}

}
