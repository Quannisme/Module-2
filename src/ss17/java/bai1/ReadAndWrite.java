package ss17.java.bai1;

import ss17.java.bai1.Product;

import java.io.*;
import java.util.List;

public class ReadAndWrite {
    private static final String FILE_PATH="D:\\Code_Code_Code(G)\\Module-2\\src\\ss17\\java\\Product.txt";
    public static void writeObject(Product product) throws IOException {
        FileOutputStream fos=new FileOutputStream(FILE_PATH);
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(product);
        oos.close();
    }
    public static void writeObjectList(List<Product>products) throws IOException
    {
        FileOutputStream fos=new FileOutputStream(FILE_PATH);
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(products);
        oos.close();
    }
    public static Product readObject() throws IOException, ClassNotFoundException {
        FileInputStream fis=new FileInputStream(FILE_PATH);
        ObjectInputStream ois=new ObjectInputStream(fis);
        Product p=(Product)ois.readObject();
        ois.close();
        return p;
    }
    public static List<Product> readObjectList() throws IOException, ClassNotFoundException {
        FileInputStream fis=new FileInputStream(FILE_PATH);
        ObjectInputStream ois=new ObjectInputStream(fis);
        List<Product>p=(List<Product>) ois.readObject();
        ois.close();
        return p;
    }
}
