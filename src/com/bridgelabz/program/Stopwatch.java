package com.bridgelabz.program;

import com.bridgelabz.logical.program.ProgramLogic;

public class Stopwatch {

	public static void main(String[] args) {
		ProgramLogic logic = new ProgramLogic();
		System.out.println("press 1 to start :");
		long startTime = System.currentTimeMillis();
		logic.nextFloatValue();
		
		System.out.println("press 0 to stop :");
		long finishTime = System.currentTimeMillis();
		logic.nextFloatValue();
		logic.getElapsedTime(finishTime, startTime);
		
		
		

	}

}
