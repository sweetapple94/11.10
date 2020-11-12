package array1;

import java.util.Scanner;

public class minimum_maximum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int a = sc.nextInt();
		int min = a;
		int max = a;
		
		for(int i =	1; i < n; i++)
		{
			a = sc.nextInt();
			if (a < min )
				min = a;
			if (a > max)
				max = a;
		}
		System.out.println(min + " " + max);
	}
}
