package coreJava;
/*.Write a program to reverse a given List of strings.*/

import java.util.*;
//these class is created for to reverse a list of string using enhance for loop
public class ReverseString {
//main method that create and reverse the list and call object
	public static void main(String[] args) {
		//creating a list object of type String using ArrayList 
		List<String> list=new ArrayList<>();//Initialization of ArrayList
		//adding element in list
		list.add("Aman");
		list.add("Sapna");
		list.add(null);
		list.add("Geet");
		list.add("Mahak");
		list.add("Anu");
		list.add(null);
		list.add("Jay");
		
		//prints the original list
		System.out.println("Original list:"+list);
		
		//Initializing the another ArrayList for storing reverse of "list" element
		List<String>reverse=new ArrayList<>();
		
	     //we use Enhance for loop to reverse the list and its elements stored in "lst" . 
		
		for(String lst: list) {
		reverse.add( 0,lst);// Add each element to the front of the new list
		
		} // Print the reversed list
		  System.out.println("THE REVERSE LIST:"+" "+reverse);
        
	}
}


