package test;

import java.util.Scanner;

public class Main3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int year = sc.nextInt();
		
		if (year % 400 == 0)
			System.out.println("1");
		else if (year % 100 == 0 )
			System.out.println("0");
		else if (year % 4 == 0)
			System.out.println("1");
		else if (year != 0)
			System.out.println("0");
	}
}
