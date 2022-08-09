package BT1;

import java.util.Scanner;

public class QuanLy {
    private String maQL,hoTen;
    public void nhap()
    {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Nhap ma quan ly: ");
        maQL=scanner.nextLine();
        System.out.println("Nhap ho ten: ");
        hoTen=scanner.nextLine();
    }
    public void xuat()
    {
        System.out.println("ma QL: "+maQL);
        System.out.println("Ho ten: "+hoTen);
    }
}
