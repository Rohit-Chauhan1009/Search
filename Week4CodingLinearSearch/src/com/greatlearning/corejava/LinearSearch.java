package com.greatlearning.corejava;

import java.util.Scanner;

//import javax.naming.directory.SearchControls;

public class LinearSearch {
	
	public int NUM_ELEMENTS, SEARCH_ELEMENTS;
	public int array[];
	public boolean status = false;
	
	Scanner sc = new Scanner(System.in);
	
	public void implementationOfLinearSearch() {
		System.out.println("Enter the number of elements you want to have in the array.");
		//it will store the no. of elements you want to store like array of 6 elements
		NUM_ELEMENTS = sc.nextInt();
		array = new int[NUM_ELEMENTS];

		System.out.println("Enter the elements now.");
		insertValues();//creating two methods
		printValues();
		
		System.out.println("Enter the element to search");
		SEARCH_ELEMENTS = sc.nextInt();// in this we will save the no. we want to search
		searchValue(SEARCH_ELEMENTS);
		
	}
	//creating insertValue method
	public void insertValues() {
		// TODO Auto-generated method stub
		for(int i=0;i<NUM_ELEMENTS;i++) {
			//the loop will work till the no. we have given in Num_Elements like 5 we have give
			// then it will run 5 times and each time we have to enter the different no.
			//which will store in array[i]
			System.out.println("Enter elements at position"+ i + ":");
			array[i] = sc.nextInt();
		}
	}
	
	public void printValues() {
		// TODO Auto-generated method stub
		for(int i=0;i<NUM_ELEMENTS;i++) {
			//it will print the entered value one by one with index
			System.out.println("value at position "+i+" is :"+array[i]);
		}
		System.out.println();
	}
	
	public void searchValue(int value) {
		for(int i=0; i<array.length;i++) {
			if(array[i]==value) {
			System.out.println("Search value "+ SEARCH_ELEMENTS +" found at array index: "+i);
			status = true;
			}
		}
		if (status==false) {
			System.out.println("Value not found");
		}
	}
		public static void main(String[] args) {
			LinearSearch ls = new LinearSearch();
			ls.implementationOfLinearSearch();
		}
}
