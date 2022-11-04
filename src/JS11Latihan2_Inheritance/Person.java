/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JS11Latihan2_Inheritance;

/**
 *
 * Created by 21343018_Anita Nursi
 */
public class Person {
    protected String name;
    protected int age;
    
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    //metode
    
    public void info(){
        System.out.println("Nama: " + this.name);
        System.out.println("Usia: " + this.age);
    }
    //akhir kelas program
}
