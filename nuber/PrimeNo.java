package com.dhiraj.nuber;

public class PrimeNo {

	public static void main(String[] args) {
		int i,m=0,flag=0;
		int n=7;
		m=n/2;
		if(n==0||n==1)
		{
			System.out.println(n+"is not prime no");
		}
		else {
			for(i=2;i<=m;i++) {
				if(n%i==0) {
					System.out.println(n+" not prime");
					flag=1;
					break;
					
				}
			}
			if(flag==0)
			{
				System.out.println(n+" prime no");
			}
		}

	}

}
