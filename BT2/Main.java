package BT2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.println("Nhap so sinh vien: ");
        n = scanner.nextInt();
        Student[] a = new Student[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin sinh vien thu " + i + 1);
            a[i] = new Student();
            a[i].nhap();
        }
        for (int i = 0; i < n; i++) {
            System.out.println("Thong tin sinh vien thu " + i + 1);
            a[i].xuat();
        }
        System.out.println("=============================================");
        String Id = "123";

        for (int i = 0; i < n; i++) {
            if (a[i].getId().equals(Id)) a[i].xuat();
        }
        System.out.println("=============================================");
        for (int i = 0; i < n; i++) {
            a[i].x.Sua();
            a[i].xuat();
        }
        System.out.println("=============================================");
        for (int i = 0; i < n; i++) {
            if (a[i].getId().equals(Id)) {
                for (int j = i; j < n - 1; j++) {
                    a[j] = a[j + 1];
                }
                i--;
                n--;
            }
        }
        for (int i = 0; i < n; i++) {
            a[i].xuat();
        }
    }

}

