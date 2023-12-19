package string.demos;

public class DivideString {

	public static void main(String[] args) {
		
		String str="aabbccdd";
		
		// Stores the Length of a string
		int len=str.length();
		
		// n determines the variable that divide the string in given equal parts
		int n=4;
		int temp=0;
		int chars=len/n;
		
		// Stores the array of string
		String[] equalStr= new String[n];
		
		// Checking whether a string can be divided into n equal 
		if(len % n !=0)
		{
			System.out.println("This string cannot be divided into equal parts");
		}
		else
		{
			for(int i=0; i<len; i=i+chars)
			{
				// Dividing string in n equal parts using subString()
				String part = str.substring(i, i+chars);
				equalStr[temp]= part;
				temp++;
			}
			System.out.println(n+" equal parts of given string are: ");
			for(int i=0; i<equalStr.length; i++)
			{
				System.out.println(equalStr[i]);
			}
		}

	}

}
