package com.bridgelabz.logicalprograms;
import java.util.ArrayList;
import java.util.Scanner;

public class CouponNumbers 
{
	public static int numberOfCoupons;
	public static ArrayList<Integer> arrayOfCouponNumbers = new ArrayList<Integer>();
	public static int countOfCoupons = 0;
	public static int totalRandomNumbers = 0;

	public static int generateRandomNumbers(int power) 
	{
		return (int) (Math.floor(Math.random() * (Math.pow(10,power)))) % numberOfCoupons;
	}

	public static void generateDistinctCoupons(int numberOfCoupons)
	{
		int power=countDigits(numberOfCoupons);
		while (arrayOfCouponNumbers.size() != numberOfCoupons) 
		{
			int randomNumber = generateRandomNumbers(power);
			if (arrayOfCouponNumbers.contains(randomNumber))
			{
				totalRandomNumbers++;
			} 
			else 
			{
				totalRandomNumbers++;
				arrayOfCouponNumbers.add(randomNumber);
			}
		}
		System.out.println("The total numbers of random Numbers generated are : " + totalRandomNumbers);
	}
	public static int countDigits(int number)
	{
		int noOfDigits=0;
		//int number=number;
		while(number>0)
		{
			noOfDigits++;
			number=number/10;
		}
		return noOfDigits;
	}

	public static void main(String[] args)
	{

		Scanner scannerObject = new Scanner(System.in);

		System.out.println("Enter the number of distinct coupon numbers needed:");
		numberOfCoupons = scannerObject.nextInt();
		scannerObject.close();
		generateDistinctCoupons(numberOfCoupons);
	}
}
