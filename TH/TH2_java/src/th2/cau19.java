package th2;

import java.util.Scanner;

public class cau19 {
	public static void main(String[] args) {
		System.out.println("Nhap n: ");
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		if(kiemTraNguyenTo(n)==1)
			System.out.println("n la so nguyen to");
		else 
			System.out.println("n khong la so nguyen to");
	}
	public static int kiemTraNguyenTo(int x){
		int dem=0;
		for(int i=1;i<=x;i++)
			if(x%i==0)
				dem++;
		if(dem>2)
			return 0;
		else 
			return 1;
	}
}
