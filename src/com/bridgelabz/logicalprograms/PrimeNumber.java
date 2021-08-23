package com.bridgelabz.logicalprograms;

public class PrimeNumber {

	public static void main(String[] args) 
	{
		int number=2;
		boolean isPrime=true;
		if(number==0)
		{
			System.out.println("The number 0 is not a Prime Number");
		}
		else if(number==1)
		{
			System.out.println("The number 1 is not a Prime Number");
		}
		else
		{
			for(int index=2;index*index<=number;index++)
			{
				if(number%index==0)
				{
					isPrime=false;
				}
			}
			if(isPrime)
			{
				System.out.println("The number "+number+" is a Prime Number");
			}
			else
			{
				System.out.println("The number "+number+" is not a Prime Number");
			}
		}

	}

}
