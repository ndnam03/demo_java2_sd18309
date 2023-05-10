/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab1;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Product p = new Product("a", 15);
        
        System.out.println(p.toString());
        System.out.print("nhap ten");
        String ten = sc.nextLine();
        System.out.print("nhap gia");
        double gia = Double.parseDouble(sc.nextLine());
        Product p2 = new Product(ten, gia);
        System.out.println(p2.toString());
        
        
        System.out.print("nhap ten");
         ten = sc.nextLine();
        System.out.print("nhap gia");
         gia = Double.parseDouble(sc.nextLine());
        Product p3 = new Product(ten, gia);
        System.out.println(p3.toString());
        
        
        NoTaxProduct n1 = new NoTaxProduct("no1", 15);
        n1.hienThi();
        
        NoTaxProduct n2 = new NoTaxProduct("no2", 15);
        n2.hienThi();
        NoTaxProduct n3 = new NoTaxProduct("no3", 15);
  
        System.out.println(n3.toString());
        
        n1.insert();
        n1.delete();
        n1.select();
        n1.update();
       
     
        
        
    }
}
