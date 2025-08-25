package com.kprit.tns.array;

public class DuplicatesArray {

	public static void main(String[] args) {
		
		int arr[]= {1,10,20,3,6,9,2,1,5,6};
		System.out.println("The Duplicates are :");
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				
				if(arr[i]==arr[j]) {
					System.out.print(arr[i]+" ");
				}
			}
		}


	}

}
