package caseStudy.servicee.imple;

//import java.lang.foreign.VaList;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

import caseStudy.Validate.Validate;
import caseStudy.modell.Customer;
import caseStudy.modell.Employee;
import caseStudy.servicee.inter.CustomerService;
import caseStudy.util.ReadAndWritecsv;

import java.time.LocalDate;

public class CustomerServiceImple implements CustomerService {
    List<Customer> c1 = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    @Override
    public void add()  {
        try {
            List<Customer> c1 = new ArrayList<>();
            Customer c = null;
            int serial=getSerial();
            String fullName = getFullName();
            Calendar dayOfBirth = enterdateOfBirth();
            String general = getGeneral();
            String cmndNumber = getCmnd();
            String numberCall = getNumberCall();
            String idCustomer = getIdCustomer();
            String typeCustomer = getTypeCustomer();
            String location = getLocation();
            String email = getEmail();
            c = new Customer(serial,fullName, dayOfBirth, general, cmndNumber, numberCall, email, idCustomer, typeCustomer, location);
            if (c != null) {
                ReadAndWritecsv.readCSVCustomer();
                c1.add(c);
                ReadAndWritecsv.writeCSVCustomer(c1);
            }
        }catch (Exception e) {
            throw new RuntimeException(e);
        }
        }

    @Override
    public void edit() throws FileNotFoundException {
        try {
            List<Customer> c1 = ReadAndWritecsv.readCSVCustomer();
            if(c1.size()==0)
            {
                System.out.println("File khong co thong tin ");
            }else {

                System.out.println("Nhap id khach hang can tim:");
                String n = sc.nextLine();
                for (int i = 0; i < c1.size(); i++) {
                    if (c1.get(i).getIdCustomer().equals(n)) {
//                        c1.get(i).setFullName(getFullName());
//                        c1.get(i).setDateOfBirth(enterdateOfBirth());
//                        c1.get(i).setGeneral(getGeneral());
//                        c1.get(i).setCmndNumber(getCmnd());
//                        c1.get(i).setNumberCall(getNumberCall());
//                        c1.get(i).setIdCustomer(getIdCustomer());
//                        c1.get(i).setTypeCustomer(getTypeCustomer());
//                        c1.get(i).setLocation(getLocation());
                        System.out.println("Ban co the thay doi");
                        int choose;
                        do {
                            System.out.println("1.edit name");
                            System.out.println("2.edit birthday");
                            System.out.println("3.edit gender");
                            System.out.println("4.edit CMND");
                            System.out.println("5.edit Phone");
                            System.out.println("6.Type Customer");
                            System.out.println("7.Location");
                            System.out.println("8.Return");
                            choose = Integer.parseInt(sc.nextLine());
                            switch (choose)
                            {
                                case 1:
                                    c1.get(i).setFullName(getFullName());
                                    break;
                                case 2:
                                    c1.get(i).setDateOfBirth(enterdateOfBirth());
                                    break;
                                case 3:
                                    c1.get(i).setGeneral(getGeneral());
                                    break;
                                case 4:
                                    c1.get(i).setCmndNumber(getCmnd());
                                    break;
                                case 5:
                                    c1.get(i).setNumberCall(getNumberCall());
                                    break;
                                case 6:
                                    c1.get(i).setTypeCustomer(getTypeCustomer());
                                    break;
                                case 7:
                                    c1.get(i).setLocation(getLocation());
                                    break;
                                case 8:
                                    break;
                            }
                        }while (choose<8);
                    } else {
                        System.out.println("khong tim thay id can fix");
                    }
                }
                ReadAndWritecsv.writeCSVEditCustomer(c1);
            }
        }catch (FileNotFoundException e)
        {
            throw new FileNotFoundException();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void display() throws Exception {
        try {
            List<Customer> customers = ReadAndWritecsv.readCSVCustomer();
            if(customers.size()==0)
            {
                System.out.println("File khong co thong tin ");
            }else {
                for (Customer c1 : customers) {
                    System.out.println(c1);
                }
            }
        }catch (FileNotFoundException e)
        {
            throw new FileNotFoundException();
        }
    }

    String getFullName() {
        while (true)
        {
            System.out.println("Nhap ten khach hang(Nguyen Van Quan):");
            String n= sc.nextLine();
            if(!Validate.isRegexFullName(n))
            {
                System.out.println("Ban nhap sai dinh dang ten ");
            }else
            {
                return n;
            }
        }
    }

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
        System.out.println("Chon gioi tinh:");
        System.out.println("1. Nam");
        System.out.println("2. Nu");
        int n=Integer.parseInt(sc.nextLine());
        String general=null;
        switch (n)
        {
            case 1:
                general="Nam";
                break;
            case 2:
                general="Nu";
                break;
        }
        return general;
    }

    String getCmnd() {
        while (true) {
            System.out.println("Nhap chung minh nhan dan:");
            String cm = sc.nextLine();
            if (Validate.isCMND(cm)) {
                return cm;
            } else {
                System.out.println("Nhap lai dum:");
            }
        }
    }

    String getNumberCall() {
        while (true)
        {
            System.out.println("Nhap so dien thoai:");
            String n = sc.nextLine();
            if(!Validate.isPhone(n))
            {
                System.out.println("Nhap sai so dien thoai");
            }else
            {
                return n;
            }
        }
    }

    String getIdCustomer() {
        while (true)
        {
            System.out.println("Nhap id khach hang:");
            String n = sc.nextLine();
            if (Validate.isCustomer(n))
            {
                return n;
            }else
            {
                System.out.println("Moi ban nhap lai");
            }
        }
    }

    String getTypeCustomer() {
        System.out.println("Nhap loai khach");
        return sc.nextLine();
    }

    String getLocation() {
        System.out.println("Nhap dia chi ");
        return sc.nextLine();
    }
    int getSerial()
    {
        try {
            List<Customer> c1 =ReadAndWritecsv.readCSVCustomer();
            if(c1.size()==0)
            {
                return 1;
            }else
            {
                return c1.size()+1;
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    String getEmail() {
        while (true)
        {
            System.out.println("Nhap email cua ban:");
            String n=sc.nextLine();
            if(Validate.isEmail(n))
            {
                return n;
            }else
            {
                System.out.println("Moi ban nhap lai");
            }
        }
    }
}
