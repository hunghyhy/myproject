package th2;

import java.util.Scanner;

public class cau34 {
	public static void main(String[] args) {
		float diemToan;
		float diemLy;
		float diemHoa;
		int maHS;
		float diemTB;
		String hoTen;
		String xepLoai;
		Scanner input =new Scanner(System.in);
		System.out.println("Nhap Ma Hoc Sinh: ");
		maHS=input.nextInt();
		input.nextLine();
		System.out.println("Nhap ho ten: ");
		hoTen=input.nextLine();
		System.out.println("Nhap diem Toan: ");
		diemToan=input.nextFloat();
		System.out.println("Nhap diem Ly: ");
		diemLy=input.nextFloat();
		System.out.println("Nhap diem Hoa: ");
		diemHoa=input.nextFloat();
		diemTB=((float)(diemHoa+diemLy+diemToan)/3);
		System.out.println(diemTB);
		if(diemTB >= 6.5 && diemTB<8)
			xepLoai="Kha";
		else if(diemTB>= 8 && diemTB<9)
			xepLoai="Gioi";
		else 
			xepLoai="Xuat Sac";
		System.out.println("====================");
		System.out.println("Ma hoc sinh: "+maHS);
		System.out.println("Ho ten: "+hoTen);
		System.out.println("Diem TB: "+diemTB);
		System.out.println("Xep loai: "+xepLoai);
				
		
		
	}

}
