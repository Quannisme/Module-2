package ss15.java.BT;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        double a, b, c;
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Nhap canh a:");
            a = sc.nextDouble();
            System.out.println("Nhap canh b:");
            b = sc.nextDouble();
            System.out.println("Nhap canh c:");
            c = sc.nextDouble();
            if (a < 0 || b < 0 || c < 0)
                throw new ArithmeticException("Nhap khong hop le");
            if(a+b<c)
            {
                throw new tongException("Nhap khong hop le ");
            } else if (a+c<b) {

                throw new tongException("Nhap khong hop le ");
            }else if(b+c<a)
            {
                throw new tongException("Nhap khong hop le ");
            }
        }catch (ArithmeticException e)
        {
            System.out.println("cac canh phai la so duong");
        }catch (tongException e)
        {
            System.out.println("Tong 2 canh phai lon hon canh con lai");
        }
    }
}
