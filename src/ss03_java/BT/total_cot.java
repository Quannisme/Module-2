package ss03_java.BT;

import java.util.Scanner;

public class total_cot {
    public static void main(String[] args) {
        int hang;
        int cot;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so hang:");
        hang = sc.nextInt();
        System.out.println("Nhap so cot:");
        cot = sc.nextInt();
        int arr[][] = new int[hang][cot];
        for (int i = 0; i < hang; i++) {
            for (int j = 0; j < cot; j++) {
                System.out.println("Array[" + i + "][" + j + "] = ");
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < hang; i++) {
            for (int j = 0; j < cot; j++) {
                System.out.print(" " + arr[i][j]);
            }
            System.out.println(" ");
        }
        int indexcot = 0;
        int total = 0;
        System.out.println("Nhap so cot muon tinh tong:");
        indexcot = sc.nextInt();
        for (int i = 0; i < hang; i++) {
            for (int j = 0; j < cot; j++) {
                if (j == indexcot) {
                    total += arr[i][j];
                }
            }
        }
        System.out.println("Max cua cot" + " " + indexcot + total);
    }
}
