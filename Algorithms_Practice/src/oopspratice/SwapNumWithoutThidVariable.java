package oopspratice;

import java.util.Scanner;

public class SwapNumWithoutThidVariable {

	
	public static void swap(int a, int b) {
		a= a+b;
		b= a-b;
		a = a-b;
		System.out.println("Value of a="+a+"     Value of b="+b);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first number =");
		int first = scanner.nextInt();
		System.out.println("Enter second number =");
		int second = scanner.nextInt();
		swap(first,second);
	}

}
