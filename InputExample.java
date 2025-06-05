package xyz;

import java.util.Scanner;

public class InputExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the age: ");
		int age = sc.nextInt();
		sc.nextLine(); 
		
		System.out.print("Enter the name: ");
		String name = sc.nextLine();
		
		System.out.println("Name: " + name + ", Age: " + age);

		sc.close();
	}
}
