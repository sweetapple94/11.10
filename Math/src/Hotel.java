import java.util.Scanner;

public class Hotel {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		for(int i = 0; i < num; i++)
		{
			int H = sc.nextInt();
			int W = sc.nextInt();
			int N = sc.nextInt();
			
			int x = (N / H) +1;
			int y = (N % H);
			if(N%H == 0) 
			{
				x = N/H;
				y = H;
			}
			
			System.out.println(x + y*100);
			
		}
	}
}
