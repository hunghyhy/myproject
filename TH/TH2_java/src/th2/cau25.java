package th2;

import java.util.Scanner;
public class cau25 {
	public static void main (String[] args) {
        int year;
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap vao nam can kiem tra: ");
        year = scan.nextInt();
        boolean isLeap = false;
        if(year % 4 == 0)
        {
            if( year % 100 == 0)
          
            {
                if ( year % 400 == 0)
                    isLeap = true;
                else
                    isLeap = false;
            }
            else
                isLeap = true;
        }
        else {
            isLeap = false;
        }
        if(isLeap==true)
            System.out.println(year + " la nam nhuan");
        else
            System.out.println(year + " khong phai la nam nhuan");
    }
}
