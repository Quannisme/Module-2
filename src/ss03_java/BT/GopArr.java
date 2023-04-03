package ss03_java.BT;

public class GopArr {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = {4, 5, 6};
        int[] c;
        c = new int[a.length + b.length];
        int temp = 0;
        for (int value : a) {
            c[temp] = value;
            temp++;
        }
        for (int value : b) {
            c[temp] = value;
            temp++;
        }
        for (int value : c) {
            System.out.println(value);
        }
    }
}
