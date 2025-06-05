package xyz;

import java.util.TreeSet;

public class EmployeeTsk {

	public static void main(String[] args) {
		TreeSet<String> ts=new TreeSet<String>();
		 ts.add("Sumit");
		 ts.add("Karan");
		 ts.add("Anjali");
		 ts.add("Mohan");
		 ts.add("Zoya");
		 System.out.println("Alphabetical order:");
		 System.out.println(ts);
		 System.out.println("Reverse order:");
		 System.out.println(ts.reversed());
	}

}
