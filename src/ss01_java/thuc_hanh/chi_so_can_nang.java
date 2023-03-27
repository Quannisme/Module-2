package ss01_java.thuc_hanh;

import java.util.Scanner;

public class chi_so_can_nang {
    public static void main(String[] args) {
        double weight;
        double height;
        double bmi;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your weight:");weight=sc.nextDouble();
        System.out.println("Enter your height:");height=sc.nextDouble();
        bmi=weight/Math.pow(height,2);
        System.out.println("BMI:"+bmi);
        if(bmi<18.5)
        {
            System.out.println("Underweight");
        } else if (bmi<25) {
            System.out.println("Normal");
        } else if (bmi<30) {
            System.out.println("Overweight");
        }else
        {
            System.out.println("obese");
        }
    }
}
