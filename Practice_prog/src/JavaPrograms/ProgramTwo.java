package JavaPrograms;

import java.util.Iterator;

public class ProgramTwo {
	public static void toLowercase(String input)
	{
		char[] ch=input.toCharArray();	

		//convert the string into array
	
	String nstr=" ";

		//create a new empty string
	
	for(int i=0;i<ch.length;i++)
	{
		if(ch[i]>=65 && ch[i]<=90)
		{
			nstr=nstr+((char)(ch[i]+32));
		}
				/*if any alphabet is in upper case convert it 
					into lower case*/
		else
		{
			nstr=nstr + ch[i];
//if it is in lower case no need to convert
		}
	}

		System.out.println("lowercase output"+nstr);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		toLowercase("Joshwan Joel");
		
	}


}
