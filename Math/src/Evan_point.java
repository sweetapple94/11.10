import java.util.Scanner;

public class Evan_point {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int count = 1;
		
		if(0 >= count*(c-b))
			System.out.println("-1");
		
		else
		System.out.println((a/(c-b))+1);
	}
}
