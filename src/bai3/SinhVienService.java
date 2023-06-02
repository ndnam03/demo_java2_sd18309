/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package bai3;

import java.util.List;

/**
 *
 * @author ACER
 */
public interface SinhVienService {
    public List<SinhVien> getAll();
     public boolean addSinhVien(SinhVien s);
    public boolean removeSinhVien(int index);
    public boolean upDate(SinhVien s, int index);
    public List<SinhVien> findListSinhVien(String key);
     public SinhVien findSinhVien(String key);
     
}
