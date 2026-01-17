package com.java.Arrays;

import java.util.Scanner;

//Brute Force
public class TwoSum1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of Elements: ");
		int n = sc.nextInt();

		int[] nums = new int[n];

		System.out.println("Enter array elements:");
		for (int i = 0; i < n; i++) {
			nums[i] = sc.nextInt();
		}
			System.out.print("Enter target: ");
			int target = sc.nextInt(); 
		
			for (int i = 0; i < n; i++) {
				for (int j = i + 1; j < n; j++) {

					if (nums[i] + nums[j] == target) {
						System.out.println("Indices are: " + i + " and " + j);
						return;
					}
				}
			}

			System.out.println("No two sum found");
		}
	}

//TC - O(n * n) On2  - bcoz looping
//SC - O(1)
	