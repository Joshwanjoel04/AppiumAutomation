package JavaPrograms;

import java.io.FileInputStream;
import java.util.Iterator;
import java.util.Scanner;

public class StringPalandrome {
	/*
	 *  s=abcba
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
	
	public static boolean isPalandrome(String s )
	{
	 
		
		String rev="";
		for(int j=s.length()-1;j>=0;j--)
		{
		
			rev = rev+s.charAt(j);
		
		}
		
		if(s.equals(rev))
		{
			return true;
		}
		return false;
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Scanner sc = new Scanner(FileInputStream);
		String enteredString= "aaab";
		boolean a =isPalandrome(enteredString);
		if(a)
		{
			System.out.println("pallendrome");
		}
		else {
			System.out.println("not a pallendrome");
		}
		
	}

}