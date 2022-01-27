package com.demo;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Occurance {
public static void main(String[] args) {
	
	String s="java application";
	char[] c = s.toCharArray();
	Map<Character,Integer> m=new LinkedHashMap();
	
	for(int i=0;i<c.length;i++) {
		if (m.containsKey(c[i])) {
			Integer d = m.get(c[i]);
			m.put(c[i], d+1 );
		}
		else {
			m.put(c[i], 1);
			
		}
	}
	System.out.println(m);
	Set<Entry<Character,Integer>> e=m.entrySet();
	for(Entry<Character,Integer> x:e) {
		if (x.getValue()>2) {
			System.out.println(x);
		}
	}
	
}
}
