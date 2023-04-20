package ss11.java.BT.Bai1;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Reverse {
    public static void main(String[] args) {
        Stack<Integer> reverse = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("NHap so luong ban muon nhap vao:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhap phan tu :");
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            reverse.push(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = reverse.pop();
        }
        System.out.println(Arrays.toString(arr));
    }
}
