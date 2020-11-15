import java.util.Scanner;

public class Sugar_boy {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int k = sc.nextInt();
		int big = 0;
		int small = 0;
				
		for (int i =0; i < k/5 +1; i++)
			{
//			System.out.println(i);
				for(int j = 0; j < 10; j++)
					{
//					System.out.print(i);
//					System.out.println(j);
					if (k == 5*i + 3*j)
						{
						big = i;
						small = j;
						break;
						}
					}
			}
		if(big +small != 0)
		System.out.println(big + small);
		else
		System.out.println("-1");
		
	}
}
