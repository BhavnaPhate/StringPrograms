package string.demos;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str=sc.nextLine();
		String reverseStr= "";
		
		for(int i=str.length()-1; i>=0; i--)
		{
			reverseStr= reverseStr + str.charAt(i);
		}
		System.out.println("Original string: "+ str);
		System.out.println("Reversed string: "+ reverseStr);

	}

}
