/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test;

import java.util.ArrayList;

/**
 *
 * @author sozcu
 */
public class Patient extends Person {

    ArrayList<Medicine> MedicineList = new ArrayList();

    Prescription prescription;
    String illnessType;

    public Patient(String FirstName, String LastName, int ID, String illnessType) {
        super.FirstName = FirstName;
        super.LastName = LastName;
        super.ID = ID;
        this.illnessType = illnessType;
    }

    public void addMedicine(Medicine medicine) {

        this.MedicineList.add(medicine);

    }

    public void deleteMedicine(int barcodeno) {
        for (Medicine medicine : MedicineList) {
            if (medicine.getBarcodeno() == barcodeno) {
                MedicineList.remove(MedicineList.indexOf(medicine));
            }

        }

    }

    public void showlist() {
        System.out.println("Quantity: " + this.MedicineList.size());

        for (Medicine medicine : MedicineList) {
            medicine.displayInfo();

        }

    }

    @Override
    public void displayUserInfo() {
        System.out.println("Name Surname of patient: " + this.FirstName + " " + this.LastName);
        System.out.println("ID:" + this.ID);
        System.out.println("Relevant department : " + this.illnessType);
    }

}
