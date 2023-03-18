package week3.day2;

public class ChangeOddIndexToUpperCase
{

	public static void main(String[] args) {
		String text="changeme";
		char[] ch = text.toCharArray();
        for (int i = 0; i < ch.length; i++) {
		if(ch[i]%2==1) {
			
			System.out.println(Character.toUpperCase(ch[i]));
			
		}
		else
		{
			System.out.println(Character.toLowerCase(ch[i]));
		}
		}
	}

}
