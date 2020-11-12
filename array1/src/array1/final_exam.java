package array1;

import java.util.Scanner;

public class final_exam {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int count = sc.nextInt();
		
		double subject = sc.nextInt();
		double max = subject;
		double result = 0;
		double answer = 0;
		double arr [] = new double[count];
		
		arr[0] = subject;
		for(int i = 1; i < count; i++)
		{
			subject = sc.nextInt();
			if (subject > max)
				max = subject;	
			arr[i] = subject;
		}
		for(int j = 0; j < count; j++)
		{
			result = (arr[j]/max)*100;
			answer += result;
		}
		
		System.out.println(answer/count);
	}
}
