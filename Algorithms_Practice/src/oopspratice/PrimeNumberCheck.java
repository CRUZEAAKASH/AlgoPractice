package oopspratice;

import java.util.Scanner;

public class PrimeNumberCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		boolean flag = false;
		for(int i= 2;i<=Math.sqrt(num);i++) {
			if(num%i==0) {
				flag = true;
				break;
			}
		}
		if(flag==false)
			System.out.println(num+" is prime");
		else
			System.out.println(num+" is not prime");
		
	}

}
