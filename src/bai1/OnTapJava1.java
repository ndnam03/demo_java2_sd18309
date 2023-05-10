 package bai1;

import java.util.Scanner;

public class OnTapJava1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QuanLyMyLove q = new QuanLyMyLove();
        System.out.println("Nhap lua chon: ");

        while (true) {
            System.out.println("1:Them sinh vien:");
            System.out.println("2:Hien thi sinh vien:");
            System.out.println("3:Tim theo ten:");
            System.out.println("4:Xoa theo tuoi:");
            System.out.println("5::Sap xep theo ten:");
            System.out.println("6:OLD MyLove");
            System.out.println("0:Dung chuong trinh");
            System.out.println("=================");
            int luaChon = Integer.parseInt(sc.nextLine());
                  

            switch (luaChon) {
                case 1:
                    q.themMyLove();
                    break;
                case 2:
                    q.hienThi();
                    break;
                case 3:
                    q.timKiemTheoTen();
                    break;
                case 4:
                    q.xoaTheoTuoi();
                    break;
                case 5:
                    q.sapXepTheoTen();
                    break;
                case 6:
                    q.themOldLove();
                    break;
                case 0:
                    return;
                    
            }
        }
    }

}
