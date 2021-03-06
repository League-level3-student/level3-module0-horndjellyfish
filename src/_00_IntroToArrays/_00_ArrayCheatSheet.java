package _00_IntroToArrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		// 1. make an array of 5 Strings
		String[] strings = new String[5];
		// 2. print the third element in the array
		System.out.println(strings[3]);
		// 3. set the third element to a different value
		strings[3] = "a different value";
		// 4. print the third element again
		System.out.println(strings[3]);
		// 5. use a for loop to set all the elements in the array to a string of your
		// choice
		for (int i = 0; i < strings.length; i++) {
			strings[i] = "your choice";
			System.out.println(strings[i]);
		}

		// 6. use a for loop to print all the values in the array
		// BE SURE TO USE THE ARRAY'S length VARIABLE

		// 7. make an array of 50 integers
		int[] ints = new int[50];
		Random rand = new Random();
		// 8. use a for loop to make every value of the integer array a random number
		for (int i = 0; i < ints.length; i++) {
			ints[i] = rand.nextInt(50);
			System.out.println(ints[i]);
		}
		// 9. without printing the entire array, print only the smallest number on the
		// array
		int min = ints[0];

		for (int i = 0; i < ints.length; i++) {

			if (ints[i] < min) {
				min = ints[i];
			}

		}

		// 10 print the entire array to see if step 8 was correct
		System.out.println("smallest number is: " + min);
		// 11. print the largest number in the array.
		int max = ints[0];
		for (int i = 0; i < ints.length; i++) {
			if (ints[i] > max) {
				max = ints[i];
			}
		}
		System.out.println("largest number is: " + max);
		// 12. print only the last element in the array
		System.out.println("last element: " + ints[49]);
	}
}
