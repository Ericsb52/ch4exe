package ericsb.ch4exe;

import java.util.Scanner;

/*
 * Eric broadbent
 * 10/18
 */
public class Ifcalculator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//get 2 numbers from user
		System.out.println("enter the first value");
		double num1 = input.nextDouble();
		System.out.println("enter the second value");
		double num2 = input.nextDouble();
		//get the operator
		System.out.println("do you want to  + - * / or % ");
		String opp = input.next();
		
	
		
		double total = 0;
		
		//test input
		//do calculations
		if (opp.equals("+") ) {
			total = num1 + num2;
		}
		else if (opp.equals("-")) {
			total = num1 - num2;
		}
		else if (opp.equals("*")) {
			total = num1 * num2;
		}
		else if (opp.equals("/")) {
			total = num1 / num2;
		}
		else if (opp.equals("%")) {
			total = num1 % num2;
		}
		else {
			System.out.println("that wasent an operator");
		}
		
		
		
		//print output
		
		System.out.println("your total was: "+ total);


	}

}
