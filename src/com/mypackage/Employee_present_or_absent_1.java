package com.mypackage;

import java.util.Random;

public class Employee_present_or_absent_1 {

	public static void main(String args[]) {
		System.out.println("Welcome to Employee Wage Computation in Java");
		int FULL_TIME = 1;
		int empType = (int) (Math.random() * 100) % 2;

		if (empType == FULL_TIME) {
			System.out.println("Employee is Present");

		} else {
			System.out.println("Employee is Absent");

		}
	}
}
