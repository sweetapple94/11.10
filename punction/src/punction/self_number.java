package punction;

public class self_number {
	public static void main(String[] args) {
		
		int b = 0;
		
		int arr [] = new int [10000];
		
		for(int i = 0; i < arr.length; i++)
			arr[i] = 0;
		
		for(int j = 0; j< arr.length; j++)
			{
			if(j < 100)
			b = j + j/10 + j%10;
			if(j <1000)
				b = j + (j/100)%10 + (j/10)%10 + j%10;
			if(j <10000)
				b = j + (j/1000)%10 + (j/100)%10 + (j/10)%10 + j%10;
			
			if(b < arr.length)
			arr[b] = 1;
			}
		for(int k = 0; k <arr.length; k ++)
		{
			if(arr[k] == 0)
				System.out.println(k);
		}
		
	}
}
