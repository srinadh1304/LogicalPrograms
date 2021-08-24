package com.bridgelabz.logicalprograms;
import java.util.Scanner;
import java.time.Duration;
import java.time.Instant;
public class StopWatch 
{
	

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in); 
		Instant start, end;
		System.out.println("1:To start stop watch");
		int input1 = sc.nextInt();
		if(input1 == 1) 
		{
			start = Instant.now();
		}
		else
		{
			System.out.println("Wrong option");
			return;
		}

		System.out.println("2:To stop stop watch");
		int input2 = sc.nextInt();
		if(input2 == 2) 
		{
			end = Instant.now();
		}
		else
		{
			System.out.println("Wrong option");
			return;
		}
		
		Duration timeElapsed = Duration.between(start, end);
		System.out.println("Stop watch reading : "+ timeElapsed.toMillis()/1000 +" seconds");
		sc.close();

	}

}
