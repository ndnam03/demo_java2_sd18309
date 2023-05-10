   /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class QuanLyMyLove {
    
    List<MyLove> list = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    
    public void themMyLove() {
        String ten;
        int tuoi;
        double sdv1, sdv2, sdv3;
        System.out.print("Nhap ten: ");
        ten = sc.nextLine();
        System.out.print("Nhap tuoi: ");
        tuoi = Integer.parseInt(sc.nextLine());
        System.out.print("So do vong 1: ");
        sdv1 = Double.parseDouble(sc.nextLine());
        System.out.print("So do vong 2: ");
        sdv2 = Double.parseDouble(sc.nextLine());
        System.out.print("So do vong 3: ");
        sdv3 = Double.parseDouble(sc.nextLine());
        MyLove m = new MyLove(ten, tuoi, sdv1, sdv2, sdv3);
        list.add(m);
    }
    
    public void themOldLove() {
        String ten;
        int tuoi;
        double sdv1, sdv2, sdv3;
        int soThang;
        System.out.print("Nhap ten old love: ");
        ten = sc.nextLine();
        System.out.print("Nhap tuoi: ");
        tuoi = Integer.parseInt(sc.nextLine());
        System.out.print("So do vong 1: ");
        sdv1 = Double.parseDouble(sc.nextLine());
        System.out.print("So do vong 2: ");
        sdv2 = Double.parseDouble(sc.nextLine());
        System.out.print("So do vong 3: ");
        sdv3 = Double.parseDouble(sc.nextLine());
        System.out.print("Nhap so thang yeu nhau: ");
        soThang = Integer.parseInt(sc.nextLine());
        OldMylove ol = new OldMylove(ten, tuoi, sdv1, sdv2, sdv3, soThang);
        list.add(ol);
        
    }
    
    public void hienThi() {
        for (MyLove o : list) {
            System.out.println(o.toString());
        }
    }
    
    public MyLove timKiem(String name) {
        
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getTen().equalsIgnoreCase(name)) {
                return list.get(i);
            }
        }
        return null;
    }
    
    public int xoaTuoi(int tuoi) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getTuoi() == tuoi) {
                return i;
            }
        }
        return -1;
    }
    
    public void timKiemTheoTen() {
        String ten;
        System.out.print("Nhap ten can tim: ");
        ten = sc.nextLine();
        int t = 0;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getTen().equalsIgnoreCase(ten)){
                System.out.println(list.get(i).toString());
                t++;
            }
        }
        if(t > 0) {
            System.out.println("Tim thay" + t  +"sinh vien");
        }else{
            System.out.println("Khong thay");
        }
//        MyLove m = timKiem(ten);
        
//        if (m != null) {
//            
//            System.out.println("Da tim thay");
//            for (int i = 0; i < list.size(); i++) {
//                System.out.println(m.toString());
//            }
//            
//        } else {
//            System.out.println("Khong tim thay!!!");
//        }
    }
    
    public void xoaTheoTuoi() {
        System.out.print("Nhap tuoi can xoa: ");
        int tuoi = Integer.parseInt(sc.nextLine());
        
        int t = 0;
       
        for (int i = list.size()-1; i >= 0; i--) {
            if(list.get(i).getTuoi() == tuoi){
                list.remove(i);
                t++;
            }
        }
        if(t > 0) {
            System.out.println("xoa thanh cong");
        }else{
            System.out.println("Xoa that bai");
        }
    }
    
    public void sapXepTheoTen() {
        
        list.sort(new Comparator<MyLove>() {
            @Override
            public int compare(MyLove o1, MyLove o2) {
                return o1.getTen().compareToIgnoreCase(o2.getTen());
                
            }
        });
        
        hienThi();
    }
    
}
