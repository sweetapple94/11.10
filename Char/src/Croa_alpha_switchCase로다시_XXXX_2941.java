import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Croa_alpha_switchCase로다시_XXXX_2941 {
	public static void main(String[] arginput) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
		
		String input = br.readLine().trim();

		int result = 0;
		int count = 0;
		
		for(int i =0; i < input.length(); i++)
		{
			if(input.charAt(i) == 'c'
					&& (input.charAt(i+1) == '=' 
					||	input.charAt(i+1) == '-'))
			{
				count++;
				
			}
			
			if(input.charAt(i) == 'd'&& i < input.length() -2)
			{
				if(input.charAt(i+1) == '-')
					{
					count++;
					
					}
				
				if(input.charAt(i+1)== 'z' && input.charAt(i+2) == '=')
					{
					count++;
					
					}
			}
				
			if(input.charAt(i) == 'd'&& input.charAt(i+1) == '-')
				{
				count++;
				
				}
								
			if(input.charAt(i) == 'l' ||input.charAt(i) == 'n'
					&&input.charAt(i + 1) == 'j')
			{
				count++;
			
				}
			
			if(input.charAt(i) == 's' ||input.charAt(i) == 'z'
					&&input.charAt(i+1) == '=')
			{
				count++;
				}
			
		}
		result = input.length()-count;
		bw.write(result +"");
		bw.flush();
		
		
		br.close();bw.close();
	}
}
