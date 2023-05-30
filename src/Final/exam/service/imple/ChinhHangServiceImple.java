package Final.exam.service.imple;

import Final.exam.modell.ChinhHang;
import Final.exam.service.inter.ChinhHangService;
import Final.exam.util.ReadAndWritecsv;
import com.sun.org.apache.bcel.internal.generic.LUSHR;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class ChinhHangServiceImple implements ChinhHangService {
    Scanner sc=new Scanner(System.in);
    @Override
    public void them() throws FileNotFoundException {
        try {
            List<ChinhHang>chinhHangs=new ArrayList<>();
            ChinhHang c1=null;
            int id=getId();
            String name=getTen();
            int gia=getGia();
            int soLuong=getSoLuong();
            String nhaSanXua=getNhaSanXuat();
            String thoiGian=getThoiGian();
            String phamVi=getPhamVi();
            c1=new ChinhHang(id,name,gia,soLuong,nhaSanXua,thoiGian,phamVi);
            if(c1!=null)
            {
                List<ChinhHang>c= ReadAndWritecsv.readCSV();
                chinhHangs.add(c1);
                ReadAndWritecsv.writeCSV(chinhHangs);
            }
        }catch (FileNotFoundException e)
        {
            throw new FileNotFoundException();
        }
        catch (Exception e)
        {
            throw new RuntimeException(e);
        }
    }
    @Override
    public void xoa(){
        int id;
        try {
            List<ChinhHang>chinhHangs=ReadAndWritecsv.readCSV();
            System.out.println("Nhap id dien thoai ban muon xoa:");
            id=Integer.parseInt(sc.nextLine());
            for (int i = 0; i < chinhHangs.size(); i++) {
                if(chinhHangs.get(i).getId()==id)
                {
                    System.out.println("Ban co muon xoa khong");
                    System.out.println("1. Co");
                    System.out.println("2. Khong");
                    int temp=Integer.parseInt(sc.nextLine());
                    if(temp==1)
                    {
                        chinhHangs.remove(chinhHangs.get(i));
                        System.out.println("Xoa thanh cong");
                        ReadAndWritecsv.writeCSVXOA(chinhHangs);
                        break;
                    }else
                    {
                        System.out.println("Huy chuong trinh xoa ");
                        break;
                    }
                }
            }
        }catch (Exception e)
        {
            throw new RuntimeException(e);
        }
    }
    @Override
    public void timKiem(){
        try{
            List<ChinhHang>chinhHangs=ReadAndWritecsv.readCSV();
            System.out.println("Nhap id can tim kiem");
            int id=Integer.parseInt(sc.nextLine());
            for (int i = 0; i < chinhHangs.size(); i++) {
                if(chinhHangs.get(i).getId()==id)
                {
                    System.out.println(chinhHangs.get(i));
                }
            }
        }catch (Exception e)
        {
            throw new RuntimeException(e);
        }
    }
    @Override
    public void xem() throws Exception {
        try {
            List<ChinhHang>chinhHangs=ReadAndWritecsv.readCSV();
            if(chinhHangs.size()==0)
            {
                System.out.println("Khong co thong tin:");
            }else {
                for (ChinhHang c : chinhHangs)
                {
                    System.out.println(c);
                }
            }
        }catch (Exception e)
        {
            throw new Exception(e);
        }
    }
    int getId()
    {
        try{
            List<ChinhHang>chinhHangs=ReadAndWritecsv.readCSV();
            if(chinhHangs.size()==0)
            {
                return 1;
            }else
            {
                return chinhHangs.size()+1;
            }
        }catch (Exception e)
        {
            throw new RuntimeException(e);
        }
    }
    String getTen()
    {
        while(true)
        {
            System.out.println("Nhap ten dien thoai:");
            String n=sc.nextLine();
            return n;
        }
    }
    int getGia()
    {
        while (true)
        {
            System.out.println("Nhap gia cua dien thoai( gia phai lon hon 0):");
            int n=Integer.parseInt(sc.nextLine());
            if(n>0)
            {
                return n;
            }else
            {
                System.out.println("Moi ban nhap lai");
            }
        }
    }
    int getSoLuong()
    {
        while (true)
        {
            System.out.println("Nhap so luong cua dien thoai(so luong phai lon hon 0):");
            int n=Integer.parseInt(sc.nextLine());
            if(n>0)
            {
                return n;
            }else {
                System.out.println("Moi ban nhap lai");
            }
        }
    }
    String getNhaSanXuat()
    {
        while (true)
        {
            System.out.println("Nhap ten nha san xuat:");
            String n=sc.nextLine();
            return n;
        }
    }
    String getThoiGian()
    {
        while (true)
        {
            System.out.println("Nhap thoi gian :");
            String n=sc.nextLine();
            return n;
        }
    }
    String getPhamVi()
    {
        while (true) {
            System.out.println("Chon pham vi ");
            System.out.println("1. Trong nuoc");
            System.out.println("2. Quoc te");
            int n = Integer.parseInt(sc.nextLine());
            String phamVi = null;
            switch (n) {
                case 1:
                    phamVi = "Trong nuoc";
                    break;
                case 2:
                    phamVi = "Quoc te";
                    break;
            }
            return phamVi;
        }
    }
}
