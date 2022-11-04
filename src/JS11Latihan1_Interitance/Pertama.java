/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JS11Latihan1_Interitance;

/**
 *
 * Created by 21343018_Anita Nursi
 */
public class Pertama {
    private int a = 10;
    
    protected void terprotek(){
        System.out.println("Metode ini hanya untuk anaknya.");
    }
    
    public void info(){
        System.out.println("a = " + a);
        System.out.println("Dipanggil pada = " + this.getClass().getName());
    }
}
