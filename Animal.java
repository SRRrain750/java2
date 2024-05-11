/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

class Dog{
    String name;
    int hight;
    String colur;


void set(String name,int hight,String colur)
{

this.name=name;
this.hight=hight;
this.colur=colur;
}


void get()
{
    System.out.println("animal name"+name);
    System.out.println("animal hight"+hight);
    System.out.println("animal colur"+colur);
}
    
}





class  Tuktuk extends Dog{
    String name;
    int weight;
    String colur;
    
  
void set(String name,int weight,String colur)
{

this.name=name;
this.weight=weight;
this.colur=colur;  
    
    
    
    
 
void get()
{
    System.out.println("animal name"+name);
    System.out.println("animal weight"+weight);
    System.out.println("animal colur"+colur);
}  
    

}


public class Animal {
    public static void main(String args[])
    {
        
      Dog dog=new Dog();
      Tuktuk tuktuk=new Tuktuk();
        
     // dog.set("summy");
     // dog.set(2);
      
      //dog.set("black");
      
      
    }
}
}
