//3. Write a program to check whether the given two strings are anagrams of each other.
// Example: String 1: Listen  String 2: Silent   
// The result: Given strings are anagrams of each other


package surpriseAssignment;

import java.util.Arrays;
import java.util.Scanner;

public class Program_3 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String 1: ");
		String s1 = sc.nextLine();
		System.out.println("Enter the String 2: ");
		String s2 = sc.nextLine();
		
		s1 = s1.replaceAll(" ", "");
		s2 = s2.replaceAll(" ", "");
		
		
		if(s1.length() != s2.length()) {
			System.out.println("The Given two String are NOT Equal so, this is not a ANAGRAM...");
		}
		else {
			s1 = s1.toLowerCase();
			s2 = s2.toLowerCase();
			
			char[] string1 = s1.toCharArray();
			char[] string2 = s2.toCharArray();
			
			Arrays.sort(string1);
			Arrays.sort(string2);
		
			
			if(Arrays.equals(string1, string2) == true) {
				System.out.println("Strings are ANAGRAM...");
			}
			else {
				System.out.println("Strings are Not ANAGRAM...");
			}
			
		}
	}
}
