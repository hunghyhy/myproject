package th2;

import java.util.Scanner;

public class cau33 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int i;
		int j;
		int m;
		int n;
		System.out.println("Moi nhap m: ");
		m= input.nextInt();
		System.out.println("Moi nhap n: ");
		n= input.nextInt();
		for(i=1;i<=m;i++)
		{
			for(j=1;j<=n;j++)
				{
				   if(i == 1 || j == 1 || i == m || j == n)
					   System.out.print("* ");
				   else {
					   System.out.print("  ");
					
				}
				}
			System.out.print("\n");
		}

}
}
