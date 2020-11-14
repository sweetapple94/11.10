import java.util.Scanner;

public class Dial {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		
		char [] alpha = new char[26];
		int [] arr = new int [s.length()];
		int time = 0;
		int result = 0;
		
		for (int j = 0; j < alpha.length; j++ )
			{
			alpha[j] = (char) ('A'+j);
			}
		
		for(int i = 0; i <s.length(); i++)
		{
			for(int k =0; k < alpha.length; k++)
			{
				int num = 0;
				if (s.charAt(i) == alpha[k])
				{
//					System.out.println("k " +k);
					if (k <= 15 && k % 3 == 0)
					{
						num = k/3 + 2;
					}
					if (k <= 15 && k % 3 != 0)
					{
						num = k/3 + 2;
					}
					
					if (k >= 16 && k <19)
						num = 7;
					if (k >= 19 && k <22)
						 num = 8;
					if (k >= 22 && k <=25)
						 num = 9;
//					System.out.println("num "+ num);
					
						time = num +1 + time;
				}		
			}
		}
		System.out.print(time);
		}
}
