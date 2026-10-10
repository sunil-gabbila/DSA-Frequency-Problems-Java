package com.kodnest.Freaquency;

import java.util.HashMap;
import java.util.Scanner;

public class FrequentElement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Most Repeated Element : " + mostOccurances(arr));
		
	}
	
	public static int mostOccurances(int [] arr) {
		HashMap<Integer, Integer> map = new HashMap<>();
			for(int val : arr) {
				map.put(val, map.getOrDefault(val, 0)+1);
			}
			int element = arr[0];
			int maxElement = map.get(element);
			
			for(int val : map.keySet()) {
				if(map.get(val) > maxElement) {
					maxElement = map.get(val);
					element = maxElement;
				}
			}
			return element;
		}
}
