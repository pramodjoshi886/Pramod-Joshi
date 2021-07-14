package com.pj.tdd.kata;

import java.util.ArrayList;
import java.util.List;

public class StringCalculator {
	
	public int add(String numbers) {
		List<Integer> numList = new ArrayList<>();
		int sum = 0;
		for(char c:numbers.toCharArray()) {
			if(Character.isDigit(c)) {
				 numList.add(Character.getNumericValue(c));
			}
		}
		for(int i=0;i<numList.size();i++) {
			sum+=numList.get(i);
		}
		return sum;
	}

}
