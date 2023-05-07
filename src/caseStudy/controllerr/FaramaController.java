package caseStudy.controllerr;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import caseStudy.modell.Employee;
import caseStudy.servicee.imple.CustomerServiceImple;
import caseStudy.servicee.imple.EmployeeServiceImple;
import caseStudy.servicee.imple.FacilityServiceImple;
import caseStudy.servicee.inter.CustomerService;
import caseStudy.servicee.inter.EmployeeService;
import caseStudy.servicee.inter.FacilityService;

public class FaramaController {
    public static Scanner sc=new Scanner(System.in);
    //Employee
    public static EmployeeService e1=new EmployeeServiceImple();
    //Customer
    public static CustomerService c1=new CustomerServiceImple();
    public static FacilityService f1=new FacilityServiceImple();
    // TONG QUAT
   public static void display()
   {
    while(true)
    {
        System.out.println("*****CHƯƠNG TRÌNH QUẢN LÝ Furama*****");
        System.out.println("Chọn chức năng theo số (để tiếp tục): ");
        System.out.println("1. Employee Management");
        System.out.println("2. Customer Management");
        System.out.println("3. Facility Management");
        System.out.println("4. Booking Management");
        System.out.println("5. Promotion Management");
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
            case 3:
            {
                facility();
                break;
            }
            case 4:
            {
                bookingManagement();
                break;
            }
        }
    }
   }
   // QUAN LI EMPLOYEE
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
   // QUAN LI CUSTOMER
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
   // QUAN LI FACILITY
   public static void facility()
   {
    int choose;
    do{
        System.out.println("1. Display Facility");
        System.out.println("2. Add new Facility");
        System.out.println("3. Display list facility maintenance");
        System.out.println("4. Return  main menu");
        choose=sc.nextInt();
        switch(choose)
        {
            case 1:
            {
                f1.displayListFacility();
                break;
            }
            case 2:
            {
                case2();
                break;
            }
            case 3:
            {
                f1.displayListMaintenance();
                break;
            }
            case 4:
            {
                break;
            }
        }

    }while(choose<4);
   }
   // PHAN TRONG QUAN LI FACILITY
   public static void case2()
   {
    int choose;
    do {
        System.out.println("1. Add New Villa");
        System.out.println("2. Add New House");
        System.out.println("3. Add New Room");
        System.out.println("4. Back to menu");
        choose=sc.nextInt();
        switch(choose)
        {
            case 1:
            {
                f1.addVilla();
                break;
            }
            case 2:
            {
                f1.addHouse();
                break;
            }
            case 3:
            {
                f1.addRoom();
                break;
            }
            case 4:
            {
                break;
            }
        }
    }while(choose<4);
   }

// QUAN LI BOOKING

public static void bookingManagement()
   {
    int choose;
    do{
        System.out.println("1. Add new booking");
        System.out.println("2. Display list booking");
        System.out.println("3. Create new contract");
        System.out.println("4. Display list contract");
        System.out.println("5. Edit contracts");
        System.out.println("6. Return main menu");
        choose=sc.nextInt();
        switch(choose)
        {
            case 1:
            {
                break;
            }
            case 2:
            {
                break;
            }
            case 3:
            {
                break;
            }
            case 4:
            {
                break;
            }
            case 5:
            {
                break;
            }
            case 6:
            {
                break;
            }
        }
    }while(choose<4);
   }
}
