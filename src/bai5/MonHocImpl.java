/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai5;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ACER
 */
public class MonHocImpl implements IMonHocService {

    public List<MonHoc> listMonHoc = new ArrayList<>();

    public MonHocImpl() {
//        listMonHoc.add(new MonHoc("CMO01", "JAVA2", 3));
//        listMonHoc.add(new MonHoc("CMO02", "JAVA3", 3));
//        listMonHoc.add(new MonHoc("CMO03", "JAVA4", 3));
    }

    @Override
    public List<MonHoc> getAll() {
        return listMonHoc;
    }

    @Override
    public String writeFile( String path) {
        
        try {
            FileOutputStream fo = new FileOutputStream(path);
            ObjectOutputStream ofo = new ObjectOutputStream(fo);
            ofo.writeObject(listMonHoc);
            ofo.close();
            return "Ghi thanh cong";
        } catch (Exception e) {
            return "Loi ghi file";
        }
    }

    @Override
    public String readFile( String path) {
        try {
            FileInputStream fi = new FileInputStream(path);
            ObjectInputStream ifi = new ObjectInputStream(fi);
            listMonHoc = (List<MonHoc>) ifi.readObject();
            ifi.close();
            return "Doc thanh cong";
        } catch (Exception e) {
            return "Loi ghi file";
        }
    }

}
