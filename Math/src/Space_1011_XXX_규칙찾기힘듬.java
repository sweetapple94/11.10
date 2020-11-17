import java.util.Scanner;

public class Space_1011_XXX_규칙찾기힘듬 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int count = sc.nextInt();
		int cal = 0;
		int max = 0;
		int result = 0;
		int start = 0;
		int end = 0;
		
		for(int i = 0; i< count; i ++)
		{
			start = sc.nextInt();
			end = sc.nextInt();
			
			cal = end -1;
			if(result < cal/2)
				max = result;	
		}
		if((end- start) %2 == 0)
		{
			
		}
			
	}
}
