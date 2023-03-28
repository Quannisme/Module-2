package ss01_java.bai_tap;

import java.util.Scanner;

public class doc_so_thanh_chu {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập một số vào :");
        a = sc.nextInt();
//        System.out.println((a/100)+"  "+((a/10)%10)+"    "+(a%10));
        if (a < 20) {
            switch (a) {
                case 1:
                    System.out.println("one");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("four");
                    break;
                case 5:
                    System.out.println("FIve");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("nine");
                    break;
                case 10:
                    System.out.println("ten");
                    break;
                case 11:
                    System.out.println("Elevent");
                    break;
                case 12:
                    System.out.println("Twelve");
                    break;
                case 13:
                    System.out.println("Thirteen");
                    break;
                case 14:
                    System.out.println("Fourteen");
                    break;
                case 15:
                    System.out.println("Fifteen");
                    break;
                case 16:
                    System.out.println("Sixteen");
                    break;
                case 17:
                    System.out.println("Seventeen");
                    break;
                case 18:
                    System.out.println("Eighteen");
                    break;
                case 19:
                    System.out.println("Nineteen");
                    break;
            }
        } else if (a >= 20 && a < 100) {
            int sau = a % 10;
            int truoc = a / 10;
            switch (truoc) {
                case 2:
                    System.out.print("Twenty" + " ");
                    break;
                case 3:
                    System.out.print("Thirty" + " ");
                    break;
                case 4:
                    System.out.print("Fourty" + " ");
                    break;
                case 5:
                    System.out.print("Fifty" + " ");
                    break;
                case 6:
                    System.out.print("Sixty" + " ");
                    break;
                case 7:
                    System.out.print("Seventy" + " ");
                    break;
                case 8:
                    System.out.print("Eighty" + " ");
                    break;
                case 9:
                    System.out.print("Ninety" + " ");
                    break;
            }
            switch (sau) {
                case 1:
                    System.out.println("one");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("four");
                    break;
                case 5:
                    System.out.println("FIve");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("nine");
                    break;
                case 10:
                    System.out.println("ten");
                    break;
            }
        } else if (a > 99 && a < 1000) {
            int first = a / 100;
            int mid = (a / 10) % 10;
            int end = a % 10;
            switch (first) {
                case 1:
                    System.out.print("One Hundered" + " ");
                    break;
                case 2:
                    System.out.print("Two hundered" + " ");
                    break;
                case 3:
                    System.out.print("Three hundered" + " ");
                    break;
                case 4:
                    System.out.print("Four hundered" + " ");
                    break;
                case 5:
                    System.out.print("Five hundered" + " ");
                    break;
                case 6:
                    System.out.print("Six hundered" + " ");
                    break;
                case 7:
                    System.out.print("Seven hundered" + " ");
                    break;
                case 8:
                    System.out.print("Eight hundered" + " ");
                    break;
                case 9:
                    System.out.print("Nine hundered" + " ");
                    break;
            }
            switch (mid) {
                case 0:
                    break;
                case 1:
                    if (end == 0) {
                        System.out.println("Ten");
                        break;
                    } else if (end == 1) {
                        System.out.println("Evlent");
                        break;
                    }
                case 2:
                    if (mid == 1) {
                        break;
                    } else
                        System.out.println("Twenty");
                    break;
                case 3:
                    System.out.println("Thirty");
                    break;
                case 4:
                    System.out.println("Fourty");
                    break;
                case 5:
                    System.out.println("Fifty");
                    break;
                case 6:
                    System.out.println("Sixty");
                    break;
                case 7:
                    System.out.println("Seventy");
                    break;
                case 8:
                    System.out.println("Eighty");
                    break;
                case 9:
                    System.out.println("Ninety");
                    break;
            }
            switch (end) {
                case 1:
                    if (mid == 1) {
                        break;
                    } else
                        System.out.println("one");
                    break;
                case 2:
                    if (mid == 1) {
                        System.out.println("Twelve");
                        break;
                    } else
                        System.out.println("Two");
                    break;
                case 3:
                    if (mid == 1) {
                        System.out.println("Thirteen");
                        break;
                    } else
                        System.out.println("Three");
                    break;
                case 4:
                    if (mid == 1) {
                        System.out.println("Fourteen");
                        break;
                    } else
                        System.out.println("Four");
                    break;
                case 5:
                    if (mid == 1) {
                        System.out.println("Fiveteen");
                        break;
                    } else
                        System.out.println("Five");
                    break;
                case 6:
                    if (mid == 1) {
                        System.out.println("Sixteen");
                        break;
                    } else
                        System.out.println("Six");
                    break;
                case 7:
                    if (mid == 1) {
                        System.out.println("Seventeen");
                        break;
                    } else
                        System.out.println("Seven");
                    break;
                case 8:
                    if (mid == 1) {
                        System.out.println("Eighteen");
                        break;
                    } else
                        System.out.println("Eight");
                    break;
                case 9:
                    if (mid == 1) {
                        System.out.println("Nineteen");
                        break;
                    } else
                        System.out.println("Nine");
                    break;

            }
        }
    }
}
// 2 vấn đề là hàng trăm k nhận số dưới 20
