package caseStudy.servicee.imple;

import java.security.Key;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

import caseStudy.modell.Facility;
import caseStudy.modell.House;
import caseStudy.modell.Room;
import caseStudy.modell.Villa;
import caseStudy.servicee.inter.FacilityService;
import caseStudy.servicee.inter.Service;

public class FacilityServiceImple implements FacilityService {
    HashMap<Facility,Integer>ha=new LinkedHashMap<>();
    Scanner sc=new Scanner(System.in);
    int temp=0;
    @Override
    public void addHouse() {
        House h=null;
        String serviceName=getServiceName();
        double useArea=getUseArea();
        double costRental=getCosRental();
        int numberMaximum=getNumberMaximum();
        String typeRent=getTypeRent();
        String roomStandard=getRoomStandard();
        int floorNumber=getFloorNumber();
        h=new House(serviceName, useArea, costRental, numberMaximum, typeRent, roomStandard, floorNumber);
        if(h!=null)
        {
            ha.put(h, temp++);
            System.out.println("Da them thanh cong:");
        }
    }
    @Override
    public void addRoom() {
        Room r=null;
        String serviceName=getServiceName();
        double useArea=getUseArea();
        double costRental=getCosRental();
        int numberMaximum=getNumberMaximum();
        String typeRent=getTypeRent();
        String freeSirviceInclude=getFreeSirviceInclude();
        r=new Room(serviceName, useArea, costRental, numberMaximum, typeRent, freeSirviceInclude);
        if(r!=null)
        {
            ha.put(r, temp++);
            System.out.println("da them thanh cong:");
        }
    }

    @Override
    public void addVilla() {
        Villa v=null;
        String serviceName=getServiceName();
        double useArea=getUseArea();
        double costRental=getCosRental();
        int numberMaximum=getNumberMaximum();
        String typeRent=getTypeRent();
        String roomStandard=getRoomStandard();
        double poolArea=getPoolArea();
        int floorNumber=getFloorNumber();
        v=new Villa(serviceName, useArea, costRental, numberMaximum, typeRent, roomStandard, poolArea, floorNumber);
        if(v!=null)
        {
            ha.put(v, temp++);
        }
    }
    public void displayListFacility()
    {
        for(Facility key: ha.keySet())
        {
            System.out.println(key);
        }
    }
    public void displayListMaintenance()
    {
        for(Facility key: ha.keySet())
        {
            if(ha.get(key)>=5)
            {
                System.out.println(key+"can bao tri");
            }
        }
    }
    String getServiceName()
    {
        System.out.println("Nhap ten dich vu :");
        return sc.nextLine();
    }
    double getUseArea()
    {
        System.out.println("Nhap dien tich su dung :");
        double n=Double.parseDouble(sc.nextLine());
        return n;
    }
    double getCosRental()
    {
        System.out.println("Nhap chi phi thue:");
        double n=Double.parseDouble(sc.nextLine());
        return n;
    }
    int getNumberMaximum()
    {
        System.out.println("Nhap so luong nguoi toi da:");
        int n=Integer.parseInt(sc.nextLine());
        return n;
    }
    String getTypeRent()
    {
        System.out.println("Nhap kieu thue:");
        return sc.nextLine();
    }
    String getRoomStandard()
    {
        System.out.println("Nhap tieu chuan phong:");
        return sc.nextLine();
    }
    int getFloorNumber()
    {
        System.out.println("Nhap so tang:");
        int n=Integer.parseInt(sc.nextLine());
        return n;
    }
    String getFreeSirviceInclude()
    {
        System.out.println("Nhap dich vu mien phi di kem :");
        return sc.nextLine();
    }
    double getPoolArea()
    {
        System.out.println("Nhap dien tich ho boi :");
        double n=Double.parseDouble(sc.nextLine());
        return n;
    }
    @Override
    public String toString() {
        return "FacilityServiceImple [ha=" + ha + ", sc=" + sc + ", temp=" + temp + "]";
    }
}
