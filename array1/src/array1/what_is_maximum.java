package array1;

import java.util.Scanner;

public class what_is_maximum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int compare = 0;
		int index = 1;
		int answer= 0;
		for(int i = 1; i < 10; i++ )
		{
			int a = sc.nextInt();
			if (a > compare)
			{	
				compare = a;
				answer = index;
			}
			index++;
			
		}
		System.out.println(compare);
		System.out.println(answer);
	}
}
