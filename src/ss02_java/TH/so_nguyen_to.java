package ss02_java.TH;

import java.util.Scanner;

public class so_nguyen_to {
    public static void main(String[] args) {
        int a;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number:");
        a= sc.nextInt();
        if(a<2)
        {
            System.out.println("it is not prime ");
        }else
        {
            int i=2;
            boolean check = true;
            while (i <= Math.sqrt(a)) {
                if (a % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check)
                System.out.println(a + " is a prime");
            else
                System.out.println(a + " is not a prime");
        }
        }
    }

