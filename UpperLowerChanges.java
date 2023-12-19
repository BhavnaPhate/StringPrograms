package string.demos;

import java.util.Scanner;

public class UpperLowerChanges {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str= sc.nextLine();
		StringBuffer newStr= new StringBuffer(str);
		
		for(int i=0; i<str.length(); i++)
		{
			// Checks for lowerCase character
			if(Character.isLowerCase(str.charAt(i)))
			{
				// Convert it into upper case 
				newStr.setCharAt(i, Character.toUpperCase(str.charAt(i)));
			}
			
			// Checks upper case character
			else if(Character.isUpperCase(str.charAt(i)))
			{
				// Convert it into lower case 
				newStr.setCharAt(i, Character.toLowerCase(str.charAt(i)));
			}
		}
		
		System.out.println("String after case conversion:\n"+ newStr);

	}

}
