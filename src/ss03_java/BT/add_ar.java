package ss03_java.BT;

public class add_ar {
    public static void main(String[] args) {
        int []a={1,2,3,4,5,6};
        for(int value:a)
        {
            System.out.println(value);
        }
        System.out.println("them");
        add(a,8,2);
    }
    public static void add(int a[], int index , int location)
    {
        int size=a.length;
        int []b = new int[size+1];
        for (int i = 0; i < location; i++)
            b[i] = a[i];
        b[location] = index;
        for (int j = location+1; j < b.length; j++) {
            b[j] = a[j-1];
        }
        for(int value:b)
        {
            System.out.println(value);
        }
    }

    }
//public class test {
//    public static void main(String[] args) {
//        int []a={1,2,3,4,5,6};
//        for(int value:a)
//        {
//            System.out.println(value);
//        }
//        System.out.println("them");
//        add(a,8,2);
//    }
//    public static void add(int a[], int index , int location)
//    {
//        int size = a.length;
//        int []b = new int[size+1];
//        for (int i = 0; i < location; i++)
//            b[i] = a[i];
//        b[location] = index;
//        for (int j = location+1; j < b.length; j++) {
//            b[j] = a[j-1];
//        }
//        for(int value:b)
//        {
//            System.out.println(value);
//        }
//    }
//}
