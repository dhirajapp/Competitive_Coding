package com.dhiraj.nuber;


import java.util.*;
public class Gp {
    private static Scanner sc;

	public static void main(String args[] ) throws Exception {
        int maxpowerpuff;
 sc = new Scanner(System.in);
 int n=sc.nextInt();
 int arr1[]=new int[n];
 int arr3[]=new int[n];
 int arr2[]=new int[n];
 //Scanner sc=new Scanner(System.in);
  System.out.print("enter the no of each ingredient" );
   for(int a=0;a<n;a++)
  {
   arr1[a]=sc.nextInt();
  }
 
 // Scanner sc=new Scanner(System.in);
  System.out.print("enter the capacity of each ingredient" );
  for(int b=0;b<n;b++)
  {
     arr2[b]=sc.nextInt();
   }
 


		
		 for(int i=0;i<n;i++) { arr3[i]=arr2[i]/arr1[i]; } maxpowerpuff=arr3[0];
		 for(int j=1;j<n;j++) { if(arr3[j]< maxpowerpuff) { maxpowerpuff=arr3[j];
		 System.out.println(maxpowerpuff); } }
		 
 
    	//Write code here

   }
}
