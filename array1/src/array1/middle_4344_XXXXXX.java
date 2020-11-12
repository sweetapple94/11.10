package array1;

import java.util.Scanner;

public class middle_4344_XXXXXX {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int arr [] = new int[sc.nextInt()];
		
		for(int i = 0; i < arr.length; i++) {
			double avg = 0;
			double sum = 0;
			int num =0;
			
			int score [] = new int[sc.nextInt()];
			for(int j =0; j < score.length; j++) {
				sum += score[j];
			}
			avg = sum / arr.length;
			
		for(int j = 0; j < arr.length; j ++)
		{
			if(arr[j] >avg)
				num++;
		}
		System.out.println(100*num/arr.length);
		}
	}
}
