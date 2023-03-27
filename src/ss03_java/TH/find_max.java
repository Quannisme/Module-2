package ss03_java.TH;

import java.util.Scanner;

public class find_max {
    public static void main(String[] args) {
        int size;
        int a[];

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size:");
        size=sc.nextInt();
        a=new int[size];
        for (int i = 0; i <a.length ; i++) {
            System.out.println("Enter element"+i);
            a[i]= sc.nextInt();
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        int temp=a[0];
        for (int i = 0; i < a.length; i++) {
            if(a[i]>temp)
            {
                temp=a[i];
            }
        }
        System.out.println("max"+temp);
    }
}
