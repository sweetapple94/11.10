package array1;

import java.util.Scanner;

public class how_many_used {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int answer = a * b * c;
		int count;
		
		int arr [] = {0,0,0,0,0,0,0,0,0,0};
		
		while(0 < answer)
		{
			count = answer % 10; 
			answer = answer / 10;
			if(count < 10)
				arr[count]++;
			
		}
		for(int j =0; j <10 ; j++)
			System.out.println(arr[j]);
	}
}
