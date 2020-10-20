package TH3_TÐH;

import java.util.Scanner;

public class HinhTamGiac {
	private int ma;
	private int mb;
	private int mc;
	

	public HinhTamGiac(int ma, int mb, int mc) {
		if(ma<0 || mb<0 ||mc<0)
		{
			System.out.println("Gia tri truyen co so am ");
			this.ma = 0;
			this.mb = 0;
			this.mc = 0;
		}
		else if(ma+mb <= mc || ma+mc <= mb || mb+mc <= ma)
		{
			System.out.println("Khong phai hinh tam giac ");
			this.ma = 0;
			this.mb = 0;
			this.mc = 0;
		}
		else{
			this.ma = ma;
			this.mb = mb;
			this.mc = mc;
		}
	}

	public HinhTamGiac() {
		super();
	}

	public int getCanhA() {
		return ma;
	}
	public void setCanhA(int ma) {
		this.ma = ma;
	}
	public int getCanhB() {
		return mb;
	}
	public void setCanhB(int mb) {
		this.mb = mb;
	}
	public int getCanhC() {
		return mc;
	}
	public void setCanhC(int mc) {
		this.mc = mc;
	}
	public boolean laTamGiac() {
		return(ma+mb>mc && ma+mc>mb && mb+mc>ma);
	}
	public boolean laTamGiac(int a, int b, int c) {
		return(a+b>c && a+c>b && b+c>a);
	}
	public int getChuVi() {
		return ma+mb+mc;
	}
	public double getDienTich() {
		double p=(ma+mb+mc)/2;
		return(Math.sqrt(p*(p-ma)*(p-mb)*(p-mc)));
	}
	public static void main(String[] args) {
		HinhTamGiac tamgiac;
		System.out.println("Nhap 3 canh a,b,c cua tam giac");
		Scanner input = new Scanner(System.in);
		int ma = input.nextInt();
		int mb = input.nextInt();
		int mc = input.nextInt();
		tamgiac=new HinhTamGiac(ma,mb,mc);
		if(tamgiac.laTamGiac())
		{
			System.out.println("Chu vi tam giac la: "+tamgiac.getChuVi());
			System.out.println("Dien tich tam giac la: "+tamgiac.getDienTich());
		}
		
				
		
	}

}
