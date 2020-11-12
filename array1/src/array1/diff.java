package array1;

import java.util.Scanner;

public class diff {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int [10];
		int num = 0;
		int count = 0;
		
		for(int i = 0; i < 10; i++)
		{
			int a = sc.nextInt();
			
			num = a % 42;
			arr[i] = num;
		}
			for(int j = 0; j < 10; j++)
			{
				for (int k = 0; k < 10; k++)
				{
				if(arr[k] == arr[j] && k < j)
				{	
					count++;
					break;
				}
				}
			}
			System.out.println(10 -count);
	}
}
