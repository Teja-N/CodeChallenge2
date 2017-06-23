package code.challenge2;

import java.util.Scanner;

public class ReverseString {
	static int i;
	public static void main (String args[])
    {
	while(true){
       System.out.println("String to be reversed: ");
       Scanner scan = new Scanner(System.in);
       String text=scan.nextLine();
        ReverseString.stringreverse(text);
        System.out.println("");
    }
	
    }
    static void stringreverse(String s)
    {
        char ch[]=new char[s.length()];
        for(i=0;i < s.length();i++)
        ch[i]=s.charAt(i);
        for(i=s.length()-1;i>=0;i--)
        System.out.print(ch[i]);
    }

    

}
