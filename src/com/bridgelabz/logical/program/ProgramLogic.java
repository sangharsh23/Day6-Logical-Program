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

	// 1) program to find number is prime or not
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

	// 2) program to find perfect number
	public void getPerfectNumber(int number) {
		int sum = 0;
		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				sum = sum + i;
			}
		}
		if (sum == number) {
			System.out.println(number + " is perfect number");
		} else {
			System.out.println(number + " is not perfect number");
		}
	}

	public void getReverseNumber(int number) {
		int reverse = 0;
		while (number != 0) {
			int remainder = number % 10;
			reverse = reverse * 10 + remainder;
			number = number / 10;
		}
		System.out.println("given number after reverse : " + reverse);
	}
}