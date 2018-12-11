package implementation;

import java.util.Scanner;

public class ViralAdvertising {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int shared = 5;
		int liked = Math.floorDiv(5, 2);
		int[] cumulative = new int[50];
		cumulative[0] = liked;
		for(int i=1;i<50;i++) {
			shared = liked*3;
			liked = Math.abs(shared/2);
			cumulative[i] = cumulative[i-1]+liked;
		}
		System.out.println(cumulative[n-1]);
	}

}
