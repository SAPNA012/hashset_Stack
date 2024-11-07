package coreJava;
//Write a Java program that calculates the sum of all even numbers present in an ArrayList of integers


import java.util.*;
//calculates the sum of all even numbers present in an ArrayList of integers

public class SumOfEven {
       //main method in which we initialize the Array list, add elements, prints the sum of even number
	public static void main(String[] args) {
		int sum=0;//to store the sum of even number
		int temp=0;// Temporary variable to store value of i 
	
		//Initializing the ArrayList of type integer
		List <Integer> number=new ArrayList<>();
		//Adding elements in  list
		number.add(2);
		number.add(4);
		number.add(7);
		number.add(8);
		number.add(11);
		number.add(14);
		number.add(5);
		
		System.out.println("Elements of list"+number);//prints the list
		
		//these loop runs till the last number of list using get() we can get the element of number list
		for(int i=0;i<=number.get(i);i++) {
			//in which we can check number is even/odd  and store the sum in "sum " variable
			
			if(number.get(i)%2==0) {
				System.out.println("Even:"+" "+number.get(i));//print even if number is even
				
				 temp=number.get(i);//storing value of number list in each iteration
				 
				 sum=sum+temp;//storing sum of each element
				 
				}else {
					System.out.println("Odd:"+" "+number.get(i));//print odd if number is odd
				}
			
			
		}
		
		System.out.println("The sum is:"+sum);//prints the sum of even number in list
		
		
		
	}

}
