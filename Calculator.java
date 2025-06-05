package xyz;

public class Calculator {
	int Calculate(int a,int b) {
		return a+b;
	}
	double Calculate(double a,double b) {
		return a*b;
	}
	int Calculate(int a,int b,int c) {
		return a*b*c;
	}
	public static void main(String[] args) {
		Calculator c=new Calculator();
		System.out.println(c.Calculate(12,30));
		System.out.println(c.Calculate(12.5,13.5));
		System.out.println(c.Calculate(2,3,4));
	}
}