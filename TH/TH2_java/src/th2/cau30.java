package th2;

import java.util.Scanner;

public class cau30 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int i;
		int j;
		int n;
		System.out.println("Moi nhap n: ");
		n= input.nextInt();
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
				System.out.print("* ");
			 System.out.print("\n");
		}
	}

}
