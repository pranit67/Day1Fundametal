package com.bridgelabz.fundamental;

public class StringCompare {
	public static void main(String[] args) {
		String St1 = "WC2022";
		String St2 = "WC2022";
		String St3 = "WC2024";
		
		boolean compare1 = St1.equals(St2);
		boolean compare2 = St2.equals(St3);
		System.out.println("St1.equals(St2) = "+ compare1);
		System.out.println("St2.equals(St3) = "+ compare2);
		
	}

}
