package ss13_java.BT.bai2;

import java.util.Arrays;
import java.util.Scanner;

public class TimKiemDeQuy {
    static int binarySearch(int[] array, int left, int right, int value) {
        if (left <= right) {
            int mid = (left + right) / 2;
            if (array[mid] == value) {
                return mid;
            }
            if (array[mid] < value) {
                return binarySearch(array, mid + 1, right, value);
            } else {
                return binarySearch(array, left, mid - 1, value);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
//        int arr[]={1,2,3,4,5,6,7,8,9};
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong phan tu :");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhap phan tu thu:" + (i + 1));
            arr[i] = sc.nextInt();
        }
        for (int w : arr) {
            System.out.println(w);
        }
        Arrays.sort(arr);
        System.out.println("sap xep xong");
        for (int w : arr) {
            System.out.println(w);
        }
        System.out.println("Nhap gia tri can tim:");
        int n = sc.nextInt();
        if (binarySearch(arr, 0, arr.length - 1, n) != -1) {
            System.out.println("ton tai gia tri:" + n);
        } else {
            System.out.println("khong ton tai" + n);
        }
    }
}
