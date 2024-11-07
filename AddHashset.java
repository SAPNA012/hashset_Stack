package coreJava;
import java.util.*;

/*.Write a Java program to append the specified element to the end of a HashSet.

[Hint:Add elements in the Set using add() method]

*/

//these class created for add element in end of hashSet using add() 
public class AddHashset {
//main method for  adding elements and calling declaring methods
	public static void main(String[] args) {
		//create HashSet of integer type which store elements in it
		HashSet<Integer>set=new  HashSet<>();
		//adding elements in set using add() method
		set.add(45);
		set.add(55);
		set.add(85);
		set.add(245);
		set.add(451);
		System.out.println("display set elements: "+set);//prints the set elements
		int num=77;//Initializing  a element for adding specific position
		boolean isadded=set.add(num);//adding element in set 
		//checking num's value is-added to stack using if else
		if(isadded) {
			//if element added printing successful message on screen 
			System.out.println("element added successfully......");
		}else {
			//if element is not added printing elements not added message on screen 
			System.out.println("element is not added!!! ");
		}//display set after adding element in end of set 
		System.out.println("display set elements after adding specific element: "+set);
		
		System.out.println("the size of hashset: "+set.size());//Returns the number of elements in this set
		
		System.out.println("checks 45 is in set or not: "+set.contains(45));//Returns true if this set contains the specified element
	
    
	}

}
