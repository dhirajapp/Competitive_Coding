package com.dhiraj.nuber;

import java.util.Scanner;

public class BinaryToHexadecimal {

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
		int hexadecimal []= new int[30];
		while(decimal>0) {
			hexadecimal[i]=decimal%16;
		decimal=decimal/16;
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
