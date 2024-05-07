/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test;

/**
 *
 * @author sozcu
 */
public class Doctor extends Person {
    int password;

     public Doctor(String FirstName,String LastName, int ID, int password){
         super.ID=ID;
         super.FirstName=FirstName;
         super.LastName = LastName;
         this.password=password;
     }

    @Override
    public void displayUserInfo() {
        System.out.println("Name Surname:" + FirstName + " " + LastName);
    }
    

   
    

    

}
