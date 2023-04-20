package ss11.java.BT.Bai2;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Change {
    public static void main(String[] args) {
        Stack<Integer> change = new Stack<>();
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.println("Nhập số cần chuyển:");
        number = sc.nextInt();
        while (number > 0) {
            int temp = number % 2;
            change.push(temp);
            number = number / 2;
        }
        System.out.println("Kết quả:");
        while (!change.isEmpty()) {
            System.out.print(change.pop());
        }
    }
}
