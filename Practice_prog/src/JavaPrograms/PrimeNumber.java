package JavaPrograms;

import java.util.Scanner;

public class PrimeNumber {
	public static void primenumber(int n)
	{
		int i;
		if(n==1)
		{
			System.out.println("1 is prime ");
		}
		for( i=2;i<n;i++)
		{
			if(n%i==0)
			{
				System.out.println("not a prime");
				break;
			}
			
		}
		if(i==n)
		{
			System.out.println("value of i"+i);
			System.out.println("entered numeber is prime");
		}
		
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a =sc.nextInt();
		PrimeNumber.primenumber(a);
		
 
	}

}