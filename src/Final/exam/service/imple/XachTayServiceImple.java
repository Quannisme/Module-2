package Final.exam.service.imple;

import Final.exam.modell.XachTay;
import Final.exam.service.inter.XachTayService;
import Final.exam.util.ReadAndWritecsv;
import sun.text.normalizer.UCharacterIterator;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class XachTayServiceImple implements XachTayService {
    Scanner sc=new Scanner(System.in);
    @Override
    public void them() throws FileNotFoundException {
        try {
            List<XachTay>xachTays=new ArrayList<>();
            XachTay c1=null;
            int id=getId();
            String name=getTen();
            int gia=getGia();
            int soLuong=getSoLuong();
            String nhaSanXuat=getNhaSanXuat();
            String quocGia=getQuocGia();
            String trangThai=getTrangThai();
            c1= new XachTay(id,name,gia,soLuong,nhaSanXuat,quocGia,trangThai);
            if(c1!=null)
            {
                List<XachTay>x= ReadAndWritecsv.readCSVXachTay();
                xachTays.add(c1);
                ReadAndWritecsv.writeCSVXachTay(xachTays);
            }
        }catch (FileNotFoundException e)
        {
            throw new FileNotFoundException();
        }
        catch (Exception e)
        {
            throw new RuntimeException();
        }
    }

    @Override
    public void xoa() {
        int id;
        try{
            List<XachTay>xachTays=ReadAndWritecsv.readCSVXachTay();
            System.out.println("Nhap id cua dien thoai:");
            id=Integer.parseInt(sc.nextLine());
            for (int i = 0; i < xachTays.size(); i++) {
                if(xachTays.get(i).getId()==id)
                {
                    System.out.println("Ban co muon xoa khong:");
                    System.out.println("1. Yes");
                    System.out.println("2. No");
                    int temp=Integer.parseInt(sc.nextLine());
                    if(temp==1)
                    {
                        xachTays.remove(xachTays.get(i));
                        System.out.println("Xoa thanh cong");
                        ReadAndWritecsv.writeCSVXachTayXoa(xachTays);
                        break;
                    }else
                    {
                        System.out.println("Huy chuong trinh xoa");
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
    public void xem() throws Exception {
        try {
            List<XachTay>xachTays=ReadAndWritecsv.readCSVXachTay();
            if(xachTays.size()==0)
            {
                System.out.println("Khong co thong tin ");
            }else
            {
                for (XachTay x:xachTays)
                {
                    System.out.println(x);
                }
            }
        }catch (FileNotFoundException e)
        {
            throw new FileNotFoundException();
        }
        catch (Exception e)
        {
            throw new Exception(e);
        }
    }

    @Override
    public void timkiem() {
        try {
            List<XachTay>xachTays=ReadAndWritecsv.readCSVXachTay();
            System.out.println("Nhap id can tim kiem:");
            int id=Integer.parseInt(sc.nextLine());
            for (int i = 0; i < xachTays.size(); i++) {
                if(xachTays.get(i).getId()==id)
                {
                    System.out.println(xachTays.get(i));
                }
            }
        }catch (Exception e)
        {
            throw new RuntimeException();
        }
    }
    int getId()
    {
        try{
            List<XachTay>xachTays=ReadAndWritecsv.readCSVXachTay();
            if(xachTays.size()==0)
            {
                return 1;
            }else
            {
                return xachTays.size()+1;
            }
        }catch (Exception e)
        {
            throw new RuntimeException(e);
        }
    }
    String getTen()
    {
        while (true)
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
                System.out.println("Moi ban nhap lai :");
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
            }else
            {
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
    String getQuocGia()
    {
        while (true)
        {
            System.out.println("Nhap quoc gia:");
            String n=sc.nextLine();
            return n;
        }
    }
    String getTrangThai()
    {
        while (true)
        {
            System.out.println("Nhap trang thai");
            System.out.println("1. Da sua chua");
            System.out.println("2. Chua sua chua");
            int temp=Integer.parseInt(sc.nextLine());
            String n=null;
            switch (temp)
            {
                case 1:
                    n="Da sua chua";
                    break;
                case 2:
                    n="Chua sua chua";
                    break;
            }
            return n;
        }
    }
}
