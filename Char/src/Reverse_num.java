import java.util.Scanner;

public class Reverse_num {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		
		int a = A % 10;
		int b = (A/10)%10;
		int c = (A/100)%10;
		
		int B = sc.nextInt();
		
		int d = B % 10;
		int e = (B/10)%10;
		int f = (B/100)%10;
		
		if(a*100 + b*10 + c > d*100 + e*10 + f)
			System.out.println(a*100 + b*10 + c);
		else
			System.out.println(d*100 + e*10 + f);
	}
}
