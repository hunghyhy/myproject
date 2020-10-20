package TH3_TÐH;

import java.util.Scanner;

public class NhanVien {
	private String maNV;
	private int soSP;
	public NhanVien(String maNV, int soSP) {
		super();
		this.maNV = maNV;
		if(soSP <0)
			this.soSP = 0;
		else this.soSP = soSP;
	}
	public NhanVien() {
		super();
	}
	public String getMaNV() {
		return maNV;
	}
	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}
	public int getSoSP() {
		return soSP;
	}
	public void setSoSP(int soSP) {
		if(soSP <0)
			this.soSP = 0;
		else this.soSP = soSP;
	}
	public boolean coVuotChuan (){
		return(this.soSP>500);
	}
	public String getTongKet() {
		String temp="";
		if(this.coVuotChuan())
			temp="Vuot";
		return temp;
	}
	public double getLuong() {
		if(this.coVuotChuan())
			return (500*20000 + (this.soSP - 500)*30000);
		else
			return (this.soSP*20000);
	}
	public static void xuatTieuDe(){
		System.out.println("MaNhanVien\tSoSanPham \tLuong \t\t TongKet \t\t");
	}
	
	public String toString() {
		return this.maNV + "\t\t" +this.soSP+"\t\t"+this.getLuong()+"\t\t"+this.getTongKet()+"\t\t";
	}
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String maNV;
		int soSP;
		System.out.println("Nhap maNV va soSP cua NV1: ");
		maNV=input.nextLine();
		soSP=input.nextInt();
		input.nextLine();
		NhanVien NV1=new NhanVien(maNV,soSP);
		System.out.println("Nhap maNV va soSP cua NV2: ");
		maNV=input.nextLine();
		soSP=input.nextInt();
		NhanVien NV2=new NhanVien(maNV,soSP);
		xuatTieuDe();
		System.out.println(NV1.toString());
		System.out.println(NV2.toString());
		
		
	}
	
		
	
	

}
