package com.bridgelabz.fundamental;

public class StaticMethodVeriablesBlock {

	static int x = 10;						 	// Static Variable

	public static void main(String args[]) {
		func();
	}

	static void func() { 						// Static Method
		int y = 5;
		System.out.println("x = " + x); 		// Static Method
		System.out.println("y = " + y); 		// Static Method
	}

	static {
		System.out.println("Static Block."); 	// Static Block
	}
}
