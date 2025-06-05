package xyz;
import java.util.ArrayList;
import java.util.Collections;
	public class RemoveElement {

	public static void main(String[] args) {
		ArrayList<String> fruits=new ArrayList<>();
		fruits.add("mango");
		fruits.add("apple");
		fruits.add("banana");
		fruits.add("pineapple");
		fruits.add("jackfruit");
		Collections.sort(fruits);
		fruits.remove(2);
		fruits.remove("jackfruit");
		System.out.println(fruits);
	}
}
