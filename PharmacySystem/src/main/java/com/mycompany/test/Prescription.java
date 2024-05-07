package com.mycompany.test;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author sozcu
 */
public class Prescription {

    Patient Patient;
    Doctor Doctor;
    Medicine Medicine;
    private int dosage;

    public Prescription(Doctor doctor, Patient patient, Medicine medicine, int dossage) {

    }

    public void displayPrescription() {
        this.Doctor.displayUserInfo();
        this.Patient.displayUserInfo();
        this.Medicine.displayInfo();
        System.out.println(this.getDosage() + " times a day ");

    }

    /**
     * @param dosage the dosage to set
     */
    public void setDosage(int dosage) {
        this.dosage = dosage;
    }

    /**
     * @return the dosage
     */
    public int getDosage() {
        return dosage;
    }
}
