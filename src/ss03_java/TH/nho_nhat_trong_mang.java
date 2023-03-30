package ss03_java.TH;

public class nho_nhat_trong_mang {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6};
        for(int value:arr)
        {
            System.out.println(value);
        }
        int index=min(arr);
        System.out.println(arr[index]);
    }
    public static int min(int a[])
    {
        int min=0;
        for (int i = 0; i < a.length; i++) {
            if(a[i]<a[0])
            {
                i=min;
            }
        }
        return min;
    }
}
