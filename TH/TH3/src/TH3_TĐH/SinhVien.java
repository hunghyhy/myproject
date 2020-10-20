package TH3_TÐH;

import java.util.Scanner;


public class SinhVien {
	private String maSV;
	private String hoTen;
	float diemLT;
	float diemTH;
	public SinhVien(String maSV, String hoTen, float diemLT, float diemTH) {
		super();
		this.maSV = maSV;
		this.hoTen = hoTen;
		this.diemLT = diemLT;
		this.diemTH = diemTH;
	}
	public SinhVien() {
		super();
	}
	public String getMaSV() {
		return maSV;
	}
	public void setMaSV(String maSV) {
		this.maSV = maSV;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public float getDiemLT() {
		return diemLT;
	}
	public void setDiemLT(float diemLT) {
		this.diemLT = diemLT;
	}
	public float getDiemTH() {
		return diemTH;
	}
	public void setDiemTH(float diemTH) {
		this.diemTH = diemTH;
	}
	public float getDiemTB() {
		return ((float)(diemLT+diemTH)/2);
	}
	public boolean isPass() {
		return (this.getDiemTB()>=5);
	}
	public void display() {
		System.out.println("MaSV: "+getMaSV()+"   |Hoten: "+getHoTen()+"   |DiemLT: "+getDiemLT()+"   |DiemTH:"+ getDiemTH()+"   |DiemTB: "+getDiemTB());
	}
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		SinhVien SV1;
		String maSV;
		String hoTen;
		float diemLT;
		float diemTH;
		System.out.println("Nhap lan luot masv,hoten,diem LT,diemTH");
		maSV=input.nextLine();
		hoTen=input.nextLine();
		diemLT=input.nextFloat();input.nextLine();
		diemTH=input.nextFloat();
		SV1=new SinhVien(maSV, hoTen, diemLT, diemTH);
		SV1.display();
		if(SV1.isPass())
			System.out.println("\n Ban da Qua!");
		else 
			System.out.println("\n Ban da Rot!");
		
		
	}

}
