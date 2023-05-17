package ss17.java.bai2;

import ss17.java.bai1.Product;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner sc = new Scanner(System.in);
        Test t = new Test();
        Product p1 = new Product(1, "A", "AB", 123, "OKE");
        System.out.println("Nhap duong link muon day file vao :");
        String path = sc.nextLine();
        ReadAndWrite.writeObject(path, p1);
        List<Product> result = ReadAndWrite.readObjectList(path);
        for (Product p : result) {
            System.out.println(p);
        }
    }
}
