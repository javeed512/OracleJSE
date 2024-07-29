/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.oracle;

/**
 *
 * @author DELL
 */
public class VariablesDemo {
    
  static  int  sid;          // instance variables
   static  String  sname;
    
   public static void main(){
   
   }
    
        public static void main(String[] args) {
        
            int x = 0;
            
           float  f = 4.555F;
           
           byte b =  (byte) 130;
           
           short s = 150;
           
            System.out.println("b value is "+b);
            
            System.out.println("x value is "+x);
            
            
                VariablesDemo v1  =       new   VariablesDemo();
            
                        v1.sid = 101;
                        v1.sname = "king";
            
            System.out.println("sid v1 : "+v1.sid);
            
            System.out.println("sname  v1: "+v1.sname);
            
           
             VariablesDemo v2  =       new   VariablesDemo();
            
             
//                v2.sid = 102;
//                v2.sname = "raju";
            
            System.out.println("sid v2 : "+v2.sid);
            
            System.out.println("sname  v2: "+VariablesDemo.sname);
            
            
    }
    
    
    
}
