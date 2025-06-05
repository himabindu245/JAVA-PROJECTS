package xyz;
import java.util.ArrayList;
import java.util.Collections;
public class SortList {

	public static void main(String[] args) {
		ArrayList<String> names=new ArrayList<String>();
		names.add("zara");
		names.add("abhi");
		names.add("mahi");
		names.add("jwalitha");
		names.add("niha");
		names.add("selena");
		System.out.println("Names:"+names);
		System.out.println("Before sorting:"+names);
		Collections.sort(names);
		System.out.println("After sorting:"+names);
	}
}