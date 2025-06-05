package xyz;

import java.util.Scanner;
import java.util.TreeSet;

public class SearchFunction {

	public static void main(String[] args) {
		TreeSet<String> product = new TreeSet<String>();
		product.add("Keyboard");
		product.add("Mouse");
		product.add("Monitor");
		product.add("CPU");
		product.add("Webcam");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the product name:");
		String productname=sc.nextLine();
		if(product.contains(productname)) {
			System.out.println("product is found");
		}
		else {
			System.out.println("product not found");
		}
		sc.close();
	}
	
}