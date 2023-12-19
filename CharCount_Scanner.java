package string.demos;

import java.util.Scanner;

public class CharCount_Scanner {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string to count characters: ");
		String str= sc.nextLine();
		int count=0;
		
		for(int i=0; i<str.length(); i++)
		{
			if(str.charAt(i)!=' ')
			count++;
		}
		
		System.out.println("Number of characters present in given string is: "+ count);

	}

}
