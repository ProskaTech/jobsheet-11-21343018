/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JS11Latihan4_Inheritance;

/**
 *
 * Created by 21343018_Anita Nursi
 */
public class B extends A{
    private int b;
    
    public void setB(int nilai){
        b = nilai;
    }
    
    public int getB(){
        return b;
    }
    
    public void tampilkanNilai(){
        super.tampilkanNilai();
        System.out.println("Nilai b = " + getB());
    }
}
