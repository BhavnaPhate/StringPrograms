package string.demos;

public class VowelConsonantCount {

	public static void main(String[] args) {
		
		// Counter variable to store the count of vowel and consonant
		
		int vCount=0;
		int cCount=0;
		
		// Declare a string
		String str= "Today is a wonderful day ";
		
		// Converting the entire string to lowerCase to reduce the comparisons
		str=str.toLowerCase();
		
		for(int i=0; i<str.length(); i++)
		{
			// Checks whether a character is a vowel
			if(str.charAt(i)=='a'|| str.charAt(i)=='e'|| str.charAt(i)=='i'||
					str.charAt(i)=='o'|| str.charAt(i)=='u')
			{
				vCount++;
			}
			// Checks whether a character is consonant
			else if(str.charAt(i)>='a' && str.charAt(i)<='z')
			{
				cCount++;
			}
		}
		
		System.out.println("Number of vowels: "+ vCount);
		System.out.println("Number of consonants: "+ cCount);

	}

}
