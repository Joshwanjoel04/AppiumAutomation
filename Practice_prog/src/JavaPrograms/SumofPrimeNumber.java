package JavaPrograms;

import java.util.Scanner;

public class SumofPrimeNumber {
	
	public static void sumprimenumber(int n)
	{
	    int i ,j,sum=0;
		for (i=1;i<=n;i++)
		{
			
		boolean isPrime =true;
		for(j=2;j<i;j++)
		{
			if(i%j==0)
			{
				isPrime=false;
				break;
			}
		}
		if(isPrime)
		{
			
			//System.out.println("entered number is prome"+i);
			sum+=i;
			
		}
		
		}
		
	
		System.out.println(sum);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a =sc.nextInt();
		SumofPrimeNumber.sumprimenumber(a);
		
		// TODO Auto-generated method stub

	}

}
