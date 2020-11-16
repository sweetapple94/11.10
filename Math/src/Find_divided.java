import java.util.Scanner;

public class Find_divided {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int x = 1;
		int y = 1;
		int z = 1;
		
		if (num == 1)
			System.out.println("1/1");
		else 
		{
			
			for(int i = 1; i < num; i++)
			{
				num = num - i;
				x = i;
				y = num;
			}
			z = x - y + 2;
			
			if(x %2 == 0)
				System.out.println(z+"/"+y);
			else
			System.out.println(y+"/"+z);
		
		}
	}
}
