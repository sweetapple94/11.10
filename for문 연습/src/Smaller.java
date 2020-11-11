import java.util.Scanner;

public class Smaller {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int num = sc.nextInt();
		
		for(int i = 0; i < n; i++)
		{
			int num2 = sc.nextInt();
			if(num > num2)
				{
				System.out.print(num2 + " ");
				
				}
		
		}
	}
}
