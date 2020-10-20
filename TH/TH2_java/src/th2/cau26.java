package th2;

import java.util.Scanner;

public class cau26 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Nhap n: ");
		int n =input.nextInt();
		for(int i=0;i<n;i++)
		{
			if(i%2!=0)
				System.out.print(i+" ");
		}
	}

}
