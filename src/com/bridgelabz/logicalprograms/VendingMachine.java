package com.bridgelabz.logicalprograms;
import java.util.Scanner;
import java.util.ArrayList;

public class VendingMachine 
{
	private static ArrayList<Integer> notes = new ArrayList<Integer>();
	private static int [] availableNotes = {1000,500,100,50,10,5,2,1};
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the Change to be returned");
		int amount = sc.nextInt();
		getMinNotes(amount,0);
		System.out.println("the number of notes required to be returned : "+ notes.size());
		System.out.println("the notes are : "+notes);
		sc.close();

	}
	private static void getMinNotes(int amount, int notePointer)
	{
		if(amount == 0) return;
		if(amount - availableNotes[notePointer] >= 0)
		{
			notes.add(availableNotes[notePointer]);
			amount -= availableNotes[notePointer];
		}
		else
		{
			++notePointer;
		}
		getMinNotes(amount,notePointer);
	}

}
