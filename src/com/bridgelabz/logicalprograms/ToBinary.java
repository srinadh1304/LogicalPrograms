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
		int i=31;
		while(number >0) {
			binaryNumber[i] = number % 2;
			i--;
			number = number /2;
		}
		System.out.println("The 4 Byte binary string is : ");
		for(i=0;i<32;i++) {
			System.out.print(binaryNumber[i]);
		}
	}

}
