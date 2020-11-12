package punction;

import java.util.Scanner;

public class sum_of_N {
	public static void main(String[] args) {
		
		test();
	}
}

	public static long test(int [] a) {
		Scanner sc = new Scanner(System.in);
				
		long sum = 0;
		for(int i = 0 ; i < a.length; i++) {
			sum = sum + a[i];
		}
		return(sum);
	}

