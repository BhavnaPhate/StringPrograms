package string.demos;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramInputSc {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the fisrt string: ");
		String str1=sc.next();
		System.out.println("Enter the second string: ");
		String str2=sc.next();
		
		if(str1.length()!= str2.length())
		{
			System.out.println("Both strings are not anagram");
		}
		
		// Converting array to char array
		char[] s1= str1.toCharArray();
		char[] s2= str2.toCharArray();
		
		// Sorting arrays using sort()
		Arrays.sort(s1);
		Arrays.sort(s2);
		
		if(Arrays.equals(s1, s2)== true)
		{
			System.out.println("Both the strings are anagram");
		}
		else
		{
			System.out.println("Both strings are not anagram");
		}

	}

}
