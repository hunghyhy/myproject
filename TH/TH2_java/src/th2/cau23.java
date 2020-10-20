package th2;

import java.util.Scanner;

public class cau23 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Moi nhap a,b: ");
		int a=input.nextInt();
		int b=input.nextInt();
		float x;
		if(a==0)
			if(b==0)
				System.out.println("Phuong trinh co vo so ngiem");
			else 
				System.out.println("Phuong trinh vo nghiem");
		else 
			System.out.println("Phuong trinh có nghiem la: "+((float)(-b)/a));
		
	}
}
