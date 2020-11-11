import java.util.Scanner;

public class Plus_Cycle {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int result = n;
		int answer = 1;
		
		while(true)
		{
			int a = n/10;
			int b = n%10;
			int c = (a+b)%10;
			n = (b*10) +c;
			if ( result == n)
				break;
			answer++;
			
		}
		System.out.println(answer);
	}
}
