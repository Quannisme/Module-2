package ss03_java.BT;

import java.util.Scanner;

public class max_2chieu {
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
        int indexhang = 0;
        int indexcot = 0;
        int max = arr[0][0];
        for (int i = 0; i < hang; i++) {
            for (int j = 0; j < cot; j++) {
                max = arr[0][0];
                if (arr[i][j] > max) {
                    max = arr[i][j];
                    indexhang = i;
                    indexcot = j;
                }
            }
        }
        for (int i = 0; i < hang; i++) {
            for (int j = 0; j < cot; j++) {
                System.out.println("Max:" + max);
            }
        }
    }

}
