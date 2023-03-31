package ss03_java.BT;

import java.util.Scanner;

public class duong_cheo {
    public static void main(String[] args) {
        int hang;
        int cot;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so hang va cot:");
        hang = sc.nextInt();
        int arr[][] = new int[hang][hang];
        for (int i = 0; i < hang; i++) {
            for (int j = 0; j < hang; j++) {
                System.out.println("Array[" + i + "][" + j + "] = ");
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < hang; i++) {
            for (int j = 0; j < hang; j++) {
                System.out.print(" " + arr[i][j]);
            }
            System.out.println(" ");
        }
        int result = 0;
        for (int i = 0; i < hang; i++) {
            result += arr[i][i];
        }
        System.out.println("Tong duong cheo hinh vuong la :" + result);
    }
}
