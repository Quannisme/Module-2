package ss03_java.BT;

import java.util.Scanner;
import java.util.ArrayList;
public class delete_array {
    public static void main(String[] args) {
        int array[];
        int size;
        int temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size");
        size = sc.nextInt();
        array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter element");
            array[i] = sc.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println("Array:" + array[i]);
        }
        System.out.println("Enter element find:");
        temp=sc.nextInt();
        for (int i = 0; i < array.length; i++) {
        }
    }
}
