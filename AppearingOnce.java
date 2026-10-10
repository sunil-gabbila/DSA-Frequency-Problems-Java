package com.kodnest.Freaquency;

import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Scanner;

public class AppearingOnce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		PriorityQueue<Integer> res	= reapeatingOnlyOnce(arr);
		for(int value : res) {
			System.out.print(value + " ");
		}
	}
	
	public static PriorityQueue<Integer> reapeatingOnlyOnce(int [] arr) {
		HashMap<Integer,Integer> map = new HashMap<>();
		for(Integer val : arr) {
			map.put(val, map.getOrDefault(val, 0) + 1);
		}
		
		PriorityQueue<Integer> pQue = new PriorityQueue<>();
		for(Integer val : map.keySet()) {
			if(map.get(val) == 1) {
				pQue.add(val);
			}
		}
		return pQue;
	}

}



/// Another way of approach
package com.kodnest.Freaquency;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class AppearingOnce {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int [] arr = new int[n];
			
			for(int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}
			
			HashSet<Integer> res	= reapeatingOnlyOnce(arr);
			for(int value : res) {
				System.out.print(value + " ");
			}
		}
		
		catch (Exception e) {
			e.getStackTrace();
		}
	}
	
	public static HashSet<Integer> reapeatingOnlyOnce(int [] arr) {
		HashMap<Integer,Integer> map = new HashMap<>();
		for(Integer val : arr) {
			map.put(val, map.getOrDefault(val, 0) + 1);
		}
		
		HashSet<Integer> pQue = new HashSet<>();
		for(Integer val : map.keySet()) {
			if(map.get(val) == 1) {
				pQue.add(val);
			}
		}
		return pQue;
	}
}

