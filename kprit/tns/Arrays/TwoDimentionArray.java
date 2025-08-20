package com.kprit.tns.Arrays;
import java.util.Scanner;
public class TwoDimentionArray {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the row :");
	int row=sc.nextInt();
	System.out.print("Enter the col :");
	int col=sc.nextInt();
	
		
		int arr[][] = new int[row][col];
		
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<i;j++) {
				System.out.print("The Array are : "+ arr[j]);
				
			}
			System.out.println();
			
			
		}
		
 
	}

}
