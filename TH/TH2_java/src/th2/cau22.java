package th2;

import java.util.Scanner;

public class cau22 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Nhap m: ");
		int m=input.nextInt();
		System.out.println("Nhap n: ");
		int n=input.nextInt();
		System.out.println("BCLN la: " + BCNN(m,n));
}
	public static int UCLN (int x,int y){
		while(x*y!=0){
			if(x>y)
				x%=y;
			else
				y%=x;
		}
		return x+y;
	}
public static int BCNN(int x,int y){
	int result=UCLN(x,y);
	return x*y/result;
	
	}
}
