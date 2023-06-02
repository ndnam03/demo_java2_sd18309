/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai6;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author ACER
 */
public class DemoThread implements Runnable {

    public static void main(String[] args) {
//        DemoThread th = new DemoThread();
//        Thread t1 = new Thread(th);
//        t1.setName("t1");
//        t1.start();
//         Thread t2 = new Thread(th);
//        t2.setName("t2");
//        t2.start();
//         Thread t3 = new Thread(th);
//        t3.setName("t3");
//        t3.start();
        

    }

    @Override
    public void run() {
        Thread thh = Thread.currentThread();
        for (int i = 0; i < 5; i++) {
            System.out.println("Luong: " + thh.getName() + " " + i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    }
}
