package com.ikramdg.main;

import java.util.Random;
import com.ikramdg.domain.StackImplementation;

public class DriverStack {

	public static void main(String[] args) {

		StackImplementation<Integer> stackData = new StackImplementation<Integer>();

		Random random = new Random();
		int numberOfData = random.nextInt(30);

		for (int i = 0; i < numberOfData ; i++) {
			stackData.push((i * 10));
		}

		while (!stackData.isEmpty()) {
			System.out.println(stackData.pop());
		}

	}

}
