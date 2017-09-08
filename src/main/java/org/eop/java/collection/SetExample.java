package org.eop.java.collection;

import java.util.HashSet;
import java.util.NavigableSet;
import java.util.Random;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {
		hashSet();
		System.out.println("==============================");
		treeSet();
	}

	public static void hashSet() {
		Set<Integer> set = new HashSet<>();
		Random r = new Random();
		for (int i = 0; i < 100; i++) {
			set.add(r.nextInt(100));
		}
		
		System.out.println("size=" + set.size());
		System.out.println("empty=" + set.isEmpty());
		System.out.println("contains=" + set.contains(55));
		
		System.out.println();
		
		for (Integer s : set) {
			System.out.print(s);
			System.out.print(",");
		}
		System.out.println();
		
	}
	
	public static void treeSet() {
		TreeSet<Integer> set = new TreeSet<>();
		Random r = new Random();
		for (int i = 0; i < 100; i++) {
			set.add(r.nextInt(100));
		}
		
		System.out.println("size=" + set.size());
		System.out.println("empty=" + set.isEmpty());
		
		System.out.println();
		
		for (Integer s : set) {
			System.out.print(s);
			System.out.print(",");
		}

		System.out.println();
		System.out.println();
		
		SortedSet<Integer> sset = set;
		
		System.out.println("first=" + sset.first());
		System.out.println("last=" + sset.last());
		System.out.println("headSet=" + sset.headSet(50));
		System.out.println("tailSet=" + sset.tailSet(50));
		System.out.println("subSet=" + sset.subSet(30, 70));
		
		System.out.println();
		
		NavigableSet<Integer> nset = set;
		System.out.println("ceiling=" + nset.ceiling(30));
		System.out.println("floor=" + nset.floor(70));
		System.out.println("higher=" + nset.higher(30));
		System.out.println("lower=" + nset.lower(70));
	}
}
