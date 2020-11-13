import java.util.Scanner;

public class make_char {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int count = sc.nextInt();
		
		int num = 1;
		String s = "1";
		
		for(int  i = 0; i < count; i ++) 
		{
			
			num = sc.nextInt();
			s = sc.next();
			
			for(int k = 0; k < s.length(); k ++)
			{
				char alpha = s.charAt(k);
			
				for(int j = 0; j < num; j ++) 
				{	
					System.out.print(alpha);
				}
			}
			System.out.println();
		}
	}
}
