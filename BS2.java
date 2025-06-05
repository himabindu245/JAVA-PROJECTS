package xyz;


import java.util.Arrays;
import java.util.Scanner;

public class BS2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = {"Amit", "Divya", "Karan", "Priya", "Zoya"};
        Arrays.sort(names, String.CASE_INSENSITIVE_ORDER);
        System.out.println("Enter the name:");
        String s = sc.nextLine().trim();
        int result = Arrays.binarySearch(names, s, String.CASE_INSENSITIVE_ORDER);
        if (result >= 0) {
            System.out.println("Name exists at index: " + result);
        } else {
            System.out.println("Name does not exist.");
        }

        sc.close();
    }
}
