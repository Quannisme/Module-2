package ss16.java.BT.bai1;

import java.io.IOException;
import java.util.List;

public class Test {
    public static void main(String[] args) throws IOException {
        List<Integer>number=CoppyFile.readCSV();
        for(int i:number)
        {
            System.out.println(i);
        }
        CoppyFile.writeCSV(number);
    }
}
