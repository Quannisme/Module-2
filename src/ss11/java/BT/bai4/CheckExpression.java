package ss11.java.BT.bai4;

import java.util.Scanner;
import java.util.Stack;

public class CheckExpression {
    public static void main(String[] args) {
        Stack<String> bStack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        boolean check = true;
        System.out.println("Nhap chuoi:");
        String n = sc.nextLine();
        String arr[] = n.split("");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equalsIgnoreCase(")")) {
                check = false;
                break;
            } else if (arr[i].equalsIgnoreCase("(")) {
                bStack.push(arr[i]);
            } else if (arr[i].equalsIgnoreCase(")")) {
                if (bStack.isEmpty()) {
                    check = false;
                    break;
                } else {
                    bStack.pop();

                }
            }
        }
        if (check) {
            if (bStack.isEmpty()) {
                System.out.println("Well");
            } else {
                System.out.println("???");
            }
        } else {
            System.out.println("????");
        }
    }
}
