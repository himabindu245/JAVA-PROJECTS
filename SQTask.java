package xyz;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class SQTask {

	public static void main(String[] args) {
		Stack<String> toybox=new Stack<String>();
		toybox.push("Ball");
		toybox.push("Blocks");
		toybox.push("Puzzle");
		System.out.println(toybox);
		System.out.println(toybox.pop());
		System.out.println(toybox);
		Queue<String> icecream=new LinkedList<String>();
		icecream.add("Maya");
		icecream.add("leo");
		icecream.add("naina");
		System.out.println(icecream);
		String serve=icecream.poll();
		System.out.println(serve);
		System.out.println(icecream);
	}
}
