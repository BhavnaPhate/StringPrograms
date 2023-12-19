package string.demos;

import java.util.Scanner;

public class ReplaceSpace {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str= sc.nextLine();
		System.out.println("Enter a character to replace with: ");
		char ch=sc.next().charAt(0);
		
		// Replace space with specific character ch
		str= str.replace(' ', ch);
		System.out.println("String after replacing spaces:\n"+ str);
		

	}

}
