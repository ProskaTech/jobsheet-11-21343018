/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JS11Latihan2_Inheritance;

/**
 *
 * Created by 21343018_Anita Nursi
 */
public class Employ extends Person{
    private String noKaryawan;
    
    public Employ (String noKaryawan, String name, int age){
        super(name, age);
        this.noKaryawan = noKaryawan;
    }
    
    public void info(){
        System.out.println("No. karyawan: " + this.noKaryawan);
        super.info();
    }
}
