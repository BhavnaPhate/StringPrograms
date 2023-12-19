package string.demos;

public class CountPunctuation {

	public static void main(String[] args) {
		// Stores the count of punctuation marks
		int count=0; 
		String str="He said, The mailmain is busy.' I-heard-it.";
		for(int i=0; i< str.length(); i++)
		{
			if(str.charAt(i)=='!'|| str.charAt(i)==','|| str.charAt(i)==';'||str.charAt(i)=='.'||
					str.charAt(i)=='?'||str.charAt(i)=='-')
			{
				count++;
			}
		}
		System.out.println("The number of punctuations exists in the string is: "+count);

	}

}
