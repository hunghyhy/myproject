package TH3_TÐH;

import java.util.Scanner;

public class HinhTron {
	public static float ChuVi(float x){
		float p;
		p=(float) (2*3.14*x);
		return p;
	}
	public static float DienTich(float x){
		float s;
		s=(float) (x*x*3.14);
		return s;
	}
	
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		float r;
		System.out.println("Nhap ban kinh: ");
		r=input.nextFloat();
		System.out.println("Chu vi hinh tron la: "+ChuVi(r));
		System.out.println("Dien tich hinh tron la: "+DienTich(r));
		
		
	}

}
