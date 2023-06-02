/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author ACER
 */
public class SinhVienImpl implements SinhVienService {

    public List<SinhVien> listSinhVien = new ArrayList<>();

    public SinhVienImpl() {
        listSinhVien.add(new SinhVien("Trang1", 5, "CNTT"));
        listSinhVien.add(new SinhVien("Trang2", 8, "UDPM"));
        listSinhVien.add(new SinhVien("Trang3", 9.5, "LÀM ĐẸP"));
           listSinhVien.add(new SinhVien("Trang3", 8.5, "LÀM ĐẸP"));
    }

    @Override
    public List<SinhVien> getAll() {
        return listSinhVien;
    }

    @Override
    public boolean addSinhVien(SinhVien s) {
        boolean f = false;
        if (s != null) {
            listSinhVien.add(s);
            f = true;
        }
        return f;
    }

    @Override
    public boolean removeSinhVien(int index) {
        boolean f = false;
        if (index >= 0) {
            listSinhVien.remove(index);
            f = true;
        }
        return f;
    }

    @Override
    public boolean upDate(SinhVien s, int index) {
        boolean f = false;
        if (s != null && index >= 0) {
            listSinhVien.set(index, s);
            f = true;
        }
        return f;
    }

    @Override
    public List<SinhVien> findListSinhVien(String key) {
        List<SinhVien> list = new ArrayList<>();
        for (int i = 0; i < listSinhVien.size(); i++) {
            if(listSinhVien.get(i).getTen().equalsIgnoreCase(key)){
                list.add(listSinhVien.get(i));
            }            
        }
        return list;
    }

    @Override
    public SinhVien findSinhVien(String key) {
        
        for (int i = 0; i < listSinhVien.size(); i++) {
            if(listSinhVien.get(i).getTen().equalsIgnoreCase(key)){
                return listSinhVien.get(i);
            }
        }
        return null;
    }


    }

   


