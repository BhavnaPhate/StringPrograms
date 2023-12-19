package string.demos;

import java.util.Scanner;

public class RemoveWhiteSpace {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String: ");
		String str=sc.nextLine();
		
		// Remove white spaces using regex
		str=str.replaceAll("\\s+", "");
		System.out.println("String after removing all the white spaces: \n"+str);

	}

}
