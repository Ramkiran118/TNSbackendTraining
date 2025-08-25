package com.kprit.tns.array;

public class SecondLargestElement {

	public static void main(String[] args) {
		
		int arr[]= {1,3,6,9,27,30,55,33};
		
		int First=Integer.MIN_VALUE;
		int Second=Integer.MIN_VALUE;
		
		for(int num:arr) {
			if(num>First) {
				Second=First;
				First=num;
			}
			else if(num > Second && num!=First) {
				Second=num;
				
			}
		}
		System.out.println("Second Largest Number is : "+ Second);
		

	}

}


