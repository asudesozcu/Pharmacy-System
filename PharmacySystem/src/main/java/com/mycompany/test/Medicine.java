/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test;

/**
 *
 * @author sozcu
 */
public class Medicine {

    private int price;
    private int stock;
    private int barcodeno;
    private double govermentpaid;
    private String MedicineName;
    private String MedicineType;

    public Medicine(String MedicineName, int price, int stock, int barcodeno) {
        this.price = price;
        this.barcodeno = barcodeno;
        this.MedicineName = MedicineName;
        this.stock = stock;
    }

    public void displayInfo() {
        System.out.println("Medicine name:" + this.getMedicineName());
        System.out.println("Medicine price:" + this.getPrice());
        System.out.println("Medicine amount in stock:" + this.getStock());
        System.out.println("Medicine type:" + this.getMedicineType());

    }
    
    public void updateMedicineStock(int newAmount) {
        this.setStock(this.getStock() + newAmount);
    }

    /**
     * @return the price
     */
    public int getPrice() {
        return price;
    }

    /**
     * @return the stock
     */
    public int getStock() {
        return stock;
    }

    /**
     * @return the barcodeno
     */
    public int getBarcodeno() {
        return barcodeno;
    }

    /**
     * @param barcodeno the barcodeno to set
     */
    public void setBarcodeno(int barcodeno) {
        this.barcodeno = barcodeno;
    }

    /**
     * @return the govermentpaid
     */
    public double getGovermentpaid() {
        return govermentpaid;
    }

    /**
     * @param govermentpaid the govermentpaid to set
     */
    public void setGovermentpaid(double govermentpaid) {
        this.govermentpaid = govermentpaid;
    }

    /**
     * @return the MedicineName
     */
    public String getMedicineName() {
        return MedicineName;
    }

    /**
     * @param MedicineName the MedicineName to set
     */
    public void setMedicineName(String MedicineName) {
        this.MedicineName = MedicineName;
    }

    /**
     * @param MedicineType the MedicineType to set
     */
    public void setMedicineType(String MedicineType) {
        this.MedicineType = MedicineType;
    }

    /**
     * @param stock the stock to set
     */
    public void setStock(int stock) {
        this.stock = stock;
    }

    /**
     * @return the MedicineType
     */
    public String getMedicineType() {
        return MedicineType;
    }
    
   
}
