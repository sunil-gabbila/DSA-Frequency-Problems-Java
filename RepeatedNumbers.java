package com.kodnest.Freaquency;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class RepeatedNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		List<Integer> res = iterativeNumbers(arr);
		
		for(Integer val : res) {
			System.out.print(val + " ");
		}
		

	}
	
	public static List<Integer> iterativeNumbers(int [] arr) {
		HashMap<Integer,Integer> map = new HashMap<>();
		for(Integer val : arr) {
			map.put(val, map.getOrDefault(val, 0) + 1);
		}
		
		List<Integer> list = new ArrayList<>();
		for(int i : map.keySet()) {
			if(map.get(i) > 1) {
				list.add(i);
			}
		}
		return list;
	}

}
