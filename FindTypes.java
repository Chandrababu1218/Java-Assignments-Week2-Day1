package com.week2.Day1.assignments;

public class FindTypes {

	public static void main(String[] args) {
		String test = "$$ Welcome to 2nd Class of Automation $$ "; //input of String test
		System.out.println(test.length()); //print length of the string
		char character; //declare character
		
		int  letter = 0, space = 0, num = 0, specialChar = 0; //define values 
		char[] array=test.toCharArray();	// convert string to character array
		for (int i=0;i<test.length();i++) { // iterate from 0 to test.length using for loop
			character=test.charAt(i);		// assign each character to character variable
			
		if(Character.isLetter(test.charAt(i))) { //check if character is letter
			//letter1= letter1+character;
			++letter;
			
		}
		
		else if(Character.isDigit(test.charAt(i))) {	//check if character is digit
			++num;
			
		}
		else if(Character.isSpaceChar(test.charAt(i))) {	//check if character is space
			++space;										//increment 
		}
		else 
		{
			++specialChar;
		}
	}
		System.out.println("letter: " + letter);		//print the letter
		System.out.println("number: " + num);			//print the number
		System.out.println("space: " + space);			//print the space
		System.out.println("specialCharcter: " + specialChar);	//print the specialChar
 }
 }