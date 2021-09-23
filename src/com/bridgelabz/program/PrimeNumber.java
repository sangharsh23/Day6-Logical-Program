package com.bridgelabz.program;

import com.bridgelabz.logical.program.ProgramLogic;

public class PrimeNumber {

	public static void main(String[] args) {
		ProgramLogic logic =new ProgramLogic();
		System.out.println("Enter the number : ");
		int number = logic.getNextInt();
	    logic.getPrimeNumber(number);
	}

}
