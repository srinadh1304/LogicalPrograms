package com.bridgelabz.logicalprograms;

public class MonthlyPayment {
	public static void main(String[] args) {
		double P  = Integer.parseInt(args[0]);
		double Y  = Integer.parseInt(args[1]);
		double R  = Integer.parseInt(args[2]);
		monthlyPayment(P, Y, R);
	}
	private static void monthlyPayment(double P, double Y, double R) {
		double n = 12 * Y;
		double r = R / (12*100);
		double payment = (P*r)/(1-(Math.pow(1+r,-n)));
		System.out.println("The payment is : "+ payment);
	}
}
