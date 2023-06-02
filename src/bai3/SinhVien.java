/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai3;

/**
 *
 * @author ACER
 */
public class SinhVien {

    private String ten;
    private double diem;
    private String nghanh;

    public SinhVien() {
    }

    public SinhVien(String ten, double diem, String nghanh) {
        this.ten = ten;
        this.diem = diem;
        this.nghanh = nghanh;
    }

    

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

    public String getNghanh() {
        return nghanh;
    }

    public void setNghanh(String nghanh) {
        this.nghanh = nghanh;
    }

    public String hocLuc() {
        String hocLuc = "";
        if (this.diem >= 9) {
            return hocLuc = "Xuất Sắc";
        }
        if (this.diem >= 8) {
            return hocLuc = "Giỏi";
        }
        if (this.diem >= 7) {
            return hocLuc = "Khá";
        }
        if (this.diem >= 5) {
            return hocLuc = "Trung bình";
        }
        if (this.diem < 5) {
            return hocLuc = "Yếu";
        }
        return "";
    }
    public boolean phanThuong(){
        if(this.diem >= 9)
            return true;
       
        return false;
    }
    public String thuong(){
        if(this.phanThuong()){
            return "Có";
        }else{
            return "Không";
        }
    }
    public Object toObject(){
        return new Object[]{
            ten,diem,nghanh,this.hocLuc(),thuong()
        };
    }
    
}
