/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1.bai1V2;

/**
 *
 * @author ACER
 */
public class Duck extends Animal implements Runging,Flying,Swiming{

    public Duck() {
    }

    public Duck(String ten, int chieuCao, int CanNang) {
        super(ten, chieuCao, CanNang);
    }

    @Override
    public void run() {
        System.out.println("chay kiue vit");
    }

    @Override
    public void fly() {
        System.out.println("bay kieu vit");
    }

    @Override
    public void swim() {
        System.out.println("boi kieu vit");
    }

   public void inThongTin() {
       super.toString();
       this.fly();
       this.run();
       this.swim();
       System.out.println(super.toString());
   }
    
}
