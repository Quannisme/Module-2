package ss03_java.BT;

public class min_array {
    public static void main(String[] args) {
        int []arr={1,2,3,4};
        for(int value:arr)
        {
            System.out.println(value);
        }
        int min=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<arr[0])
            {
                i=min;
            }
        }
        System.out.println("Giá trị nhỏ nhất"+arr[min]);
    }
}
