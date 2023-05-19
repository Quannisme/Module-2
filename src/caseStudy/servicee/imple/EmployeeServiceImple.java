package caseStudy.servicee.imple;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.time.LocalDate;

import caseStudy.Validate.Validate;
import caseStudy.modell.Employee;
import caseStudy.modell.Person;

import java.time.format.DateTimeFormatter;
import caseStudy.servicee.inter.EmployeeService;

public class EmployeeServiceImple implements EmployeeService {  
    List<Employee>p1=new ArrayList<>();
    Scanner sc=new Scanner(System.in);
    @Override
    public void add() {
        Employee p=null;
        String fullName=getFullName();
        LocalDate dayOfBirth=getDayOfBirth();
        String general=getGeneral();
        String cmndNumber=getCMND();
        String numberCall=getNumberCall();
        String idEmployee=getIdEmployee();
        String levelStudy=getLevelStudy();
        String location=getLocal();
        double salary=getSalary();
        p=new Employee(fullName,dayOfBirth,general,cmndNumber,numberCall,idEmployee,levelStudy,location,salary);
        if(p!=null)
        {
            p1.add(p);
        }
    }
    @Override
    public void edit() {
        System.out.println("Nhap id muon tim:");
        String n=sc.nextLine();
        for (int i = 0; i < p1.size(); i++) {
            if(p1.get(i).getIdEmployee()==n)
            {
                p1.get(i).setFullName(getFullName());
                p1.get(i).setDayOfBirth(getDayOfBirth());
                p1.get(i).setGeneral(getGeneral());
                p1.get(i).setCmndNumber(getCMND()); 
                p1.get(i).setNumberCall(getNumberCall());
                p1.get(i).setLevelStudy(getLevelStudy());   
                p1.get(i).setLocation(getLocal());
                p1.get(i).setSalary(getSalary());
                break;
            }else
            {
                System.out.println("khong tim thay id:");
            }
        }
    }
    
    @Override
    public void display() {
        for(int i=0;i<p1.size();i++)
        {
            System.out.println(p1.get(i).toString());
        }
    }
    String getFullName()
    {
        System.out.println("Nhập tên full tên");
        return sc.nextLine(); 
    }
    LocalDate getDayOfBirth()
    {
        while (true) {
            try {
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                System.out.println("Nhập ngày tháng năm  (dd/mm/yyyy): ");
                String dateStr = sc.nextLine();
                if (Validate.isDateRight(dateStr)) {
                    return LocalDate.parse(dateStr, formatter);
                }
                System.out.println("Bạn nhập sai ngày");
            }catch (Exception e)
            {
                System.out.println("Loi");
            }
        }
    }
    String getGeneral()
    {
        System.out.println("Nhập giới tính :");
        return sc.nextLine();
    }
    String getCMND()
    {
     while(true)
     {
        System.out.println("Nhap cmnd:");
        String cm=sc.nextLine();
        if(Validate.isCMND(cm))
        {
            return cm;
        }else
        {
            System.out.println("Nhap lai ho cai:");
        }
     }   
    }
    String getNumberCall()
    {
        while(true)
        {
            System.out.println("Nhap dum cai so dien thoai:");
            String n=sc.nextLine();
            if(Validate.isPhone(n))
            {
                return n;
            }else
            {
                System.out.println("Moi ban nhap lai");
            }
        }
    }
    String getIdEmployee()
    {
        while(true)
        {
            System.out.println("Nhap id cua nhan vien (NV-YYYY):");
            String n=sc.nextLine();
            if(Validate.isId(n))
            {
             return n;
            }else
            {
                System.out.println("Nhap lai");
            }
        }
//        System.out.println("Nhap Id cua nhan vien");
//        int n=Integer.parseInt(sc.nextLine());
//        return n;
    }
    String getLevelStudy()
    {
        System.out.println("Trinh do cua nhan vien:");
        return sc.nextLine();
    }
    String getLocal()
    {
        System.out.println("Vi tri lam viec:");
        return sc.nextLine();
    }
    double getSalary()
    {
        while(true)
        {
            System.out.println("Luong cua nhan vien:");
            double n=Double.parseDouble(sc.nextLine());
            if (n>0)
            {
                return n;
            }else
            {
                System.out.println("Moi ban nhap lai");
            }
        }
//        System.out.println("Luong cua nhan vien:");
//        double n=Double.parseDouble(sc.nextLine());
//        if(n<0)
//        {
//
//        }
    }
}
