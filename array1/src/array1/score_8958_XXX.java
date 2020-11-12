package array1;

import java.util.Scanner;

public class score_8958_XXX {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String arr[] = new String[sc.nextInt()];
		
		int score = 0;
		int answer = 0;
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextLine();
		}
	
		
			for(int i =0; i < arr.length; i++)
			{	
				for(int j =0; j < arr[i].length(); j++)
				{
							
				if (arr[i].charAt(j) == 'O')
				{
					score++;
				}
				else if(arr[i].charAt(j) =='X')
				{
					score = 0;

				}
				answer = answer + score;
				}
				System.out.println(answer);
				answer = 0;
			}
			
		}
	}
