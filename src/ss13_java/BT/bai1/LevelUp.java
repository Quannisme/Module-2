package ss13_java.BT.bai1;

import java.util.Scanner;

public class LevelUp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String n;
        System.out.println("Nhap chuoi vao :");
        n=sc.nextLine();
        int temp=0;
        String arr[]=n.split("");
        for (int i = 0; i < arr.length; i++) {
            char ch=arr[i].charAt(0);
            if(temp<(int)ch)
            {
                System.out.print(ch);
                temp=(int)ch;
            }
        }
    }
}
