package _03_More_Array_Fun;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class MoreArrayFun {
	// 1. Create a main method to test the other methods you write.
	public static void main(String[] args) {
		String[] s = new String[5];
		s[0] = "0";
		s[1] = "1";
		s[2] = "2";
		s[3] = "3";
		s[4] = "4";
//		printStrings(s);
//		reverseStrings(s);
//		everyOtherString(s);
		randomStrings(s);
	}

	// 2. Write a method that takes an array of Strings and prints all the Strings
	// in the array.
	public static void printStrings(String[] strings) {
		for (int i = 0; i < strings.length; i++) {
			System.out.println(strings[i]);
		}
	}

	// 3. Write a method that takes an array of Strings and prints all the Strings
	// in the array
	// in reverse order.
	public static void reverseStrings(String[] strings) {
		for (int i = strings.length; i > 0; i--) {
			System.out.println(strings[i - 1]);
		}
	}

	// 4. Write a method that takes an array of Strings and prints every other
	// String in the array.
	public static void everyOtherString(String[] strings) {
		for (int i = 0; i < strings.length; i = i + 2) {
			System.out.println(strings[i]);
		}
	}

	// 5. Write a method that takes an array of Strings and prints all the Strings
	// in the array
	// in a completely random order. Almost every run of the program should result
	// in a different order.
	public static void randomStrings(String[] strings) {
		Random r = new Random();
		for (int i = 0; i < strings.length; i++) {
			int rand = r.nextInt(strings.length);
			strings[i] = strings[rand];
			System.out.println(strings[i]);
			
					
		}
		
	}

}
