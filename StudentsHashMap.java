package xyz;

import java.util.HashMap;

public class StudentsHashMap {

	public static void main(String[] args) {
		HashMap<Integer,String> students=new HashMap<Integer,String>();
		students.put(101, "selena");
		students.put(102, "vedansh");
		students.put(103, "fathima");
		students.put(104, "liyansh");
		students.put(105, "mahima");
		System.out.println(students);
		students.replace(101, "hima");
		System.out.println(students);
		students.remove(104);
		System.out.println(students);
		System.out.println(students.containsKey(101));
		System.out.println(students.containsValue("liyansh"));
	}

}
