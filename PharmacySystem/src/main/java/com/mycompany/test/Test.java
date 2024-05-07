/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test;

import java.util.Scanner;

/**
 *
 * @author sozcu
 */
public class Test {

    public static void main(String[] args) {
        PharmacySystem pharmacy = new PharmacySystem();
        Patient patient1 = new Patient("Asude", "Sozcu", 123456789, "Heart");
        Patient patient2 = new Patient("Ayşe", "Yılmaz", 133434353, "Psychiatric");
        Patient patient3 = new Patient("Ahmet", "Ak", 1374735943, "Infection");

        Medicine medicine1 = new Medicine("Parol", 10, 100, 12341);
        Medicine medicine2 = new Medicine("Dideral", 15, 200, 2342);
        Medicine medicine3 = new Medicine("Majezik", 20, 250, 235453);
        Medicine medicine4 = new Medicine("A", 25, 300, 64753);
        Medicine medicine5 = new Medicine("B", 30, 350, 65784);
        Medicine medicine6 = new Medicine("C", 35, 0, 32671);

        patient1.addMedicine(medicine1);
        patient1.addMedicine(medicine2);
        patient2.addMedicine(medicine3);
        patient2.addMedicine(medicine4);
        patient3.addMedicine(medicine5);
        patient3.addMedicine(medicine6);

        pharmacy.typeOfMedicine();

        pharmacy.addPatient(patient1);
        pharmacy.addPatient(patient2);
        pharmacy.addPatient(patient3);
        System.out.println(pharmacy.generalPrice(12341));

        pharmacy.displayAllPatients();

        Doctor doc1 = new Doctor("Hasan", "Yılmaz", 12321, 211321);
        Doctor doc2 = new Doctor("Ahmet", "Çelik", 54322, 457856);
        Doctor doc3 = new Doctor("Mehmet", "Kaya", 54672, 787653);
        Doctor doc4 = new Doctor("Ayşe", "Taş", 123454, 87865456);
        Prescription pre1 = new Prescription(doc1, patient1, medicine1, 1);
        Prescription pre2 = new Prescription(doc3, patient3, medicine6, 5);
        Prescription pre3 = new Prescription(doc4, patient2, medicine5, 4);
      System.out.println("-------------");
        patient3.showlist();
        
        pharmacy.AddDoctor(doc1);
        pharmacy.AddDoctor(doc2);
        pharmacy.AddDoctor(doc3);
        pharmacy.AddDoctor(doc4);
  
        pharmacy.numberOfDoctor();

        for (int i = 0; i < pharmacy.DoctorList.length; i++) {
            if (pharmacy.DoctorList[i] != null) {
                pharmacy.DoctorList[i].displayUserInfo();

            }
        }
        pharmacy.generalPrice(64753);

        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Drug tracking System");
        System.out.println("Please write your Id:");
        int scannerId = scan.nextInt();

        for (int i = 0; i < pharmacy.DoctorList.length; i++) {
            if (pharmacy.DoctorList[i] != null) {
                if (scannerId == pharmacy.DoctorList[i].ID) {
                    System.out.println("Please write your Password");
                    int Password = scan.nextInt();
                    if (Password == pharmacy.DoctorList[i].password) {
                        System.out.println("Log in successful ");
                        System.out.print("Welcome: ");
                        pharmacy.DoctorList[i].displayUserInfo();
                        break;
                    } else {
                        System.out.println("password and Id did not match");
                        break;
                    }
                } else if (scannerId != pharmacy.DoctorList[i].ID) {
                    System.out.println("Please check your Id.");
                    break;
                }
            }

        }

    }
}
