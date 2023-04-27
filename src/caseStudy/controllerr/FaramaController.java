package caseStudy.controllerr;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import caseStudy.modell.Employee;
import caseStudy.servicee.imple.CustomerServiceImple;
import caseStudy.servicee.imple.EmployeeServiceImple;
import caseStudy.servicee.inter.CustomerService;
import caseStudy.servicee.inter.EmployeeService;

public class FaramaController {
    public static Scanner sc=new Scanner(System.in);
    //Employee
    public static EmployeeService e1=new EmployeeServiceImple();
    //Customer
    public static CustomerService c1=new CustomerServiceImple();
   public static void display()
   {
    while(true)
    {
        System.out.println("*****CHƯƠNG TRÌNH QUẢN LÝ BỆNH ÁN*****");
        System.out.println("Chọn chức năng theo số (để tiếp tục): ");
        System.out.println("1. Employee Management");
        System.out.println("2. Customer Management");
        System.out.println("3. Facility Management");
        System.out.println("4. Booking Management");
        System.out.println("Promotion Management");
        System.out.print("***Vui lòng chọn chức năng từ 1 đến 4 : ");
        int choice=Integer.parseInt(sc.nextLine());
        switch(choice)
        {
            case 1:
            {
                employee();
                break;
            }
            case 2:
            {
                customer();
                break;
            }
        }
    }
   }
   public static void employee()
   {
    int choose;
    do {
        System.out.println("EMPLOYEE MANAGEMENT");
        System.out.println("1. Display list employee");
        System.out.println("2. Add new employee");
        System.out.println("3. Edit employee");
        System.out.println("4 return main menu");
        choose=Integer.parseInt(sc.nextLine());
        switch(choose)
        {
            case 1:
            {
                e1.display();
                break;
            }
            case 2:
            {
                e1.add();
                break;
            }
            case 3:
            {
                e1.edit();
                break;
            }
            case 4:
            {
                break;
            }
        }
    }while(choose<4);
   }
   public static void customer()
   {
    int choose;
    do{
        System.out.println("CUSTOMER");
        System.out.println("1. Display list customers");
        System.out.println("2. Add new Customer");
        System.out.println("3. Edit customer");
        System.out.println("4. Return");
        choose=Integer.parseInt(sc.nextLine());
        switch(choose)
        {
            case 1:
            {
                c1.display();
                break;
            }
            case 2:
            {
                c1.add();
                break;
            }
            case 3:
            {
                c1.edit();
                break;
            }
            case 4:
            {
                break;
            }
        }
    }while(choose<4);
   }
}
