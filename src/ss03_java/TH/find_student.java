package ss03_java.TH;

import java.util.Scanner;

public class find_student {
    public static void main(String[] args) {
        String[] student={"Trung ", "Thành ","Hà" , "Quân"};
        String name;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name you want to find:");
        name=sc.nextLine();
        for (int i = 0; i < student.length; i++) {
            if(student[i].equals(name))
            {
                System.out.println("Find:"+(i+1));
            }
        }
    }
}
// không tìm đc
