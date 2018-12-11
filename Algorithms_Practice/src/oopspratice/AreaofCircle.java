package oopspratice;

import java.util.Scanner;

public class AreaofCircle {

	public static final double PI = 3.14;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int radius = s.nextInt();
		System.out.println("Area of circle = "+PI*radius*radius);
		s.close();
	}

}
