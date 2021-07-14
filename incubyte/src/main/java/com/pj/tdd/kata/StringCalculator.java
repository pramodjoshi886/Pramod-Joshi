package com.pj.tdd.kata;

import java.util.Arrays;

public class StringCalculator {
	
	public int add(String numbers) {
		
		String string = numbers.replaceAll("[^0-9,\\-]", ",");
		String[] numString = string.split("[ \\n\\t\\r.,;:*!/?%()]");
		System.out.println(Arrays.toString(numString));
		int sum = 0;
		
		for(String s:Arrays.asList(numString)) {
			if(s.length()==1) {
				sum+=Integer.valueOf(s);
			}
		}
		System.out.println(sum);
		return sum;
	}

}
