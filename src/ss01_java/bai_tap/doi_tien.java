package ss01_java.bai_tap;

import java.util.Scanner;

public class doi_tien {
    public static void main(String[] args) {
        double USD;
        double result;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter USD change:");
        USD= sc.nextDouble();
        result=USD*23000;
        System.out.println("Change:"+result+"VND");
    }
}
