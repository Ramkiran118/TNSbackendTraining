package com.kprit.tns.Arrays;

public class MaxMinArray {

	public static void main(String[] args) {
		
		int arr[]= {10,30,20,60,40,100};
		
		int max=arr[0]; int min=arr[0];
		
		for(int num:arr) {
			
			if(num>max) {
				max=num;
			}
			
			if(num<min) {
				min=num;
			}
		}
		
		System.out.println("The maximum number is : "+max );
		System.out.println("The minimum number is : "+min );
		

	}

}
