package com.dhiraj.nuber;

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the binary num : ");
		int num=sc.nextInt();
		int decimal=0;
		int p=0;
		while(true) {
			if(num==0) {
				break;
			}
			else
			{
				int temp = num % 10;
				decimal += temp*Math.pow(2, p);
				num = num/10;
				p++;
			}
		}
		System.out.println(decimal);


	}

}
