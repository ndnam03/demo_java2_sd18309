/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package bai5;

import java.util.List;

/**
 *
 * @author ACER
 */
public interface IMonHocService {

    List<MonHoc> getAll();

    String writeFile(String path);

    String readFile( String path);
}
