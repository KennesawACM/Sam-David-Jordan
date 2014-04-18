package com.example.mathgameisawesome;

import android.util.Log;

public class RandomNumberGen {
	int RandRange (int max, int min) 
	{
		int range = (max - min) + 1;
		return (int)(Math.random() * range);
	}
	
//	public void NumberCrunch()
//	{
//		int x = RandRange(10,1);
//		int y = RandRange(10,1);
//		
//		/*
//		 * Get operator method to determine if math problem is +,-,x,/
//		 * Get user inputted values and use correct operator to combine them
//		 * Set computed value (int compVal) to a new integer
//		 * Match user value to the actual computed answer
//		 * call Jordan's page for correct/incorrect display
//		 * 
//		 * EXTRA:
//		 * log if answer is correct/incorrect
//		 * Run ~20 times
//		 * Calculate average
//		 * Final screen displays percentage with a letter grade!
//		 */
//	}
}

