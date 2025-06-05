package xyz;

import java.util.Scanner;

public class RainUmbrella {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("It is raining (yes/no)");
		String ans=sc.next();
		if(ans.equals("yes")) {
			System.out.println("Take an umbrella");
		}else {
			System.out.println("No need of an umbrella");
		}
		sc.close();
	}
}