package coreJava;

/*
2.Write a program to declare stack.Store 10 elements into it.Remove 4 elements from
stack and display it.*/

import java.util.*;
//these class is add and remove elements from stack  using push and pop

public class Removehash {
//main method for adding and removing and calling push(),pop() method.
	//it first it create stack of type string and add 10 elements and after that remove 4 elements from stack
	
	public static void main(String[] args) {
		// creating a stack of type string
		
   Stack<String>stack=new Stack<>();
   System.out.println("Adding 10 elements in stack..");//display message on screen
   //adding 10 elements to the stack using push()  method
   stack.push("laptop");
   stack.push("computer");
   stack.push("PC");
   stack.push(" Super computer");
   stack.push("micro computer");
   stack.push("motherboard");
   stack.push("chip");
   stack.push("keyboard");
   stack.push("mouse");
   stack.push("gaming laptop");
   System.out.println("the elements of stack: "+stack);//display stacks elements after adding 10 elements
   System.out.println("      ");//print space 
   
   System.out.println("Removing 4 elements and displaying the stack.... ");//display message on screen
   //removing 4 elements to the stack using pop()  method
    stack.pop();
    stack.pop();
    stack.pop();
    stack.pop();
  //display stacks elements after removing 4 elements
    System.out.println("the elements of stack after removing: "+stack);
	}

}
