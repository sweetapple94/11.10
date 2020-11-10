package test;

import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int score = sc.nextInt();
		
		if(score >= 90 && score <=100)
			System.out.println("A");
		if(score >= 80 && score <= 89)
			System.out.println("B");
		if(score >= 70 && score <=79)
			System.out.println("C");
		if(score >= 60 && score <=69)
			System.out.println("D");
		if( score <=59)
			System.out.println("F");
	}
}
