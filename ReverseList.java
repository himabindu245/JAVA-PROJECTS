package xyz;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseList {

	public static void main(String[] args) {
		ArrayList<String> names=new ArrayList<>();
		names.add("hima");
		names.add("kusu");
		names.add("sam");
		names.add("ani");
		names.add("sai");
		System.out.println("original  list"+names);
		Collections.reverse(names);
		System.out.println("reversed list"+names);
	}
	}