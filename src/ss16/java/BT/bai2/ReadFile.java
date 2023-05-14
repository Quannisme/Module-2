package ss16.java.BT.bai2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {

    public static final String PATH_FILE = "D:\\codegym\\Module-2\\src\\ss16\\java\\BT\\bai2\\Nation.csv";

    public static List<National>readCSV() throws IOException {
        List<National>na=new ArrayList<>();
        FileReader f1=new FileReader(PATH_FILE);
        BufferedReader br=new BufferedReader(f1);
        String line;
        National national;
        String temp[];
        while((line=br.readLine())!=null)
        {
            temp=line.split(",");
            int id=Integer.parseInt(temp[0]);
            String code=temp[1];
            String name=temp[2];
            national=new National(id,code,name);
            na.add(national);
        }
        br.close();
        return na;
    }
}
