package Final.exam.util;

import Final.exam.modell.ChinhHang;
import Final.exam.modell.DienThoai;
import Final.exam.modell.XachTay;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWritecsv {
    public static final String FILE_PATH="D:\\Code_Code_Code(G)\\Module-2\\src\\Final\\exam\\data\\DienThoai.csv";
    public static final String FILE_PATH2="D:\\Code_Code_Code(G)\\Module-2\\src\\Final\\exam\\data\\XachTay.csv";

    public static List<ChinhHang> readCSV() throws Exception{
        List<ChinhHang>chinhHangs=new ArrayList<>();
        try {
            FileReader fileReader=new FileReader(FILE_PATH);
            BufferedReader bf=new BufferedReader(fileReader);
            String line;
            while ((line=bf.readLine()) !=null)
            {
                String [] lineArr=line.split(",");
                if(lineArr.length==7)
                {
                    chinhHangs.add(new ChinhHang(Integer.parseInt(lineArr[0]),lineArr[1],Integer.parseInt(lineArr[2]),Integer.parseInt(lineArr[3]),lineArr[4],lineArr[5],lineArr[6]));
                }
            }
            return chinhHangs;
        }catch (FileNotFoundException e)
        {
            throw new FileNotFoundException();
        }
    }
    public static void writeCSV(List<ChinhHang>chinhHangs) throws Exception{
        try {
            FileWriter fileWriter=new FileWriter(FILE_PATH,true);
            BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
            if(chinhHangs.size()>0)
            {
                for(ChinhHang e:chinhHangs)
                {
                    bufferedWriter.write("" +e.getInfor() + "\n");
                    bufferedWriter.newLine();
                }
                bufferedWriter.close();
            }
        }catch (FileNotFoundException e)
        {
            throw new FileNotFoundException();
        }catch (NumberFormatException e)
        {
            throw new NumberFormatException();
        }catch (IOException e)
        {
            throw new IOException();
        }catch (Exception e)
        {
            throw new Exception();
        }
    }
    public static void writeCSVXOA(List<ChinhHang>chinhHangs) throws Exception{
        try {
            FileWriter fileWriter=new FileWriter(FILE_PATH,false);
            BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
            if(chinhHangs.size()>0)
            {
                for(ChinhHang e:chinhHangs)
                {
                    bufferedWriter.write(""+e.getInfor()+"\n");
                    bufferedWriter.newLine();
                }
                bufferedWriter.close();
            }
        }catch (FileNotFoundException e)
        {
            throw new FileNotFoundException();
        }catch (NumberFormatException e)
        {
            throw new NumberFormatException();
        }catch (IOException e)
        {
            throw new IOException();
        }catch (Exception e)
        {
            throw new Exception();
        }
    }
    // xach tay
    public static List<XachTay> readCSVXachTay() throws Exception{
        List<XachTay>xachTays=new ArrayList<>();
        try {
            FileReader fileReader=new FileReader(FILE_PATH2);
            BufferedReader bf=new BufferedReader(fileReader);
            String line;
            while ((line=bf.readLine())!=null)
            {
                String [] lineArr=line.split(",");
                if(lineArr.length==7)
                {
                    xachTays.add(new XachTay(Integer.parseInt(lineArr[0]),lineArr[1],Integer.parseInt(lineArr[2]),Integer.parseInt(lineArr[3]),lineArr[4],lineArr[5],lineArr[6]));
                }
            }
            return xachTays;
        }catch (FileNotFoundException e)
        {
            throw new FileNotFoundException();
        }
    }
    public static void writeCSVXachTay(List<XachTay>xachTays) throws Exception{
        try {
            FileWriter fileWriter=new FileWriter(FILE_PATH2,true);
            BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
            if(xachTays.size()>0)
            {
                for(XachTay e:xachTays)
                {
                    bufferedWriter.write(""+e.getInfor()+"\n");
                    bufferedWriter.newLine();
                }
                bufferedWriter.close();
            }
        }catch (FileNotFoundException e)
        {
            throw new FileNotFoundException();
        }catch (NumberFormatException e)
        {
            throw new NumberFormatException();
        }catch (IOException e)
        {
            throw new IOException();
        }catch (Exception e)
        {
            throw new Exception();
        }
    }
    public static void writeCSVXachTayXoa(List<XachTay>xachTays) throws Exception{
        try {
            FileWriter fileWriter=new FileWriter(FILE_PATH2,false);
            BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
            if(xachTays.size()>0)
            {
                for(XachTay e:xachTays)
                {
                    bufferedWriter.write(""+e.getInfor()+"\n");
                    bufferedWriter.newLine();
                }
                bufferedWriter.close();
            }
        }catch (FileNotFoundException e)
        {
            throw new FileNotFoundException();
        }catch (NumberFormatException e)
        {
            throw new NumberFormatException();
        }catch (IOException e)
        {
            throw new IOException();
        }catch (Exception e)
        {
            throw new Exception();
        }
    }
}
