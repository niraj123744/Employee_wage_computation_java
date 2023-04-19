package com.mypackage;
import java.util.Random;

public class Add_part_time_emp_wage_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int PART_TIME = 1;
        int FULL_TIME = 2;
        int WAGE_PER_HR = 20;
        int workingHours = 0;
        int empType = (int) (Math.random() * 100) % 3;
        
        if (empType == FULL_TIME)
        {
            System.out.println("Employee is Present");
            System.out.println("Employee is Present Full time");
            workingHours = 8;
        } else if (empType == PART_TIME)
        {
            System.out.println("Employee is Present Part time");
            workingHours = 4;
        } else
        {
            System.out.println("Employee is Absent");
        }
        int wage = workingHours * WAGE_PER_HR;
        System.out.println("Employee Daily Wage is " + wage);
    }
}
	