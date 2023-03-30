package ss03_java.TH;

import java.util.Scanner;

public class change_temp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int choose;
        double a;
        double b;
        do {
            System.out.println("Menu");
            System.out.println("1:Fahrenheit to Celsius");
            System.out.println("2:Celsius to Fahrenheit");
            System.out.println("0:Exit ");
            System.out.println("Choose ");
            choose=sc.nextInt();
            switch (choose)
            {
                case 1:
                    System.out.println("Enter Fahremheit:");
                    a=sc.nextDouble();
                    System.out.println(Celsius(a));
                    break;
                case 2 :
                    System.out.println("Enter Celsius");
                    b= sc.nextDouble();
                    System.out.println(Fahremheit(b));
                    break;
            }
        }while (choose!=0);
    }
    public static double Celsius(double a)
    {
        double celsius=(5.0/9)*(a-32);
        return celsius;
    }
    public static double Fahremheit(double a)
    {
        double fahremheit=(9.0 / 5) * a + 32;
        return fahremheit;
    }
}
