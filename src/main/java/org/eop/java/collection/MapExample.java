package org.eop.java.collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Random;
import java.util.SortedMap;
import java.util.TreeMap;

public class MapExample {

	public static void main(String[] args) {
		hashMap();
		System.out.println("=============================");
		linkedHashMap();
		System.out.println("=============================");
		treeMap();
	}

	public static void hashMap() {
		Map<String, Object> map = new HashMap<>();
		for (int i = 0; i < 10; i++) {
			map.put("k_" + i, "v_" + i);
		}
		
		System.out.println("size=" + map.size());
		System.out.println("empty=" + map.isEmpty());
		System.out.println("contains=" + map.containsKey("k_5"));
		
		System.out.println();
		
		System.out.println("keys=" + map.keySet());
		System.out.println("values=" + map.values());
		System.out.println("entries=" + map.entrySet());
		
		System.out.println();
		
		for (String key : map.keySet()) {
			System.out.print(key + "=" + map.get(key));
			System.out.print(",");
		}
		
		System.out.println();
		
		for (Map.Entry<String, Object> entry : map.entrySet()) {
			System.out.print(entry.getKey() + "=" + entry.getValue());
			System.out.print(",");
		}
		System.out.println();
	}
	
	public static void linkedHashMap() {
		Map<String, Object> map = new LinkedHashMap<>();
		for (int i = 0; i < 10; i++) {
			map.put("k_" + i, "v_" + i);
		}
		
		System.out.println("size=" + map.size());
		System.out.println("empty=" + map.isEmpty());
		System.out.println("contains=" + map.containsKey("k_5"));
		
		System.out.println();
		
		System.out.println("keys=" + map.keySet());
		System.out.println("values=" + map.values());
		System.out.println("entries=" + map.entrySet());
		
		System.out.println();
		
		for (String key : map.keySet()) {
			System.out.print(key + "=" + map.get(key));
			System.out.print(",");
		}
		
		System.out.println();
		
		for (Map.Entry<String, Object> entry : map.entrySet()) {
			System.out.print(entry.getKey() + "=" + entry.getValue());
			System.out.print(",");
		}
		System.out.println();
	}
	
	public static void treeMap() {
		TreeMap<Integer, String> map = new TreeMap<>();
		Random r = new Random();
		for (int i = 0; i < 10; i++) {
			map.put(r.nextInt(100), "v_" + i);
		}
		
		System.out.println("size=" + map.size());
		System.out.println("empty=" + map.isEmpty());
		
		System.out.println();
		
		System.out.println("keys=" + map.keySet());
		System.out.println("values=" + map.values());
		System.out.println("entries=" + map.entrySet());
		
		System.out.println();
		
		for (Integer key : map.keySet()) {
			System.out.print(key + "=" + map.get(key));
			System.out.print(",");
		}
		
		System.out.println();
		
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.print(entry.getKey() + "=" + entry.getValue());
			System.out.print(",");
		}
		System.out.println();
		System.out.println();
		
		SortedMap<Integer, String> smap = map;
		
		System.out.println("firstKey=" + smap.firstKey());
		System.out.println("lastKey=" + smap.lastKey());
		System.out.println("headMap=" + smap.headMap(50));
		System.out.println("tailMap=" + smap.tailMap(50));
		System.out.println("subMap=" + smap.subMap(30, 70));
		
		System.out.println();
		
		NavigableMap<Integer, String> nmap = map;
		System.out.println("ceilingKey=" + nmap.ceilingKey(30));
		System.out.println("floorKey=" + nmap.floorKey(70));
		System.out.println("higherKey=" + nmap.higherKey(30));
		System.out.println("lowerKey=" + nmap.lowerKey(70));
		System.out.println();
		System.out.println("ceilingEntry=" + nmap.ceilingEntry(30));
		System.out.println("floorEntry=" + nmap.floorEntry(70));
		System.out.println("higherEntry=" + nmap.higherEntry(30));
		System.out.println("lowerEntry=" + nmap.lowerEntry(70));
	}
}
