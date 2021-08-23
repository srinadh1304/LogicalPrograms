package com.bridgelabz.logicalprograms;

public class PerfectNumber
{

	public static void main(String[] args)
	{
		int number=6;
		int sum=0;
		for(int index=2;index*index<=number;index++)
		{
				if(number%index==0)
				{
					sum=sum+index+(number/index);
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
