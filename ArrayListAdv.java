package xyz;

import java.util.ArrayList;

public class ArrayListAdv {

	public static void main(String[] args) {
		ArrayList<String> cartoon=new ArrayList<String>();
		cartoon.add("Doremon");
		cartoon.add("ShinChan");
		cartoon.add("Oggy and Cockroaches");
		cartoon.add("DoraBujji");
		cartoon.add("Tom and Jerry");
		System.out.println(cartoon);
		cartoon.remove("DoraBujji");
		System.out.println("DoraBujji");
		System.out.println(cartoon);
		cartoon.set(3,"Hiedi");
		System.out.println("Tom and Jerry-> Hiedi");
		System.out.println(cartoon);
		for(int i=0;i<cartoon.size();i++) {
			System.out.println(cartoon.get(i));
		}
	}

}
