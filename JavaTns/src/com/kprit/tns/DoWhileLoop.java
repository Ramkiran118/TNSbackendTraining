package com.kprit.tns;

import java.util.Scanner;

public class DoWhileLoop {


		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the n value :");
			int n=sc.nextInt();
			
			int i=0;
			do {
				
				System.out.println(i);
				i=i++;
				
			}
			while(i<=n);



	}

}
