package com.bridgelabz.logicalprograms;

public class ReverseOfNumber {

	public static void main(String[] args) 
	{
		int number=19;
		int remainder=0,reverseOfNumber=0;
		while(number>0)
		{
			remainder=number%10;
			reverseOfNumber=reverseOfNumber*10+remainder;
			number=number/10;
		}
		System.out.println("The reverse of number: "+reverseOfNumber);
	}

}
