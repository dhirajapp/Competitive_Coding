package com.dhiraj.nuber;

import java.util.Scanner;

public class OctalToDecimal {

	private static Scanner in;


	public static void main(String[] args) {
		in = new Scanner(System.in);
		System.out.println("Enter the octal_num : ");
       int octal_num = in.nextInt();
       int decimal_num =0;
       int i=0;
       
       while(octal_num !=0)
       {
    	   decimal_num =(int) ((decimal_num+(octal_num)%10)*Math.pow(8, i++));
    	   octal_num=octal_num/10;
       }
       System.out.print(decimal_num);
        
        
	}

}
