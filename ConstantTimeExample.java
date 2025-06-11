package xyz;

public class ConstantTimeExample {

	public static void printFirstElement(int[] arr) {
		if(arr.length>0) {
			System.out.println("First Element is:"+arr[0]);
		}else {
			System.out.println("Array is Empty.");
		}
	}
public static void main(String[] args) {
	int[] numbers= {10,20,30,40,50};
	printFirstElement(numbers);
}
}
