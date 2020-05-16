package _03_More_Array_Fun;

import java.util.Random;

public class MoreArrayFun {
	//1. Create a main method to test the other methods you write.
		public static void main (String [] args) {
			String[] s = new String[5];
			s[1] = "some random words";
			s[4] = "more random words";
			printStrings(s);
			reverseStrings(s);
		}
	//2. Write a method that takes an array of Strings and prints all the Strings in the array.
			public static void printStrings(String[] strings) {
				for (int i = 0; i < strings.length; i++) {
					System.out.println(strings[i]);
				}
			}
	
	
	//3. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in reverse order.
			public static void reverseStrings(String[] strings) {
				for (int i = strings.length; i > 0; i--) {
					System.out.println(strings[i-1]);
				}
			}
	
	
	//4. Write a method that takes an array of Strings and prints every other String in the array.
//			public static void everyOtherString(String[] strings) {
//				
//			}
	
	//5. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in a completely random order. Almost every run of the program should result in a different order.
	
		
}
