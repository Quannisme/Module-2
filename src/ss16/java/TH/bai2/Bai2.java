package ss16.java.TH.bai2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bai2 {
    public List<Integer> readFile(String a)
    {
        List<Integer>number=new ArrayList<>();
        try {
            File f1=new File(a);
            if(!f1.exists())
            {
                throw new FileNotFoundException("Khong doc duoc file");
            }
            BufferedReader br=new BufferedReader(new FileReader(f1));
            String line="";
            while ((line=br.readLine())!=null)
            {
                number.add(Integer.parseInt(line));
            }
        }catch (Exception e)
        {
            System.out.println("Khong doc file duoc");
        }
        return number;
    }
    public void writeFile(String pathFile , int max)
    {
        try {
            FileWriter writer=new FileWriter(pathFile,true);
            BufferedWriter bw=new BufferedWriter(writer);
            bw.write("Gia tri lon nhat :"+max);

        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    public static int findMax(List<Integer> number)
    {
        int max=number.get(0);
        for (int i = 0; i < number.size(); i++) {
            if(max<number.get(i))
            {
                max=number.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Bai2 b=new Bai2();
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap duong dan vao:");
        String a=sc.nextLine();
        b.readFile(a);
    }
}
