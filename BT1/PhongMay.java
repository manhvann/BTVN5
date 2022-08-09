package BT1;

import java.util.Scanner;

public class PhongMay {
    private String maPhong,tenPhong;
    private double dienTich;
    QuanLy x;
    May y;
    public void nhap()
    {
        x=new QuanLy();
        y=new May();
        Scanner scanner= new Scanner(System.in);
        System.out.println("Nhap ma Phong: ");
        maPhong=scanner.nextLine();
        System.out.println("Nhap ten phong: ");
        tenPhong=scanner.nextLine();
        System.out.println("Nhap dien tich: ");
        dienTich=scanner.nextDouble();
        scanner.nextLine();

        x.nhap();
        y.nhap();
    }
    public void xuat()
    {
        System.out.println("Ma phong: "+maPhong);
        System.out.println("Ten phong: "+tenPhong);
        System.out.println("Dien tich: "+dienTich);
        x.xuat();
        y.xuat();
    }
}
