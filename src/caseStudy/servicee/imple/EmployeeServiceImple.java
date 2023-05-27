package caseStudy.servicee.imple;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

import caseStudy.Validate.Validate;
import caseStudy.modell.Employee;

import caseStudy.servicee.inter.EmployeeService;
import caseStudy.util.ReadAndWritecsv;

public class EmployeeServiceImple implements EmployeeService {
    List<Employee> employees = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    @Override
    public void add() throws IOException {
        try {
            List<Employee> p1 = new ArrayList<>();
            Employee p = null;
            String fullName = getFullName();
            Calendar dayOfBirth = enterdateOfBirth();
            String general = getGeneral();
            String cmndNumber = getCMND();
            String numberCall = getNumberCall();
            String idEmployee = getIdEmployee();
            String levelStudy = getLevelStudy();
            String location = getLocal();
            String email = getEmail();
            int salary = getSalary();
            p = new Employee(fullName, dayOfBirth, general, cmndNumber, numberCall, email, idEmployee, levelStudy, location, salary);
            if (p != null) {
                List<Employee> employees = ReadAndWritecsv.readCSV();
                p1.add(p);
                ReadAndWritecsv.writeCSV(p1);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }//catch (IOException e)
//        {
//            throw new IOException();
//        }catch (FileNotFoundException e)
////        {
////            throw new FileNotFoundException();
////        }
    }

    @Override
    public void edit() {
        try {
            List<Employee> employees = ReadAndWritecsv.readCSV();
            if (employees.size() == 0) {
                System.out.println("Khong co thong tin");
            } else {
                System.out.println("Nhap id muon thay doi:");
                String n = sc.nextLine();
                for (int i = 0; i < employees.size(); i++) {
                    if (employees.get(i).getIdEmployee().equals(n)) {
                        System.out.println("Ban co the thay doi");
                        int choose;
                        do {
                            System.out.println("1.edit name");
                            System.out.println("2.edit birthday");
                            System.out.println("3.edit gender");
                            System.out.println("4.edit CMND");
                            System.out.println("5.edit Phone");
                            System.out.println("6.edit email");
                            System.out.println("7.edit trinh do hoc van");
                            System.out.println("8.edit position");
                            System.out.println("9.edit salary");
                            System.out.println("10 Huy Edit");
                            choose = Integer.parseInt(sc.nextLine());
                            switch (choose) {
                                case 1:
                                    employees.get(i).setFullName(getFullName());
                                    break;
                                case 2:
                                    employees.get(i).setDateOfBirth(enterdateOfBirth());
                                    break;
                                case 3:
                                    employees.get(i).setGeneral(getGeneral());
                                    break;
                                case 4:
                                    employees.get(i).setCmndNumber(getCMND());
                                    break;
                                case 5:
                                    employees.get(i).setNumberCall(getNumberCall());
                                    break;
                                case 6:
                                    employees.get(i).setEmail(getEmail());
                                    break;
                                case 7:
                                    employees.get(i).setLevelStudy(getLevelStudy());
                                    break;
                                case 8:
                                    employees.get(i).setLocation(getLocal());
                                    break;
                                case 9:
                                    employees.get(i).setSalary(getSalary());
                                    break;
                                case 10:
                                    break;
                            }
                        } while (choose < 10);
                    } else {
                        System.out.println("Khong tim thay id");
                    }
                }
                ReadAndWritecsv.writeCSVEdit(employees);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    @Override
    public void removee()
    {
        String id;
        try{
            List<Employee>employees1=ReadAndWritecsv.readCSV();
            System.out.println("Nhap ma nhan vien ban muon xoa :");
            id=sc.nextLine();
            for (int i = 0; i < employees1.size(); i++) {
                if(employees1.get(i).getIdEmployee().equals(id))
                {
                    employees1.remove(employees1.get(i));
                    System.out.println("Xoa thanh cong");
                    ReadAndWritecsv.writeCSVEdit(employees1);
                }
            }
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }
    @Override
    public void display() throws Exception {
        try {
            List<Employee> employees = ReadAndWritecsv.readCSV();
            if (employees.size() == 0) {
                System.out.println("Khong co thong tin nha");
            } else
                for (Employee e : employees) {
                    System.out.println(e);
                }
        } catch (FileNotFoundException e) {
            throw new FileNotFoundException();
        } catch (Exception e) {
            throw new Exception();
        }
    }

    String getFullName() {
        while (true) {
            try {
                System.out.println("Nhap ho va ten(Nguyen Van Quan) :");
                String name = sc.nextLine();
                if (Validate.isRegexFullName(name)) {
                    return name;
                }
                System.out.println("Ban nhap sai ten");
            } catch (Exception e) {
                System.out.println("Loi ten");
            }
        }
    }

    //    String getDayOfBirth() {
//        while (true) {
//            try {
//
//                System.out.println("Nhập ngày tháng năm  (dd/mm/yyyy): ");
//                String dateStr = sc.nextLine();
//                if (Validate.isDateRight(dateStr)) {
//                    return dateStr;
//                }
//                System.out.println("Bạn nhập sai ngày");
//            } catch (Exception e) {
//                System.out.println("Loi");
//            }
//        }
//    }
    public Calendar stringToCalendar(String date) {
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        Calendar c = null;
        java.util.Date d;
        try {
            d = df.parse(date);
            c = Calendar.getInstance();
            c.setTime(d);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return c;
    }

    public Calendar enterdateOfBirth() {
        String date;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter Date of birth(DD/MM/YYYY) : ");
            date = sc.nextLine();
            if (date.isEmpty()) {
                System.out.println("The input is empty !Please re-enter\"");
            } else if (Validate.isValidDate(date)) {
                Calendar c = stringToCalendar(date);
                if (!Validate.isFormatDay(date)) {
                    System.out.println("Nhap sai dinh dang(DD/MM/YYYY)");
                } else if (Validate.isEnoughAge(c)) {
                    return c;
                } else {
                    System.out.println("The age must greater than 18 years old ! ");
                }
            } else {
                System.out.println("The date of birth you just entered is  invalid !Please re-enter");
            }
        }
    }

    String getGeneral() {
        System.out.println("Nhập giới tính :");
        System.out.println("1. Nam");
        System.out.println("2. Nu");
        int n = Integer.parseInt(sc.nextLine());
        String general = null;
        switch (n) {
            case 1:
                general = "NAM";
                break;
            case 2:
                general = "NU";
                break;
        }
        return general;
    }

    String getEmail() {
        System.out.println("Nhap email:");
        return sc.nextLine();
    }

    String getCMND() {
        while (true) {
            System.out.println("Nhap cmnd(nhap du 9-12 so ):");
            String cm = sc.nextLine();
            if (Validate.isCMND(cm)) {
                return cm;
            } else {
                System.out.println("Nhap lai ho cai:");
            }
        }
    }

    String getNumberCall() {
        while (true) {
            System.out.println("Nhap dum cai so dien thoai:");
            String n = sc.nextLine();
            if (Validate.isPhone(n)) {
                return n;
            } else {
                System.out.println("Moi ban nhap lai");
            }
        }
    }

    String getIdEmployee() throws Exception {
        try {
            while (true) {
                System.out.println("NHap id:");
                String id=sc.nextLine();
                if (!Validate.isId(id)) {
                    System.out.println("id formatting(KH-YYYY) :");
                    id = sc.nextLine();
                } else {
                    if (checkDuplicateIDCustomer(id)) {
                        System.out.println("The duplicate id :");
                        id = sc.nextLine();
                    } else {
                        return id;
                    }
                }
            }
        }catch (FileNotFoundException e)
        {
            throw new FileNotFoundException();
        }
//        System.out.println("Nhap Id cua nhan vien");
//        int n=Integer.parseInt(sc.nextLine());
//        return n;
    }
    public static boolean checkDuplicateIDCustomer(String id) throws Exception {
        List<Employee>employees=ReadAndWritecsv.readCSV();
        for (int i = 0; i < employees.size(); i++) {
            if(employees.get(i).getIdEmployee().equals(id))
            {
                return true;
            }
        }
        return false;
    }

    String getLevelStudy() {
        System.out.println("Trinh do cua nhan vien:");
        System.out.println("1. Cap hai");
        System.out.println("2. Cap ba");
        System.out.println("3. Dai Hoc");
        int n = Integer.parseInt(sc.nextLine());
        String level = null;
        switch (n) {
            case 1:
                level = "Cap Hai";
                break;
            case 2:
                level = "Cap ba";
                break;
            case 3:
                level = "Dai hoc";
                break;
        }
        return level;
    }

    String getLocal() {
        System.out.println("Vi tri lam viec:");
        System.out.println("1. Thu Ngan");
        System.out.println("2. Nhan vien");
        System.out.println("3. Quan li");
        int n = Integer.parseInt(sc.nextLine());
        String local = null;
        switch (n) {
            case 1:
                local = "Thu ngan";
                break;
            case 2:
                local = "Nhan vien";
                break;
            case 3:
                local = "Quan li";
                break;
        }
        return local;
    }

    int getSalary() {
        while (true) {
            System.out.println("Luong cua nhan vien(Luu y lon hon 0):");
            int n = Integer.parseInt(sc.nextLine());
            if (n > 0) {
                return n;
            } else {
                System.out.println("Moi ban nhap lai");
            }
        }
    }
}
