package xyz;

public class LinearTimeExample {

	public static void printAllElement(int[] arr) {
	for(int i=0;i<arr.length;i++) {
		System.out.println("Element is:"+i+" "+arr[i]);
		}
	}
public static void main(String[] args) {
	int[] numbers= {10,20,30,40,50};
	printAllElement(numbers);
}
}
