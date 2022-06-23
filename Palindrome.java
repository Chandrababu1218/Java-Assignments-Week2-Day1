package com.week2.Day1.assignments;

public class Palindrome {
 public String stringLalindrome(String input) {  //creating  Strting type parametarized method
	 
	 System.out.println("Original String: " + input); //Printing the original String
	 
	 String reverse = "";  // initializing the reverse string with empty
	 
	 for(int i=input.length()-1; i>=0; i--) {  // iterating the string from length()-1 
		 reverse = reverse+input.charAt(i); // storing the reverse string in chaAt
	 }
	 System.out.println("Reverse of String: " + reverse); //Printing the reverse string
	 
	 if(input.toLowerCase().equalsIgnoreCase(reverse.toLowerCase())) {  // comparing the original string wth reverse string
		 System.out.println(input + " is palindrome"); //printing if string is palindrome
	 }else {
		 System.out.println(input + " is not palindrome"); // printing if string is not palindrome
	 }
	 
	 return input;
 }
  public int numPalindrome(int num) {
	  int remainder, reversedNum=0;
	  int originalNum = num;
	  
	  while(num != 0)  //
	  {
		  remainder = num%10;
		  reversedNum = reversedNum * 10 + remainder;
		  num = num/10;
	  }
	  if(originalNum == reversedNum) {
		  System.out.println(originalNum + " is palindrome");
	  }else {
		  System.out.println(originalNum + " is not palindrome");
	  }
	  
	  return num;
  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Palindrome palinobj = new Palindrome();  // creating the class object
		palinobj.stringLalindrome("Chandra"); // calling the parametarized string type method and passing the string value
		palinobj.stringLalindrome("madam"); // calling the parametarized string type method and passing the string value
		palinobj.stringLalindrome("RADAR"); // calling the parametarized string type method and passing the string value
		
		palinobj.numPalindrome(1221); // calling the parametarized int type method and passing the int value
		palinobj.numPalindrome(1062); // calling the parametarized int type method and passing the int value

	}

}
