package JavaPrograms;

import java.util.Iterator;
import java.util.Scanner;

public class MultiplicationTable {
	public static void multiplicationtable(int a )
	{
		for (int i=1;i<=10;i++)
		{
			System.out.println(a+"*"+i+"="+(i*a));
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a =sc.nextInt();
		multiplicationtable(a);
		
		

	}

}
