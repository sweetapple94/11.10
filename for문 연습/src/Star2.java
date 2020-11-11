import java.util.Scanner;

public class Star2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int k = 1;
		int i;
		
		for(int j = 0; j < a; j++)
		{
			for(i = 1; i+j < a; i++)
				System.out.print(" ");
		
				for(k = 0; k + i -1< a; k++)
					System.out.print("*");

		System.out.println();
		}
	}
}
