package implementation;

import java.util.Arrays;
import java.util.Scanner;

public class ClimbingTheLeaderBoard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] scores = new int[n];
        for(int scores_i=n-1; scores_i >= 0; scores_i--){
            scores[scores_i] = in.nextInt();
        }
        int m = in.nextInt();
        int[] alice = new int[m];
        for(int alice_i=0; alice_i < m; alice_i++){
            alice[alice_i] = in.nextInt();
        }
        int x=1, i, index;
        int a[]=new int[n];
        a[0]=scores[0];
        for(i=1;i<n;i++){
            if(scores[i]!=scores[i-1])
                a[x++]=scores[i];
        }
       // System.out.println("value of x = "+ x);
        for(i=0;i<m;i++) {
        	 index = Arrays.binarySearch(a, 0, x, alice[i]);
        //	 System.out.println("value of negative index ="+ index);
        	 if(index<0){
                 
        		 index = x+2+index;
             }else{
                 index = x-index;
             }
        	 System.out.println(index);
        }
	}

}
