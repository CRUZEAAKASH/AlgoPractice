package oopspratice;

public class Breakwithloopingcocept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=50;i++) {
			if(i>30)
				break;
			else if(i%3==0)
				continue;
			else
				System.out.println(i);
		}
	}

}
