package BT1;

import java.util.Scanner;

public class May {
    private String maMay,kieuMay,tinhTrang;
    public void nhap()
    {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Nhap ma may: ");
        maMay=scanner.nextLine();
        System.out.println("Nhap kieu may: ");
        kieuMay= scanner.nextLine();
        System.out.println("Nhap tinh trang: ");
        tinhTrang=scanner.nextLine();

    }
    public void xuat()
    {
        System.out.println("Ma may: "+maMay);
        System.out.println("Kieu may: "+kieuMay);
        System.out.println("Tinh trang: "+tinhTrang);
    }
}
