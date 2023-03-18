package week3.day2;

public class Palindrome {

	public static void main(String[] args) {
		
		String value="madam";
		String rev="";
		for (int i=value.length()-1;i>=0; i--) {
			char ch=value.charAt(i);
			rev=rev+ch;
		}
		if(value.equalsIgnoreCase(rev))
		{
			System.out.println("This is palindrome");
		}
		else
		{
			System.out.println("This is not a palindrome");
		}
		
		
		
	}

}
