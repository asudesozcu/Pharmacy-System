/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test;

/**
 *
 * @author sozcu
 */
public class Antibiotic extends Medicine {



    public Antibiotic(String MedicineName, int price, int stock, int barcodeno) {
        super(MedicineName, price, stock, barcodeno);
    }
    
    @Override
    public void updateMedicineStock(int newAmount) {
        this.setStock(this.getStock() + newAmount);
    }
   
}
