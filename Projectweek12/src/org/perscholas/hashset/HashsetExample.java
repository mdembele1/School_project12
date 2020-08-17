package org.perscholas.hashset;

import java.util.HashSet;

public class HashsetExample {

	public static void main(String[] args) {
		 HashSet <Integer> hs= new HashSet <Integer>();
		 
		 hs.add(1);
		 hs.add(2);
		 hs.add(3);
		 hs.add(4);
		 
		 System.out.println(hs.size());
		 
		for (int i :hs) {
		System.out.println(i);
		}
	}

}
