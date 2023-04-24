package ss12.java.bai2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountTheNumber {
    public static void main(String[] args) {
        Map<String ,Integer>myMap=new HashMap<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập chuỗi :");
        String temp=sc.nextLine();
        String arr[]=temp.split("\\s");
        for (int i = 0; i < arr.length; i++) {
            if(myMap.containsKey(arr[i]))
            {
                int count=myMap.get(arr[i])+1;
                myMap.put(arr[i],count);
            }else {
                myMap.put(arr[i],1);
            }
        }
        for(String w: myMap.keySet())
        {
            System.out.println(w+myMap.get(w));
        }
    }
}
