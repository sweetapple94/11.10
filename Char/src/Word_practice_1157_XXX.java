import java.util.Scanner;

public class Word_practice_1157_XXX {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int k;
		int i = 0;
		int answer = 0;
		int arr[] = new int[27];
		int change = 0;
		
		
		String s = sc.next();
		
		for(int j = 0; j < arr.length; j++)
			arr[j] = 0;
		
		for(i =0; i < s.length(); i++)
		{
		char word = s.charAt(i);
		
			if(word >= 'a' && word <= 'z')
			{
				int a = (int)word;
				arr[a - 97]++;
			}
			if(word >= 'A' && word <= 'Z')
			{
				int a = (int)word;
				arr[a - 65]++;
			}
		
		}
		for(k = 0; k < arr.length-1; k++)
		{
		
		if(arr[k] > arr[k+1])	
		{
			change = arr[k];
			arr[k] = arr[k+1];
			arr[k+1] = change;	
		}
		}
		
		if(arr[26] != arr[25])
		{	
			char result = (char)(yep +65);
			System.out.println(result);
		}
		else
			System.out.println("?");
		}
	
	}

