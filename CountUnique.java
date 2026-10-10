package com.kodnest.Freaquency;

import java.util.HashMap;
import java.util.Scanner;

public class CountUnique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println(unique(arr));

	}
	
	public static int unique(int [] arr) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int val : arr) {
			map.put(val, map.getOrDefault(val,0) + 1);
		}
		
		return map.size();
	}

}
