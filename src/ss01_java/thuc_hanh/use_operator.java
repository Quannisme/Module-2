package ss01_java.thuc_hanh;

import java.util.Scanner;

public class use_operator {
    public static void main(String[] args) {
        double a;
        double b;
        double area;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter height:");
        a= sc.nextDouble();
        System.out.println("Enter weight:");
        b= sc.nextDouble();
        area=a*b;
        System.out.println("Area :"+area);
    }
}
