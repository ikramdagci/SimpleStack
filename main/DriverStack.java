package com.ikramdg.main;

import java.util.Random;
import com.ikramdg.domain.StackImplementation;

public class DriverStack {

	public static void main(String[] args) {

		StackImplementation<Integer> stackData = new StackImplementation<Integer>();

		Random random = new Random();

		for (int i = random.nextInt(30); i > 0  ; i--) {
			stackData.push((i * 10));
		}

		while (!stackData.isEmpty()) {
			System.out.println(stackData.pop());
		}

	}

}
