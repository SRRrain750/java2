/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

class Test
{
    
        static int x=10;
        static void display()
    {
        System.out.println(x);
    }
}
 class StaticDemo 
 {
    public static void main(String args[])
    {
    Test obj1,obj2;//create arefreance variable
    obj1=new Test();//create object
    obj2=new Test();
    ++obj1.x;//increment x in obj1
    System.out.print("x in obj1:");
    obj1.display();
    System.out.print("x in obj2:");
    obj2.display();
}
}
