package practice1;

import java.util.Scanner;

public class Main {
		
	  public static void main(String args[]) {
		
		 Scanner sc = new Scanner(System.in);
		
		 
		int a = sc.nextInt();
		int b = sc.nextInt();
		int d;
		int e;
		int f;
		
		d = b/100;
		e = (b-(d*100))/10;
		f = (b-(d*100)-(e*10));
		System.out.println(f*a);
		System.out.println(e*a);
		System.out.println(d*a);
		System.out.println(a*b);
		System.out.println("Good");
	  }
	
}

