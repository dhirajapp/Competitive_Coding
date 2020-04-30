package com.dhiraj.nuber;

import java.util.Scanner;

public class DecimalToHexadecimal {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the num : ");
		int num=sc.nextInt();
		int i=0;
		int hexadecimal []= new int[30];
		while(num>0) {
			hexadecimal[i]=num%16;
		num=num/16;
		i++;
		}
        for(int j=i-1;j>=0;j--) {
        	if(hexadecimal[j]>9) {
        	System.out.println((char)(hexadecimal[j]+ 55));
        }
        	else
        	{
        		System.out.println(hexadecimal[j]);
        	}
}


	}

}
