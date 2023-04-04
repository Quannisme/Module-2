package ss04_java.BT;

import java.util.Scanner;

public class QuadraticEquation {
    private double a, b, c;

    QuadraticEquation() {
    }

    QuadraticEquation(double A, double B, double C) {
        this.a = A;
        this.b = B;
        this.c = C;
    }

    public double getA() {
        return this.a;
    }

    public double getB() {
        return this.b;
    }

    public double getC() {
        return this.c;
    }

    public double getDiscriminant() {
        return Math.pow(this.b, 2) - 4 * this.a * this.c;
    }

    public double getRoot1() {
        return (-this.b + Math.sqrt(Math.pow(this.b, 2) - 4 * this.a * this.c)) / 2 * this.a;
    }

    public double getRoot2() {
        return (-this.b - Math.sqrt(Math.pow(this.b, 2) - 4 * this.a * this.c)) / 2 * this.a;
    }

    public static void main(String[] args) {
        double a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a:");
        a = sc.nextDouble();
        System.out.println("Enter b:");
        b = sc.nextDouble();
        System.out.println("Enter c:");
        c = sc.nextDouble();
        QuadraticEquation q1 = new QuadraticEquation(a, b, c);
        System.out.println("Dental:" + q1.getDiscriminant());
        if (q1.getDiscriminant() >= 0) {
            System.out.println("2 Root:" + q1.getRoot1() + " " + q1.getRoot2());
        } else if (q1.getDiscriminant() == 0) {
            System.out.println("root:" + q1.getRoot1());
        } else {
            System.out.println("The equation has no roots");
        }
    }
}
