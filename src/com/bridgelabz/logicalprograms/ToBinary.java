package com.bridgelabz.logicalprograms;
import java.util.Scanner;
public class ToBinary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = sc.nextInt();
		toBinary(number);
		sc.close();
	}

	private static void toBinary(int number) {
		int[] binaryNumber = new int[32];
		int arrayIndex=31;
		while(number >0) {
			binaryNumber[arrayIndex] = number % 2;
			arrayIndex--;
			number = number /2;
		}
		System.out.println("The 4 Byte binary string is : ");
		for(arrayIndex=0;arrayIndex<32;arrayIndex++) {
			System.out.print(binaryNumber[arrayIndex]);
		}
	}

}
