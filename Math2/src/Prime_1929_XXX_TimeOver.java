import java.util.Scanner;

public class Prime_1929_XXX_TimeOver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int min = sc.nextInt();
		int max = sc.nextInt();
		
		while(min <= max)
		{
			if(min == 2) {
				System.out.println("2");
			}
			for(int i = 2; i <= min; i = i++)
			{
				if(min % i == 0  && i != min) 
				{
					break;
				}
				else if(min == i)
					System.out.println(min);
			}
			min++;
		}
	}
}
