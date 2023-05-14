package ss16.java.TH;

import java.io.*;
import java.lang.reflect.Field;
import java.util.Scanner;

public class ReadFile {
    public void readFile(String path)
    {
        try {
            File f1=new File(path);
            if(!f1.exists())
            {
                throw new FileNotFoundException();
            }
            BufferedReader br=new BufferedReader(new FileReader(f1));
            String line="";
            int sum=0;
            while((line=br.readLine())!=null)
            {
                System.out.println(line);
                sum+=Integer.parseInt(line);
            }
            System.out.println("Tong :"+sum);
        }catch(Exception e)
        {
            System.out.println("Loi doc file");
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap duong chuyen:");
        String a= sc.nextLine();
        ReadFile f1=new ReadFile();
        f1.readFile(a);
    }
}
