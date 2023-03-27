package ss03_java.TH;

import java.util.Arrays;
import java.util.Scanner;

public class dao_nguoc_mang {
    public static void main(String[] args) {
        int []a;
        int size;
        int temp;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size array:");
        size=sc.nextInt();
        a=new int[size];
        for (int i = 0; i < a.length; i++) {
            System.out.println("Enter element:"+i);
            a[i]=sc.nextInt();
        }
        System.out.println("Array");
        for (int i = 0; i <a.length ; i++) {
            System.out.println(a[i]+" ");
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                temp=a[i];
                a[i]=a[j];
                a[j]=temp;

            }
        }
        System.out.println("reverse");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]+" ");
        }
    }
}
