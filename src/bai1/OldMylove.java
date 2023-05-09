/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1;

/**
 *
 * @author ACER
 */
public class OldMylove extends MyLove{
    private int soThangYeuNhau;

    public OldMylove() {
    }

    public OldMylove(String ten, int tuoi, double sdv1, double sdv2, double sdv3,int soThangYeuNhau) {
        super(ten, tuoi, sdv1, sdv2, sdv3);
        this.soThangYeuNhau = soThangYeuNhau;
    }

   

    public int getSoThangYeuNhau() {
        return soThangYeuNhau;
    }

    public void setSoThangYeuNhau(int soThangYeuNhau) {
        this.soThangYeuNhau = soThangYeuNhau;
    }

    @Override
    public String toString() {
        return "OldMylove{" + "soThangYeuNhau=" + soThangYeuNhau + '}' + super.toString();
    }
    
    
}
