/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai4;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class Demo_Try_Catch {

    public static void main(String[] args) {
        String ten;
        int tuoi;
        Scanner sc = new Scanner(System.in);
        System.out.print("Moi nhap ten");
        ten = sc.nextLine();
        if (ten.matches("[a-zA-Z ]+")) {
            System.out.println("Tến hop le");
        } else {
            System.out.println("Ten khong hop le");
        }
        try {
            tuoi = sc.nextInt();
            if(tuoi < 0 || tuoi > 120){
                System.out.println("Tuoi sai dinh dang");
            }
        } catch (Exception e) {
            System.out.println("tuoi sai");
        }

    }
}
