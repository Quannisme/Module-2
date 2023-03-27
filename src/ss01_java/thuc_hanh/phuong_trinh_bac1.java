package ss01_java.thuc_hanh;

import java.util.Scanner;

public class phuong_trinh_bac1 {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a (ax+b=0):");
        a=sc.nextInt();
        System.out.println("Enter b(ax+b=0):");
        b=sc.nextInt();
        if(a==0)
        {
            System.out.println("Unsolution equation ");
        }else
        {
            System.out.println("x="+(-b/a));
        }
    }
}
