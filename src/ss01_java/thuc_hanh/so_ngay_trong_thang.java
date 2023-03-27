package ss01_java.thuc_hanh;

import java.util.Scanner;

public class so_ngay_trong_thang {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập số tháng bạn mong muốn ");
        n= sc.nextInt();
        switch (n)
        {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Tháng này có 31 ngày ");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Tháng này có 30 ngày");
                break;
            case 2:
                System.out.println("tháng này có thể có 28 hoặc 29 ngày");
                break;
            default:
                System.out.println("Bạn nhập tháng bị lỗi ");
        }
    }
}
