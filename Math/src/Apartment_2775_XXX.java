import java.util.Scanner;

public class Apartment_2775_XXX {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int people = 1;
		int result = 0;
		
		for(int i = 0; i < num; i++)
		{
			int floor = sc.nextInt();
			int room = sc.nextInt();
			
			for(int j = 0; j < floor; j++)
			{
				for (int k = 1; k < room; k++)
				{
					result = k + j;
				}
				
				
			}
		}
	}
}
