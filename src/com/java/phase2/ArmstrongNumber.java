package com.java.phase2;

import java.util.Scanner;

// Sum of each digit raised to the power of number of digits 
// is equal to the original number.

// 153 =  1³ + 5³ + 3³ = 1 + 125 + 27 = 153 
public class ArmstrongNumber {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int n = sc.nextInt();
		 int original = n;
		 
		 //counting number of digits
		 int count = 0;
		 int temp = n;
		 
		 while(temp> 0) {  //153>0  , 15>0
			 count++;     //count = 1...3
			 temp = temp/10;  //temp = 153/10 = 15
		 }
		 //count = 3
		 
		 //calculating sum
		 int sum = 0;
		 temp = n;   //temp -  153
		  while(temp > 0) {
			  int digit = temp%10; //3 
			  sum = (int) (sum + Math.pow(digit, count)); // sum = math.pow(3,3)
			  temp  = temp/10; //15
		  }
		  
		  //comparing 
		  if(sum == original) {
			  System.out.println("It is Armstrong");
		  } else {
			  System.out.println("not Armstrong");
		  }
		 
		 
		 
	}
}
