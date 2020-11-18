import java.util.Scanner;

public class Plus_Prime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int min = sc.nextInt();
		int max = sc.nextInt();
		
		int first = 0;
		int result = 0;
		while(min <= max)
		{
			for(int i = 2; i <= min; i++)
			{
//				System.out.println(i);
			if(min == 1)
				continue;
			else if(min == 2)
			{
				result = result +2;
				first = 2;
				break;
			}
			else if(min % i == 0 && min != i) {
				break;
			}
			else if(min == i) 
			{	
				result = result + min;
				if (first == 0)
					first = min;
//				System.out.println();
//				System.out.print("i = " + i);
				
				break;
			}
			}
			min++;
		}
		if(result == 0)
			System.out.println("-1");
		else 
		{
			System.out.println(result);
			System.out.println(first);
		}
	}
}
