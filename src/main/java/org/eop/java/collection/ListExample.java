package org.eop.java.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ListExample {

	public static void main(String[] args) {
		arrayList();
		System.out.println();
		linkedList();
		System.out.println();
	}

	public static void arrayList() {
		List<Integer> scores = new ArrayList<>();
		Random r = new Random();
		for (int i = 0; i < 20; i++) {
			scores.add(r.nextInt(101));
		}
		
		System.out.println("size=" + scores.size());
		
		System.out.println("empty=" + scores.isEmpty());
		
		for (int i = 0; i < scores.size(); i++) {
			System.out.print(scores.get(i));
			System.out.print(",");
		}
		
		System.out.println();
		
		for (int score : scores) {
			System.out.print(score);
			System.out.print(",");
		}
		
		System.out.println();
	}
	
	public static void linkedList() {
		List<Integer> scores = new LinkedList<>();
		Random r = new Random();
		for (int i = 0; i < 20; i++) {
			scores.add(r.nextInt(101));
		}
		
		System.out.println("size=" + scores.size());
		
		System.out.println("empty=" + scores.isEmpty());
		
		for (int i = 0; i < scores.size(); i++) {
			System.out.print(scores.get(i));
			System.out.print(",");
		}
		
		System.out.println();
		
		for (int score : scores) {
			System.out.print(score);
			System.out.print(",");
		}
		
		System.out.println();
	}
}
