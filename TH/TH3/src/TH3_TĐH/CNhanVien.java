package TH3_TÐH;

import java.util.Scanner;

public class CNhanVien {
	private String mHo;
	private String mTen;
	private int mSoSP;
	public CNhanVien(String mHo, String mTen, int mSoSP) {
		super();
		this.mHo = mHo;
		this.mTen = mTen;
		if(mSoSP<0)
			this.mSoSP=0;
		else
			this.mSoSP = mSoSP;
	}
	public String getmHo() {
		return mHo;
	}
	public void setmHo(String mHo) {
		this.mHo = mHo;
	}
	public String getmTen() {
		return mTen;
	}
	public void setmTen(String mTen) {
		this.mTen = mTen;
	}
	public int getmSoSP() {
		return mSoSP;
	}
	public void setmSoSP(int mSoSP) {
		this.mSoSP = mSoSP;
	}
	
	public double getLuong() {
		if(this.mSoSP<200)
			return this.mSoSP*0.5;
		else if(this.mSoSP>=200 && this.mSoSP<400)
			return this.mSoSP*0.55;
		else if(this.mSoSP>=400 && this.mSoSP<600)
			return this.mSoSP*0.6;
		else 
			return this.mSoSP*0.65;
	}
	public boolean NhieuHon (CNhanVien nv2) {
		return(this.mSoSP>nv2.mSoSP);
	}
	public int ChenhLech(CNhanVien x) {
		return this.mSoSP-x.mSoSP;
	}
	public void display()
	{
		System.out.print("Hoten: "+this.mHo+" "+ this.mTen+"   | So San Pham: "+this.mSoSP+"    | Luong: "+this.getLuong()+"\n");
	}
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String mHo;
		String mTen;
		int mSoSP;
		System.out.println("Nhap vao ho ten va so sp cua NV1:");
		mHo=input.nextLine();
		mTen=input.nextLine();
		mSoSP=input.nextInt();input.nextLine();
		CNhanVien NV1 = new CNhanVien(mHo, mTen, mSoSP);
		System.out.println("Nhap vao ho ten va so sp cua NV2:");
		mHo=input.nextLine();
		mTen=input.nextLine();
		mSoSP=input.nextInt();
		CNhanVien NV2 = new CNhanVien(mHo, mTen, mSoSP);
		NV1.display();
		NV2.display();
		if(NV1.NhieuHon(NV2))
		{
			System.out.print("NV1 nhieu hon NV2 "+NV1.ChenhLech(NV2)+" San pham"+"\n");
		}
		else {
			System.out.print("NV2 nhieu hon NV1 "+NV2.ChenhLech(NV1)+" San pham"+"\n");
		}
		if(NV1.mSoSP>NV2.mSoSP)
		{
			System.out.print("NV1 nhieu hon NV2 "+NV1.ChenhLech(NV2)+" San pham");
		}
		else {
			System.out.print("NV2 nhieu hon NV1 "+NV2.ChenhLech(NV1)+" San pham");
		}
	}

}
