package ss13_java.BT.bai3;

import java.util.Calendar;
import java.util.LinkedList;
import java.util.Scanner;

public class LevelUp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Character> max = new LinkedList<>();
        LinkedList<Character> list = new LinkedList<>();
        System.out.println("Nhap chuoi ki tu:");
        String n = sc.nextLine();
        for (int i = 0; i < n.length(); i++) {
            if (list.size() < 1 && n.charAt(i) < list.getLast() && list.contains(n.charAt(i))) {
                list.clear();
            }
            list.add(n.charAt(i));
            if (list.size() > max.size()) {
                max.clear();
                max.addAll(list);
            }
        }
        for (Character c : max) {
            System.out.println(c);
        }
    }
}
