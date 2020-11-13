import java.util.Scanner;

public class Plus_XXX_11720 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		long arr [] = new long[sc.nextInt()];
		long sum = 0;
		String in = sc.next();
		
//		for(int i = 0; i < arr.length; i++)
//		{	
//			arr[i] =  input % 10;
//			input = input /10;
//			
//		}
		for(int j = 0; j <arr.length; j ++)
		{
			sum = sum + in.charAt(j)-'0';
		}
		System.out.println(sum);
		
		
		
	}
}
