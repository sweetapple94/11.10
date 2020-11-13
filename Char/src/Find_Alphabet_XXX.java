import java.util.Scanner;

public class Find_Alphabet_XXX {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		String word [] = new String[s.length()];
		int arr[] = new int [26];
		
		for(int i = 0; i <27; i++)
		{
			arr[i] = -1;
			char c = s.charAt(i);
			
			arr[c - 'a'] = i;
		}
		
		System.out.println(arr[i]);
	}
}
