package ss14.java.BT;

import javax.swing.text.html.FormView;
import java.util.*;
public class bai1{
    public static void main(String[] args) {
        int []arr= {1, 3, 2, 8, 6, 4, 5, 9};
        int pos,x;
        for (int i = 1 ; i < arr.length; i++) {
            x=arr[i];
            pos=i;
            while(pos>=0 &&x<arr[pos-1])
            {
                arr[pos]=arr[pos-1];
                pos--;
            }
            arr[pos]=x;
            System.out.println("buoc thu "+i+Arrays.toString(arr));
        }
    }
}
