package string.demos;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str= sc.next();
		boolean flag= true;
		
		// Convert the given string to lower case
		str=str.toLowerCase();
		
		for(int i=0; i<str.length()/2; i++)
		{
			if(str.charAt(i)!= str.charAt(str.length()-i-1))
			{
				flag= false;
				break;
			}
		}
		
		if(flag)
			System.out.println("String is palindrome");
		else
			System.out.println("String is not palindrome");

	}

}
