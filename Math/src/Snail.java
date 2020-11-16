import java.util.Scanner;

public class Snail {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int up = sc.nextInt();
		int down = sc.nextInt();
		int length = sc.nextInt();
		
//		length / ( up - down )
int day = (length - down) / (up - down);
        
		// 나머지가 있을 경우 (잔여 블럭이 있을 경우)
		if ((length - down) % (up - down) != 0) {
			day++;
		}
		System.out.println(day);
	}
}
