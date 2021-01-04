package com.agileforreal.calculator;

import org.springframework.stereotype.Service;

@Service
public class Calculator {

	int sum(int a, int b) {
		return a+b;
	}

	 int multiply(Integer a, Integer b) {
		return a*b;
	}
}
