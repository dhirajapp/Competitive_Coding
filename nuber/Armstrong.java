package com.dhiraj.nuber;

public class Armstrong {

	public static void main(String[] args) {
		//153=(1*1*1)+(5*5*5)+(3*3*3)
       int sum=0,r,temp;
       int n= 153;
       temp=n;
       while(n>0)
       {
    	r=n%10;
    	n=n/10;
    	sum=sum+(r*r*r);
       }
       if(temp==sum)
       {
    	System.out.println("yes armstrong num");   
       }
       else
       {
    	   System.out.println("no armstrong num");   
       }
	}

}
       