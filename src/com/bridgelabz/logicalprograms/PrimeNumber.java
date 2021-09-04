package com.bridgelabz.logicalprograms;

public class PrimeNumber {

	public static void main(String[] args) 
	{
		int isPrimeNumber=2;
		boolean isPrime=true;
		if(isPrimeNumber==0)
		{
			System.out.println("The number 0 is not a Prime Number");
		}
		else if(isPrimeNumber==1)
		{
			System.out.println("The number 1 is not a Prime Number");
		}
		else
		{
			for(int number=2;number*number<=isPrimeNumber;number++)
			{
				if(isPrimeNumber%number==0)
				{
					isPrime=false;
				}
			}
			if(isPrime)
			{
				System.out.println("The number "+isPrimeNumber+" is a Prime Number");
			}
			else
			{
				System.out.println("The number "+isPrimeNumber+" is not a Prime Number");
			}
		}

	}

}
