package Final.exam.controller;

import Final.exam.modell.ChinhHang;
import Final.exam.service.imple.ChinhHangServiceImple;
import Final.exam.service.imple.XachTayServiceImple;
import Final.exam.service.inter.ChinhHangService;
import Final.exam.service.inter.XachTayService;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Controller {
    public static Scanner sc = new Scanner(System.in);
    public static XachTayService x1 = new XachTayServiceImple();
    public static ChinhHangService c1 = new ChinhHangServiceImple();

    public static void hien() {
        while (true) {
            try {
                System.out.println("CHUONG TRINH QUAN LY DIEN THOAI");
                System.out.println("Chon chuc nang theo so (de tiep tuc)");
                System.out.println("1:Chinh Hang");
                System.out.println("2.Xach Tay");
                System.out.println("VUI LONG CHON 1 DEN 2 ");
                int choice = Integer.parseInt(sc.nextLine());
                switch (choice) {
                    case 1: {
                        chinhHang();
                        break;
                    }
                    case 2:
                    {
                        xachTay();
                        break;
                    }
                }
            }catch (NumberFormatException e)
            {
                System.out.println("Phan phai chon tu 1 den 2");
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void chinhHang() throws FileNotFoundException {
        int choose;
        do {
            System.out.println("CHINH HANG");
            System.out.println("1.Them moi");
            System.out.println("2.Xoa");
            System.out.println("3.Xem Danh Sach dien thoai");
            System.out.println("4. Tim Kiem");
            System.out.println("5. Thoat");
            System.out.println("CHON CHUC NANG");
            choose = Integer.parseInt(sc.nextLine());
            switch (choose) {
                case 1:
                    c1.them();
                    break;
                case 2:
                    c1.xoa();
                    break;
                case 3:
                    try {
                        c1.xem();
                        break;
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                case 4:
                    c1.timKiem();
                    break;
                case 5:
                    break;
            }
        } while (choose < 5);
    }

    public static void xachTay() throws FileNotFoundException {
        int choose;
        do {
            System.out.println("CHINH HANG");
            System.out.println("1.Them moi");
            System.out.println("2.Xoa");
            System.out.println("3.Xem Danh Sach dien thoai");
            System.out.println("4. Tim Kiem");
            System.out.println("5. Thoat");
            System.out.println("CHON CHUC NANG");
            choose = Integer.parseInt(sc.nextLine());
            switch (choose) {
                case 1:
                    x1.them();
                    break;
                case 2:
                    x1.xoa();
                    break;
                case 3:
                    try {
                        x1.xem();
                        break;
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                case 4:
                    x1.timkiem();
                    break;
                case 5:
                    break;
            }
        } while (choose < 5);
    }
}
