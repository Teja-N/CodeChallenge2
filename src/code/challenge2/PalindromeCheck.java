package code.challenge2;

import java.util.Scanner;

public class PalindromeCheck {
	
	public static void main (String args[])
    {
    	while(true){
    	 System.out.println("Enter a word: ");
         Scanner scan = new Scanner(System.in);
         String text=scan.nextLine();

       int length = text.length();

       String strRev= stringreverse(text,length);
       if(text.equals(strRev))
       {
    	   System.out.println(text+ " is palindrome");
       }
       else
       {
    	   System.out.println(text+ " is not palindrome");       }
    }
    
    }
	    static String stringreverse(String s,int l)
	    {
	    String reverse = "";
	    	for ( int i = l - 1 ; i >= 0 ; i-- )
	    	{
	            reverse = reverse + s.charAt(i);
	    	}return reverse;
	    }
}
