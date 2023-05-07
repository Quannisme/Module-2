package ss14.java.BT;

public class bai2 {
        public static void insertionSort(int[] array){
            int pos, x;
            for(int i = 1; i < array.length; i++){ 
                x = array[i];
                pos = i;
                while(pos > 0 && x < array[pos-1]){
                    array[pos] = array[pos-1]; 
                    pos--;
                }
                array[pos] = x;
            }
        }

    public static void main(String[] args) {
        int []arr={1,3,2,4,6,5,9,7};
        insertionSort(arr);
        System.out.println(arr);
    }
}
