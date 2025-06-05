package xyz;

import java.util.TreeSet;

public class TreeSetTask {

	public static void main(String[] args) {
		TreeSet<Integer> ts=new TreeSet<Integer>();
		ts.add(5002);
		ts.add(4998);
		ts.add(5005);
		ts.add(4999);
		ts.add(5001);
		System.out.println(ts);
		System.out.println(ts.first());
		int lastin = 4998;
		System.out.println("Firstbook ID:"+lastin);
		System.out.println(ts.last());
		int firstOut = 5005;
		System.out.println("Lastbook ID:"+firstOut);
		System.out.println(ts.higher(5005));
		System.out.println(ts.lower(4998));
	}

}
