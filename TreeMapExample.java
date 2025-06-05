package xyz;
import java.util.TreeMap;
public class TreeMapExample {
	public static void main(String[] args) {
		TreeMap<Integer,String> students=new TreeMap<Integer,String>();
		students.put(101,"mahi");
		students.put(102,"sahithi");
		students.put(103, "miheeka");
		students.put(104,"lara");
		System.out.println(students);
	}
}