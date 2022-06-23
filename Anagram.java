package com.week2.Day1.assignments;

import java.util.Arrays;

public class Anagram {
	
	public static boolean anagramCheck(String str1, String str2) //creating a boolean with parametarized method
	{
		boolean status = true; // declaring boolean variable
		String s1 = str1.replaceAll("", ""); // replacing the original value with 
		String s2 = str2.replaceAll("", "");
		
		if(s1.length() != s2.length()) // checking the length of the stating an comparing with both the strings
		{
			status = false;
		}else {
			char[] array1 = s1.toLowerCase().toCharArray(); // storing the string to char array
			char[] array2 = s2.toLowerCase().toCharArray();
			
			Arrays.sort(array1);
			Arrays.sort(array2);
			
			status = Arrays.equals(array1, array2); //comparing the both the array srtings with equals method of string
		}
		if(status) {
			System.out.println(s1+ " and " + s2 + " are anagrams");  //printing if both the strings are same
		}
		else {
			System.out.println(s1+ " and " + s2 + " are not anagrams"); //printing if both the strings are not same
		}
		
		return status;
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Anagram anagram = new Anagram();  // creating the class object
		
		anagram.anagramCheck("potss", "stops");  // calling the parametarized string type method and passing the string values
		anagram.anagramCheck("radar", "RADAR"); //calling the parametarized string type method and passing the string value
		anagram.anagramCheck("selenium", "webdriver"); // calling the parametarized string type method and passing the string value

	}

}
