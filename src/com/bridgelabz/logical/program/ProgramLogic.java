package com.bridgelabz.logical.program;

import java.util.Scanner;

public class ProgramLogic {
	Scanner num;

	public ProgramLogic() {
		num = new Scanner(System.in);
	}

	public int getNextInt() {
		return num.nextInt();
	}

	public void getPrimeNumber(int number) {
		boolean condition = false;
		if (number == 0 || number == 1) {
			System.out.println(number + "  is not prime number");
		} else {
			for (int i = 2; i <= number / 2; ++i) {
				if (number % i == 0) {
					condition = true;
					break;
				}
			}

			if (!condition)
				System.out.println(number + " is prime number");
			else
				System.out.println(number + " is not  prime number");
		}
	}
}
