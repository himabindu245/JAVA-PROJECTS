package xyz;
import java.util.TreeMap;
public class TreeMapTask {

	public static void main(String[] args) {
		TreeMap<String,Integer> tm=new TreeMap<String,Integer>();
		tm.put("alice",100);
		tm.put("bob",98);
		tm.put("caroline",97);
		tm.put("john",50);
		tm.put("keerthana",69);
		System.out.println("Students Marks:");
		System.out.println(tm);
	}

}
