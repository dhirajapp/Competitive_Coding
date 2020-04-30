package com.dhiraj.nuber;

import java.util.Scanner;

public class DecimalToOctal {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the num : ");
		int num=sc.nextInt();
		int i=0;
		int octal []= new int[30];
		while(num>0) {
		octal[i]=num%8;
		num=num/8;
		i++;
		}
        for(int j=i-1;j>=0;j--) {
        	System.out.print(octal[j]);
        }


	}

}
