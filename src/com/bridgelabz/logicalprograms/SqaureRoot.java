package com.bridgelabz.logicalprograms;
import java.util.Scanner;
public class SqaureRoot {
	private static final double EPSILON = Math.pow(2.7182, -15);
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int c = sc.nextInt();
		sqrt(c);
		sc.close();

	}
	private static void sqrt(int c) {
		double t = c;
		while(true) {
			t = 0.5*(t + (c / t));
			if(Math.abs(t-(c/t)) < EPSILON*t) {
				break;
			}
		}
		System.out.println("SquareRoot is : "+t);
	}
	

}
