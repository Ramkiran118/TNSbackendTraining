package com.kprit.tns;

import java.util.Scanner;

public class ConditionalDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number :");
		
		int number =sc.nextInt();
		
		if(number>0) {
			System.out.println("The Number is Positive .")
;
			}
		else if(number <0) {
			System.out.println("The Number is Negitive");
			
			
		}
		else {
			System.out.println("The Number is Zero");
		}

	}


	}


