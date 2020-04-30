package com.dhiraj.nuber;

import java.util.Arrays;

public class Countcoupel {

	public static void main(String[] args) {
		 int arr[] ={10,10};
		 int count=0;
		 Arrays.sort(arr);
		 for(int i=0;i<arr.length-1; )
		 {
			 if(arr[i]==arr[i+1]) {
				 count++;
				 i=i+2;
			 }
			 else {
				 i++;
			 }
		 }
		System.out.println(count); 	
	}
}



