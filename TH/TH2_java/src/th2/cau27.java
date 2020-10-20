package th2;

import java.util.Scanner;

public class cau27 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Nhap n: ");
		int n =input.nextInt();
		for(int i=0;i<n;i++)
		{
			if(i%2!=0)
			{
				if(i==7||i==21||i==41)
					continue;
				System.out.print(i+" ");
			}
		}
	}
}
