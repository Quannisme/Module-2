package ss03_java.BT;

import java.util.Scanner;

public class delete_arr {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6,7};
        for(int value:arr)
        {
            System.out.println(value);
        }
        Scanner sc=new Scanner(System.in);
        int index;
        System.out.println("enter index:");
        index=sc.nextInt();
        delete(arr,index);
    }
    public static void delete(int arr[], int index)
    {
        int size=arr.length;
        for (int i = 0; i < arr.length; i++) {
//            arr[i]=arr[i+1];
            if(arr[i]==index)
            {
                for (int j = i; j < arr.length; j++) {
                    arr[i]=arr[i+1];
                }
            }
        }
        size--;
        for(int value:arr)
        {
            System.out.println(value);
        }
    }
}
