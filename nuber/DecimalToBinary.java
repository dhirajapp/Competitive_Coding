package com.dhiraj.nuber;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the num : ");
		int num=sc.nextInt();
		int i=0;
		int binary []= new int[20];
		while(num>0) {
		binary[i]=num%2;
		num=num/2;
		i++;
		}
        for(int j=i-1;j>=0;j--) {
        	System.out.print(binary[j]);
        }

	}

}
