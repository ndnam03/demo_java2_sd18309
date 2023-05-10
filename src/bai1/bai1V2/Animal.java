/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1.bai1V2;

/**
 *
 * @author ACER
 */
public class Animal {
    private String ten;
    private int chieuCao, CanNang;

    public Animal() {
    }

    public Animal(String ten, int chieuCao, int CanNang) {
        this.ten = ten;
        this.chieuCao = chieuCao;
        this.CanNang = CanNang;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getChieuCao() {
        return chieuCao;
    }

    public void setChieuCao(int chieuCao) {
        this.chieuCao = chieuCao;
    }

    public int getCanNang() {
        return CanNang;
    }

    public void setCanNang(int CanNang) {
        this.CanNang = CanNang;
    }

    @Override
    public String toString() {
        return "Animal{" + "ten=" + ten + ", chieuCao=" + chieuCao + ", CanNang=" + CanNang + '}';
    }
    
}
