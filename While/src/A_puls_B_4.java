import java.util.Scanner;

public class A_puls_B_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = 1;
		int b = 1;
		
		while(sc.hasNextInt())
		{
			 a = sc.nextInt();
			 b = sc.nextInt();
			
			System.out.println(a + b);
		}
	}
}
