package com.kodnest.Freaquency;

import java.util.HashMap;
import java.util.Scanner;

public class DetectDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.err.println(hasDuplicate(arr));
		
	}
	
	public static String hasDuplicate(int[] arr) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int val : arr) {
			map.put(val, map.getOrDefault(val,0) + 1);
		}
		
		for(int val : map.keySet()) {
			if(map.get(val) > 1)
				return "YES";
		}
		return "NO";
	}

}
