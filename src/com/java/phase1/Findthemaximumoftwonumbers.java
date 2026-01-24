package com.java.phase1;

import java.util.Scanner;

public class Findthemaximumoftwonumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1= sc.nextInt();
		int n2= sc.nextInt();
		
		if(n1>n2 ) {
			System.out.println(n1);
		} else if(n2>n1){
			System.out.println(n2);
		} else {
			System.out.println("both are equal");
		}
		
		
	}
	
}

