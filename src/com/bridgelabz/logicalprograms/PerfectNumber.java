package com.bridgelabz.logicalprograms;

public class PerfectNumber
{

	public static void main(String[] args)
	{
		int number=6;
		int sum=0;
		for(int startingIndex=2;startingIndex*startingIndex<=number;startingIndex++)
		{
				if(number%startingIndex==0)
				{
					sum=sum+startingIndex+(number/startingIndex);
				}
		}
		sum=sum+1;
		if(sum==number)
		{
			System.out.println("The number "+number+" is a Perfect Number");
		}
		else
		{
			System.out.println("The number "+number+" is not a Perfect Number");
		}
		
	}

}
