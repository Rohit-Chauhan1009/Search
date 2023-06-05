package com.greatlearning.corejava;

import java.util.Scanner;

public class LinearSearch1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to input the number of elements to insert
        System.out.print("Enter the number of elements: ");
        int size = scanner.nextInt();

        // Create an array of the size required and accept values from the user
        int[] arr = new int[size];
        System.out.println("Enter the elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        // Ask the user to enter the value to search for
        System.out.print("Enter the value to search for: ");
        int searchValue = scanner.nextInt();

        // Perform linear search
        int index = linearSearch(arr, searchValue);

        // Print the output
        if (index != -1) {
            System.out.println(searchValue + " found at index " + index);
        } else {
            System.out.println(searchValue + " not found in the array.");
        }

        scanner.close();
    }

    // Linear search algorithm
    public static int linearSearch(int[] arr, int searchValue) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == searchValue) {
                return i;
            }
        }
        return -1;
    }
}






