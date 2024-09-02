package com.newbatches;

import java.util.LinkedHashSet;
 
public class Learning2 {
 
	public static void main(String[] args) {
		// to remove duplicate character
		String g = "football";

		LinkedHashSet <Character> n = new LinkedHashSet<Character>();
		for (char c : g.toCharArray()) {
			n.add(c);
		}
	  StringBuilder m = new StringBuilder();
	  for (char u : n) {
		  m.append(u);
	}
	  
	  System.out.println(m);
	
	
	
}
}
