import java.util.Scanner;

public class Bee_house {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int select = sc.nextInt();
		int count = 1;
		
		if (select == 1)
			count = 1;
		else
		{
			count = (select-2)/6;
			for(int i = 1; i < count; i++)
			{
				count  = count - i;
			}
			count = count +2;
		}
			
		System.out.println(count);
		
	}
}

