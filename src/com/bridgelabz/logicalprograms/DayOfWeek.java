package com.bridgelabz.logicalprograms;

public class DayOfWeek {

	private static final String[] weeks = {"Sunday", "Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
	public static void main(String[] args) {
		int day = Integer.parseInt(args[0]);
		int month = Integer.parseInt(args[1]);
		int year = Integer.parseInt(args[2]);
		dayOfWeek(month,day,year);
	}
	private static void dayOfWeek(int month, int day, int year) {
		int y0 = year - (14-month) / 12;
		int x = y0 + (y0/4)- (y0/100) + (y0/400);
		int m0 = month + 12 * ((14-month)/12)-2;
		int d0 = (day+x+31*m0/12)% 7;
		System.out.println("The entered date is : "+ day+"/"+month+"/"+year);
		System.out.println("The day is: "+weeks[d0]);
	}


}
