package th2;

import java.util.Scanner;

public class cau28 {
	public static void main(String[] args) {
		int i;
		int j;
		int n;
		Scanner input=new Scanner(System.in);
		System.out.println("Nhap n: ");
		n=input.nextInt();
		for(i = 1; i <= n; i++) {
		      for(j = 1; j <= n-i; j++)
		         System.out.print(" ");
		      for(j = 1; j <= i; j++)
		    	  System.out.print("* ");
		      System.out.print("\n");
		   }
	
}
}
