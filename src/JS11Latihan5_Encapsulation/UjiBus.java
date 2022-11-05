/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JS11Latihan5_Encapsulation;

/**
 *
 * Created by 21343018_Anita Nursi
 */
public class UjiBus {
    public static void main(String[] args) {
        Bus busMini = new Bus();
    
        busMini.penumpang = 5;
        busMini.maxPenumpang = 15;
        
        busMini.cetak();
        
        busMini.penumpang = busMini.penumpang + 5;
        busMini.cetak();
        
        busMini.penumpang = busMini.penumpang - 2;
        busMini.cetak();
        
        busMini.penumpang = busMini.penumpang + 8;
        busMini.cetak();
    }
}
