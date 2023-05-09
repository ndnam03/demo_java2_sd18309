/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1;

/**
 *
 * @author ACER
 */
public class MyLove {
    private String ten;
    private int tuoi;
    private double sdv1;
    private double sdv2;
    private double sdv3;

    public MyLove() {
    }

    public MyLove(String ten, int tuoi, double sdv1, double sdv2, double sdv3) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.sdv1 = sdv1;
        this.sdv2 = sdv2;
        this.sdv3 = sdv3;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public double getSdv1() {
        return sdv1;
    }

    public void setSdv1(double sdv1) {
        this.sdv1 = sdv1;
    }

    public double getSdv2() {
        return sdv2;
    }

    public void setSdv2(double sdv2) {
        this.sdv2 = sdv2;
    }

    public double getSdv3() {
        return sdv3;
    }

    public void setSdv3(double sdv3) {
        this.sdv3 = sdv3;
    }

    @Override
    public String toString() {
        return "MyLove{" + "ten=" + ten + ", tuoi=" + tuoi + ", sdv1=" + sdv1 + ", sdv2=" + sdv2 + ", sdv3=" + sdv3 + '}';
    }
     
}
