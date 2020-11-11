import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main4 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		        StringTokenizer st;
		        int TC = Integer.parseInt(br.readLine());
		 
		        for(int i=0; i<TC; i++) {
		            st = new StringTokenizer(br.readLine());
		            int A = Integer.parseInt(st.nextToken());
		            int B = Integer.parseInt(st.nextToken());
		            int sum = A+B;
		 
		            bw.write(sum + "\n");
		        }
		        bw.flush();
		    }
		}