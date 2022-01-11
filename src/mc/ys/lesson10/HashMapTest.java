package mc.ys.lesson10;

import java.util.*;

public class HashMapTest {

	public static void main(String[] args) {
		HashMapTest hmt = new HashMapTest();
		hmt.test1();
	}
	
	public void test1() {
		System.out.println("HashMap Test");
		HashMap<String, Integer> map = new HashMap<>();
		
		// Create
		map.put("one", 10);
		map.put("two", 2);
		map.put("three", 3);
		
		// Read All
		this.printVer2(map);
		
		// Size
		int size = map.size();
		System.out.println("map's size is " + size);
		
		// Read
		int value = map.get("one");
		System.out.println(value);
		
		// Update
		map.put("one", 1);
		value = map.get("one");
		System.out.println("Updated value is " + value);
		
		// Remove
		value = map.remove("two");
		System.out.println("Deleted value is " + value);
	}
	
	public void print(HashMap<String, Integer> map) {
		Set<String> keys = map.keySet();
		Iterator<String> iter = keys.iterator();
		System.out.println("=============================");
		while(iter.hasNext()) {
			String key = iter.next();
			Integer value = map.get(key);
			System.out.println("key is " + key + ", value is " + value);
		}
		System.out.println("=============================");
	}
	
	public void printVer2(HashMap<String, Integer> map) {
		Set<Map.Entry<String, Integer>> keys = map.entrySet();
		Iterator<Map.Entry<String, Integer>> iter = keys.iterator();
		System.out.println("=============================");
		while(iter.hasNext()) {
			Map.Entry<String, Integer> me = iter.next();
			System.out.println("key is " + me.getKey() + ", value is " + me.getValue());
		}
		System.out.println("=============================");
	}

}
