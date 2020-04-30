package com.dhiraj.nuber;

import java.util.Scanner;

public class BinaryToOctal {
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
		
		int i=0;
		int octal []= new int[30];
		while(decimal>0) {
		octal[i]=decimal%8;
		decimal=decimal/8;
		i++;
		}
        for(int j=i-1;j>=0;j--) {
        	System.out.print(octal[j]);
        }



	}

}
