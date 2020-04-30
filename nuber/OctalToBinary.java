package com.dhiraj.nuber;

import java.util.Scanner;

public class OctalToBinary {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the octal num : ");
		int num=in.nextInt();
		int [] octal_numvalues = {0,1,10,11,100,101,110,111};
		int rem;
	    long temp_octal=num;
		long binary_num =0;
		long place = 1;
      while(temp_octal !=0)
      {
    	  rem=(int)(temp_octal % 10);
    	  binary_num = octal_numvalues[rem]*place + binary_num;
    	  temp_octal=temp_octal/10;
    	  place *= 1000;
      }
      System.out.print(binary_num);
	}

}
