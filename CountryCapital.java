package xyz;

import java.util.TreeMap;

public class CountryCapital {

	public static void main(String[] args) {
		TreeMap<String,String> ts=new TreeMap<String,String>();
		ts.put("India", "New Delhi");
		ts.put("USA", "Washington");
		ts.put("Germany", "Berlin");
		ts.put("japan", "Tokyo");
		ts.put("India", "Delhi");
		System.out.println(ts);
	}

}
