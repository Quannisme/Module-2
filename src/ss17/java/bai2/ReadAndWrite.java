package ss17.java.bai2;

import ss17.java.bai1.Product;

import java.io.*;
import java.util.List;

public class ReadAndWrite {
    public static void writeObject(String Path,Product product) throws IOException {
        FileOutputStream fos=new FileOutputStream(Path,true);
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(product);
        oos.close();
    }
    public static void writeObjectList(String Path,List<Product> products) throws IOException
    {
        FileOutputStream fos=new FileOutputStream(Path);
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(products);
        oos.close();
    }
    public static Product readObject(String Path) throws IOException, ClassNotFoundException {
        FileInputStream fis=new FileInputStream(Path);
        ObjectInputStream ois=new ObjectInputStream(fis);
        Product p=(Product)ois.readObject();
        ois.close();
        return p;
    }
    public static List<Product> readObjectList(String Path) throws IOException, ClassNotFoundException {
        FileInputStream fis=new FileInputStream(Path);
        ObjectInputStream ois=new ObjectInputStream(fis);
        List<Product>p=(List<Product>) ois.readObject();
        ois.close();
        return p;
    }
}
