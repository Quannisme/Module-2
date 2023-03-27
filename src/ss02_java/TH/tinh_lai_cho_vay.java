package ss02_java.TH;

import java.util.Scanner;

public class tinh_lai_cho_vay {
    public static void main(String[] args) {
        double deposit_amount;
        int month;
        double interest;
        double result=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter deposit amount:");deposit_amount=sc.nextDouble();
        System.out.println("enter interest:");interest= sc.nextDouble();
        System.out.println("enter month:");month= sc.nextInt();
        for (int i = 0; i < month; i++) {
            result +=deposit_amount*(interest*100)/12*month;
        }
        System.out.println("Result:"+result);
    }
}
