package com.kodnest.Freaquency;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CountTargetElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int [] arr = new int[size];
		for(int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		int target = sc.nextInt();
		int res = occurance(arr,target);
		System.out.println("Count = " + res );
	}
	
	public static int occurance(int [] arr, int target) {
		ArrayList<Integer> al = new ArrayList<>();
		for(int i : arr) {
			al.add(i);
		}
		int count = Collections.frequency(al, target);
		return count;
	}
	
}

  
