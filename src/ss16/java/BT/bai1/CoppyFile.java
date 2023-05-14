package ss16.java.BT.bai1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CoppyFile {

    public static final String FILE_PATH2 = "D:\\codegym\\Module-2\\src\\ss16\\java\\BT\\bai1\\Target.csv";
    public static final String FILE_PATH3 = "D:\\Code_Code_Code(G)\\Module-2\\src\\ss16\\java\\BT\\bai1\\Ssource.csv";

    public static List<Integer>readCSV() throws IOException {
        List<Integer>number=new ArrayList<>();
        try
        {
            FileReader fileReader=new FileReader(FILE_PATH3);
            BufferedReader br=new BufferedReader(fileReader);
            String line;
            String temp[];
            while ((line=br.readLine())!=null)
            {
                number.add(Integer.parseInt(line));
            }
        }catch (FileNotFoundException e)
        {
            System.out.println("File khong ton tai");
        }
        return number;
        }
    public static void writeCSV(List<Integer>number) throws IOException {
        FileWriter fileWriter=new FileWriter(FILE_PATH2,true);
        BufferedWriter bw=new BufferedWriter(fileWriter);
        for(int i:number)
        {
            bw.write(""+i);
            bw.newLine();
        }
        bw.close();
    }

}
