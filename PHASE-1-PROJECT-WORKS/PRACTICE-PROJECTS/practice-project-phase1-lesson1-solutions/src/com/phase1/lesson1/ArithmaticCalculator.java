package com.phase1.lesson1;

import java.util.Scanner;

public class ArithmaticCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try (Scanner theScan = new Scanner(System.in)) {
			System.out.println("Eneter the two numbers");
			int firstnumber=theScan.nextInt();
			int secondnumber= theScan.nextInt();
			System.out.println("Enter the operator ");
			char operation=theScan.next().charAt(0);
			double Answer=0;

			switch(operation){
			case '+': Answer=firstnumber+secondnumber;
			System.out.println("Addition is "+Answer);
			break;
			case '-':Answer=firstnumber-secondnumber;
			System.out.println("Subtraction is "+Answer);
			break;
			case '*': Answer=firstnumber*secondnumber;
			System.out.println("Multiplication is "+Answer);
			break;
			case '/':Answer=firstnumber/secondnumber;
			System.out.println("Division is "+Answer);
			break;
			
			default:{
				System.out.println("Invalid input");
			
			}
			
	     }

     }
		
 }
	
}


