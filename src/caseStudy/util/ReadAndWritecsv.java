package caseStudy.util;

import caseStudy.modell.Employee;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.io.*;

public class ReadAndWritecsv {
    public static final String FILE_PATH="D:\\Code_Code_Code(G)\\Module-2\\src\\caseStudy\\data\\Employee.csv";
    public static List<Employee>readCSV() throws Exception {
        List<Employee>e=new ArrayList<>();
        try{
            FileReader fileReader=new FileReader(FILE_PATH);
            BufferedReader bf=new BufferedReader(fileReader);
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            String line;
            while((line= bf.readLine())!=null)
            {
                String[] lineArr = line.split(",");
                if(lineArr.length==9)
                {
                    e.add(new Employee(lineArr[0],LocalDate.parse(lineArr[1],formatter),lineArr[2],lineArr[3],lineArr[4],lineArr[5],lineArr[6],lineArr[7],Integer.parseInt(lineArr[8])));
                }
            }
            return e;
        }catch (FileNotFoundException b)
        {
            throw new FileNotFoundException();
        }catch (NumberFormatException b) {
            throw new NumberFormatException();
        }catch (IOException b)
        {
            throw new Exception();
        }catch (Exception b)
        {
            throw new Exception();
        }
    }
}
