package com.bridgelabz.logicalprograms;
import java.util.Scanner;
public class Binary {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = sc.nextInt();
		int swappedNumber = swapNibbles(number);
		System.out.println("After swapping nibbles the number is : "+ swappedNumber);
		isPowerOf2(swappedNumber);
		sc.close();
	}
	static int swapNibbles(int number)
	{
		return ((number & 0x0F) << 4 | ((number & 0xF0) >> 4));
	}

	static void isPowerOf2(int swappedNumber) {
		
		int num = 1;
		while(num <= swappedNumber) {
			num *= 2;
			if(num == swappedNumber) {
				System.out.println("It is a power of 2");
				return;
			}
		}
		System.out.println("It is not a power of 2");

	}

}
