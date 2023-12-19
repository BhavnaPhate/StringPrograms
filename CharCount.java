package string.demos;

public class CharCount {

	public static void main(String[] args) {
		
		String str= "Have a nice day";
		int count=0;
		
		// Counts each character except space
		for(int i=0; i<str.length(); i++)
		{
			if(str.charAt(i)!=' ')
			count++;	
		}
		
		// Displays the total no of characters present in the given string
		System.out.println("Total number of characters in a string are "+ count);

	}

}
