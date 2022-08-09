package BT2;

import java.util.Scanner;

public class Student {
    private String id, name;
    private int age;
    Address x;

    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap id Student: ");
        id = scanner.nextLine();
        System.out.println("Nhap name: ");
        name = scanner.nextLine();
        System.out.println("Nhap age: ");
        age = scanner.nextInt();
        x = new Address();
        x.nhap();
    }

    public void xuat() {
        System.out.println("Id Student: " + id);
        System.out.println("name: " + name);
        System.out.println("Age: " + age);
        x.xuat();
    }

    public String getId() {
        return id;
    }
}
