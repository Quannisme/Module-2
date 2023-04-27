package caseStudy.servicee.imple;

import java.lang.foreign.VaList;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import caseStudy.Validate.Validate;
import caseStudy.modell.Customer;
import caseStudy.servicee.inter.CustomerService;
import java.time.LocalDate;

public class CustomerServiceImple implements CustomerService   {
    List<Customer>c1=new LinkedList<>();
    Scanner sc=new Scanner(System.in);

    @Override
    public void add() {
        Customer c=null;
        String fullName=getFullName();
        LocalDate dayOfBirth=getDayOfBirth();
        String general=getGeneral();
        String cmndNumber=getCmnd();
        int numberCall=getNumberCall();
        int idCustomer=getIdCustomer();
        String typeCustomer=getTypeCustomer();
        String location=getLocation();
        c=new Customer(fullName,dayOfBirth,general,cmndNumber,numberCall,idCustomer,typeCustomer,location);
        if(c!=null)
        {
            c1.add(c);
        }
    }

    @Override
    public void edit() {
        int n;
        System.out.println("Nhap id khach hang can tim:");
        n=sc.nextInt();
        for (int i = 0; i < c1.size(); i++) {

            if(c1.get(i).getIdCustomer()==n)
            {
                c1.get(i).setFullName(getFullName());
                c1.get(i).setDayOfBirth(getDayOfBirth());   
                c1.get(i).setGeneral(getGeneral());
                c1.get(i).setCmndNumber(getCmnd()); 
                c1.get(i).setNumberCall(getNumberCall());
                c1.get(i).setIdCustomer(getIdCustomer());
                c1.get(i).setTypeCustomer(getTypeCustomer());
                c1.get(i).setLocation(getLocation());
                break;
            }else
            {
                System.out.println("khong tim thay id can fix");
            }
        }
        
    }

    @Override
    public void display() {
        for (int i = 0; i < c1.size(); i++) {
            c1.get(i).toString();
        }
        
    }
    String getFullName()
    {
        System.out.println("Nhap ten khach hang:");
        return sc.nextLine();
    }
    LocalDate getDayOfBirth()
    {
        while(true)
        {
            DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd/MM/yyyy");
            System.out.println("Nhập ngày tháng năm  (dd/mm/yyyy): ");
            String dateStr = sc.nextLine();
                if (Validate.isDateRight(dateStr)) {
                    return LocalDate.parse(dateStr, formatter);
                }
                System.out.println("Bạn nhập sai ngày");
        }
    }
    String getGeneral()
    {
        System.out.println("Nhap gioi tinh:");
        return sc.nextLine();
    }
    String getCmnd()
    {
     while(true)
     {
        System.out.println("Nhap chung minh nhan dan:");
        String cm=sc.nextLine();
        if(Validate.isCMND(cm))
        {
            return cm;
        }else
        {
            System.out.println("Nhap lai dum:");
        }
     }   
    }
    int getNumberCall()
    {
        System.out.println("Nhap so dien thoai:");
        int n=Integer.parseInt(sc.nextLine());
        return n;
    }
    int getIdCustomer()
    {
        System.out.println("Nhap id khach hang:");
        int n=Integer.parseInt(sc.nextLine());
        return n;
    }
    String getTypeCustomer()
    {
        System.out.println("Nhap loai khach");
        return sc.nextLine();
    }
    String getLocation()
    {
        System.out.println("Nhap dia chi ");
        return sc.nextLine();
    }

}
