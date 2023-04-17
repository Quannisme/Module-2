package ss10.java.BT.bai1;

public class TestMylist {
    public static void main(String[] args) {
        MyList<Integer> test = new MyList<Integer>();
        test.add(2);
        test.add(3);
        System.out.println(test.get(1));
        System.out.println(test.size());
//        test.clear();
        System.out.println(test.size());
        MyList<Integer> test2 = (MyList<Integer>) test.clonee();
        System.out.println(test2.get(1));
//        test.remove(1);
        System.out.println(test.get(1));
        System.out.println(test.contain(2));
    }
}
