package ss01_java.thuc_hanh;

import java.util.Scanner;

public class nam_nhuan {
    public static void main(String[] args) {
        int year;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter year:");
        year = sc.nextInt();
//        if (year % 4 == 0 && year % 100 != 0) {
//            System.out.println("This is năm nhuận");
//        } else if (year % 100 == 0 && year % 400 != 0) {
//            System.out.println("It not năm nhuận");
//        } else if (year % 100 == 0 && year % 400 == 0) {
//            System.out.println("It is năm nhuận");
//        }
//    }
        if(year % 4 == 0){
            if(year % 100 == 0){
                if(year % 400 == 0){
                    System.out.printf("%d is a leap year", year);
                } else {
                    System.out.printf("%d is NOT a leap year", year);
                }
            } else {
                System.out.printf("%d is a leap year", year);
            }
        } else {
            System.out.printf("%d is NOT a leap year", year);
        }
    }
}
