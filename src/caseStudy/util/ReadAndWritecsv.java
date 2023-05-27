package caseStudy.util;

import caseStudy.modell.Customer;
import caseStudy.modell.Employee;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.io.*;

public class ReadAndWritecsv {
    public static final String FILE_PATH = "D:\\Code_Code_Code(G)\\Module-2\\src\\caseStudy\\data\\Employee.csv";
    public static final String FILE_PATHCUSTOMER = "D:\\Code_Code_Code(G)\\Module-2\\src\\caseStudy\\data\\Customer.csv";

    public static List<Employee> readCSV() throws Exception {
        List<Employee> e = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(FILE_PATH);
            BufferedReader bf = new BufferedReader(fileReader);
            String line;
            while ((line = bf.readLine()) != null) {
                String[] lineArr = line.split(",");
                if (lineArr.length == 10) {
                    DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
                    Calendar c = null;
                    java.util.Date d;
                    try {
                        d = df.parse(lineArr[1]);
                        c = Calendar.getInstance();
                        c.setTime(d);
                    } catch (ParseException b) {
                        b.printStackTrace();
                    }
                    Calendar dateOfBirth = c;
                    e.add(new Employee(lineArr[0], dateOfBirth, lineArr[2], lineArr[3], lineArr[4], lineArr[5], lineArr[6], lineArr[7], lineArr[8], Integer.parseInt(lineArr[9])));
                }
            }
            return e;
        } catch (FileNotFoundException b) {
            throw new FileNotFoundException();
        } catch (NumberFormatException b) {
            throw new NumberFormatException();
        } catch (IOException b) {
            throw new Exception();
        } catch (Exception b) {
            throw new Exception();
        }
    }
    public static void writeCSV(List<Employee> e) throws Exception {
        try {
            FileWriter fileWriter = new FileWriter(FILE_PATH, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            if (e.size() > 0) {
                for (Employee i : e) {
                    bufferedWriter.write("" + i.getInforToCsv() + "\n");
                    bufferedWriter.newLine();
                }
                bufferedWriter.close();
            }
        } catch (FileNotFoundException b) {
            throw new FileNotFoundException();
        } catch (NumberFormatException b) {
            System.out.println("Lỗi ghi file");
            throw new NumberFormatException();
        } catch (IOException b) {
            throw new IOException();
        } catch (Exception b) {
            throw new Exception();
        }
    }

    public static void writeCSVEdit(List<Employee> e) throws Exception {
        try {
            FileWriter fileWriter = new FileWriter(FILE_PATH, false);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            if (e.size() > 0) {
                for (Employee i : e) {
                    bufferedWriter.write("" + i.getInforToCsv() + "\n");
                    bufferedWriter.newLine();
                }
                bufferedWriter.close();
            }
        } catch (FileNotFoundException b) {
            throw new FileNotFoundException();
        } catch (NumberFormatException b) {
            System.out.println("Lỗi ghi file");
            throw new NumberFormatException();
        } catch (IOException b) {
            throw new IOException();
        } catch (Exception b) {
            throw new Exception();
        }
    }
    // customer
    public static List<Customer> readCSVCustomer() throws Exception {
        List<Customer> customers = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(FILE_PATHCUSTOMER);
            BufferedReader bf = new BufferedReader(fileReader);
            String line;
            while ((line = bf.readLine()) != null) {
                String[] lineArr = line.split(",");
                if (lineArr.length == 10) {
                    DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
                    Calendar c = null;
                    java.util.Date d;
                    try {
                        d = df.parse(lineArr[2]);
                        c = Calendar.getInstance();
                        c.setTime(d);
                    } catch (ParseException b) {
                        b.printStackTrace();
                    }
                    Calendar dateOfBirth = c;
                    customers.add(new Customer(Integer.parseInt(lineArr[0]),lineArr[1],dateOfBirth,lineArr[3],lineArr[4],lineArr[5],lineArr[6],lineArr[7],lineArr[8],lineArr[9]));
                }
            }
            return customers;
        } catch (FileNotFoundException b) {
            throw new FileNotFoundException();
        } catch (NumberFormatException b) {
            throw new NumberFormatException();
        } catch (IOException b) {
            throw new Exception();
        } catch (Exception b) {
            throw new Exception();
        }
    }
    public static void writeCSVCustomer(List<Customer> customers) throws Exception {
        try {
            FileWriter fileWriter = new FileWriter(FILE_PATHCUSTOMER, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            if (customers.size() > 0) {
                for (Customer i : customers) {
                    bufferedWriter.write("" + i.getInforCSV() + "\n");
                    bufferedWriter.newLine();
                }
                bufferedWriter.close();
            }
        } catch (FileNotFoundException b) {
            throw new FileNotFoundException();
        } catch (NumberFormatException b) {
            System.out.println("Lỗi ghi file");
            throw new NumberFormatException();
        } catch (IOException b) {
            throw new IOException();
        } catch (Exception b) {
            throw new Exception();
        }
    }
    public static void writeCSVEditCustomer(List<Customer> customers) throws Exception {
        try {
            FileWriter fileWriter = new FileWriter(FILE_PATHCUSTOMER, false);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            if (customers.size() > 0) {
                for (Customer i : customers) {
                    bufferedWriter.write("" + i.getInforCSV() + "\n");
                    bufferedWriter.newLine();
                }
                bufferedWriter.close();
            }
        } catch (FileNotFoundException b) {
            throw new FileNotFoundException();
        } catch (NumberFormatException b) {
            System.out.println("Lỗi ghi file");
            throw new NumberFormatException();
        } catch (IOException b) {
            throw new IOException();
        } catch (Exception b) {
            throw new Exception();
        }
    }
}
