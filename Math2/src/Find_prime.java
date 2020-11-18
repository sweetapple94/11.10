import java.util.Scanner;

public class Find_prime {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int count = sc.nextInt();
		int result = 0;
		
		for(int i = 0; i < count; i++)
		{
			int insert = sc.nextInt();
			
			if (insert == 2)
				result++;
			if( insert != 1) 
			{
			for(int j = 2; j < insert; j++)
			{
				if(insert % j == 0)
				{	
					break;
				}
				else if(j == insert -1)
					result++;
			}
			}
		}
		System.out.println(result);
	}
}
