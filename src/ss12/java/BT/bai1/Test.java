package ss12.java.BT.bai1;

public class Test {
    public static void main(String[] args) {
        ProductManager p1 = new ProductManager();
        p1.addProduct(new Product(1, "A", 123));
        p1.addProduct(new Product(4, "B", 1232));
        p1.addProduct(new Product(3, "C", 1332));
//        p1.showList();
//        p1.sortList();
        p1.showlist();
        p1.sortlist();
        p1.searchProduct(4);
        p1.editProduct(1,"quan",123213);
        p1.showlist();
    }
}
