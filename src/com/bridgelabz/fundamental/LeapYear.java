package com.bridgelabz.fundamental;

import java.net.Socket;
import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		int year;
		System.out.println ( "Please Enter an Year");
		Scanner leap = new Scanner(System.in);
		year = leap.nextInt();
		
		if (((year % 4 == 0) && (year % 100!=0 )) || (year% 400 ==0))
			System.out.println( "Given Year is a Leap Year");
		else 
			System.out.println( "Given Year is a Not Leap Year");
		}
	}