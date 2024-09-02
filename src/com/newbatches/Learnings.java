package com.newbatches;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

public class Learnings {
	public static void main(String[] args) {
		// how to add the unique values in new LIst
     List r = new ArrayList<>();
     r.add(50);
     r.add(40);
     r.add(60);
     
     List s = new ArrayList<>();
	 s.add(60);
	 s.add(70);
	 s.add(80);
	 
	 List t = new ArrayList<>();
	 t.addAll(r);
	 System.out.println(t);
	 t.removeAll(s);
	 System.out.println(t);
	 s.removeAll(r);
	 System.out.println(s);
	 System.out.println("****");
	 
	 t.addAll(s);
	 System.out.println(t);
	 
	}

}
