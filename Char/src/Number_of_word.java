import java.util.Scanner;

public class Number_of_word {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		int count = 1;
		
		for(int i = 0; i < s.length(); i++)
		{
			if(s.charAt(i) == ' ')
			{
				count++;
			}
		}
		if(s.charAt(0) == ' ')
			count = count - 1;
		
		if(s.charAt(s.length()-1) == ' ')
			count = count - 1;
		System.out.println(count);
		
		
	}
}