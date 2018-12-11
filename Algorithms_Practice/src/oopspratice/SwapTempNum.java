package oopspratice;

import java.util.Scanner;

public class SwapTempNum {

	public static void swap(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
		System.out.println("Swap number = "+a+"		"+b);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter first name");
		int first = s.nextInt();
		System.out.println("Enter second name");
		int second = s.nextInt();
		swap(first,second);
	}

}
