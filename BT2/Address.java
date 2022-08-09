package BT2;

import java.util.Scanner;

public class Address {
    private String id, district, province;

    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap id Address: ");
        id = scanner.nextLine();
        System.out.println("Nhap district: ");
        district = scanner.nextLine();
        System.out.println("Nhap provonce: ");
        province = scanner.nextLine();
    }

    public void xuat() {
        System.out.println("id Address: " + id);
        System.out.println("District: " + district);
        System.out.println("Province: " + province);
    }

    public void Sua() {
        if (province == "Thanh Hoa") province = "Hai Phong";
    }
}
