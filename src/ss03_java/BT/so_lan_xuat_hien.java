package ss03_java.BT;

import java.util.Scanner;

public class so_lan_xuat_hien {
    public static void main(String[] args) {
        String str="NBS";
        Scanner sc=new Scanner(System.in);
        char t;
        int temp=0;
        System.out.println(str);
        System.out.println("Nhập kí tự muốn đếm:");
        t= sc.next().charAt(0);
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)==t)
            {
                temp++;
            }
        }
        System.out.println("Số lần lặp"+temp);
    }
}
