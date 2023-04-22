package ss12.java.BT.bai1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ProductManager{
    ArrayList<Product>productList=new ArrayList<>();
    void addProduct(Product p)
    {
        productList.add(p);
    }
    void delete(Product p)
    {
        productList.remove(p);
    }
    void editProduct(int id,String name, double price)
    {
        for(Product p1: productList)
        {
            if(p1.getId()==id)
            {
                p1.setName(name);
                p1.setPrice(price);
                System.out.println("Complete fix");
                break;
            }else
            {
                System.out.println("NO ID");
            }
        }
    }
    void showList()
    {
        for(Product p1: productList)
        {
            System.out.println(p1.getId()+" "+p1.getName()+" "+p1.getPrice());
        }
    }
    void searchList(int id)
    {
        for(Product p1: productList)
        {
            if(p1.getId()==id)
            {
                System.out.println(p1.getId()+" "+p1.getName()+" "+p1.getPrice());
            }
        }
    }
    void sortList()
    {
        Collections.sort(productList, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return (int) (o1.getPrice()-o2.getPrice());
            }
        });
        showList();
    }
}
