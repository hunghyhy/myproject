package th2;

import java.util.Scanner;

public class cau20 {
	public static void main(String[] args) {
		System.out.println("Nhap n:");
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int kiemTra=0;
		for(int i=1;i<=n;i++)
		{
			if((i*i)==n)
				kiemTra=1;
		}
		if(kiemTra==1)
			System.out.println("n la so chinh phuong");
		else 
			System.out.println("n khong la so chinh phuong");
}
}
