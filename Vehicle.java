/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

class Car{
    
    String name;
    String colur;
    String prize;
    
    void setcar(String name,String colur,String prize){
        this.name=name;
        this.colur=colur;
        this.prize=prize;
    }
    
    void getcar(){
        System.out.println("Vehicle name"+name);
        System.out.println("Vehicle colur"+colur);
        System.out.println("vehical prize"+prize);
        
    }
}



class TwoVehiler extends Car{
    String modle;
    
    void set(String modle){
        this.modle=modle;
    }
    
      void  get(){
        System.out.println("Vehicle nmodle"+modle);
      }  
        
      
}    

public class Vehicle {
    public  static void main(String args[]){
     Car car=new Car();  
     TwoVehiler veh=new TwoVehiler();
     veh.setcar("Thar","black","200000");
     veh.Vehiler.getcar();
    }
}
