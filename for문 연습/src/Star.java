import java.util.Scanner;

public class Star {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		for(int j = 0; j < a; j ++)
		{
		for(int i = 0; i <= j; i++)
			System.out.print("*");
		
		System.out.println();
		}
	}
}
