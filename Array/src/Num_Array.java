import java.util.Scanner;

public class Num_Array {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int count = sc.nextInt();
		int[] arr = new int [count];
		
		for(int i = 0; i < count; i++) 
		{
			arr[i] = sc.nextInt();
		}
		
		for(int i = 0; i < count - 1; i++) 
		{
			for(int j = i + 1; j < count; j++) 
			{
				if(arr[i] > arr[j]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		for(int k = 0; k < count; k++)
		{
			System.out.println(arr[k]);
		}
	}
}
