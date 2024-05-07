/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test;

import java.util.ArrayList;

/**
 *
 * @author sozcu
 * 
 */
public class PharmacySystem {

    public static ArrayList<Patient> PatientList = new ArrayList();
    public static Doctor[] DoctorList = new Doctor[10];
    public static ArrayList<Prescription> PrescriptionList = new ArrayList();
   

    PharmacySystem() {
    }

    static public void infoMedicine(int barcodeno) {
        for (Patient patient : PatientList) {
            for (Medicine medicine : patient.MedicineList) {
                if (medicine.getBarcodeno() == barcodeno) {
                    medicine.displayInfo();
                }

            }

        }
    }

    public double govermentPaidAmount(int barcodeno) {
        double govermentpaid = 0;
        for (Patient patient : PatientList) {
            for (Medicine medicine : patient.MedicineList) {

                if (medicine.getBarcodeno() == barcodeno) {
                    if (medicine.getPrice() <= 100) {
                        medicine.setGovermentpaid(medicine.getPrice() * 10 / 100);
                    } else if (medicine.getPrice() <= 500 && medicine.getPrice() > 100) {
                        medicine.setGovermentpaid(medicine.getPrice() * 20 / 100);
                    } else if (medicine.getPrice() > 500) {
                        medicine.setGovermentpaid(medicine.getPrice() * 30 / 100);
                    }
                    break;
                }

            }
        }
        return govermentpaid;

    }

    public double generalPrice(int barcodeno) {
        double GeneralPrice = 0;
        for (Patient patient : PatientList) {
            for (Medicine medicine : patient.MedicineList) {
                if (medicine.getBarcodeno() == barcodeno) {
                    GeneralPrice += medicine.getPrice();
                }

            }
        }
        return GeneralPrice;
    }

    public double generalPrice(String MedicineName) {
        double GeneralPrice = 0;

        for (Patient patient : PatientList) {
            for (Medicine medicine : patient.MedicineList) {
                if (medicine.getMedicineName().equals(MedicineName)) {
                    GeneralPrice += medicine.getPrice();
                }

            }

        }
        return GeneralPrice;
    }

    public void typeOfMedicine() {
        for (Patient patient : PatientList) {
            for (Medicine medicine : patient.MedicineList) {
                switch (medicine.getBarcodeno() % 10) {
                    case 1:
                        medicine.setMedicineType("Painkiller");
                        break;
                    case 2:
                        medicine.setMedicineType("Heart");
                        break;
                    case 3:
                        medicine.setMedicineType("Antibiotic");
                        break;
                    case 4:
                        medicine.setMedicineType("Psychiatric");
                        break;
                    default:
                        System.out.println("Please check your barcodeno.");
                        break;
                }

            }
        }
    }

    public void addPatient(Patient patient) {
        PatientList.add(patient);

    }

    public static void displayAllPatients() {
        for (Patient patient : PatientList) {
            patient.displayUserInfo();

        }
    }

    static public void showlist() {
        for (Patient patient : PatientList) {
            patient.showlist();

        }
    }

    public void AddDoctor(Doctor doctor) {
        boolean x = false;
        for (int i = 0; i < DoctorList.length; i++) {
            if (DoctorList[i] == null) {
                DoctorList[i] = doctor;
                x = true;
                break;
            }
        }
        if (x == false) {
            Doctor[] doctors = new Doctor[DoctorList.length + 1];
            for (int j = 0; j < DoctorList.length; j++) {
                doctors[j] = DoctorList[j];
            }
            int length = DoctorList.length - 1;
            DoctorList[length] = doctor;

        }

    }

    public int numberOfDoctor() {
        int index = 0;
        if (PatientList.size() % 3 == 0) {
            index = PatientList.size() / 3;
        } else if (PatientList.size() % 3 != 0) {
            index = (PatientList.size() / 3) + 1;
        }
        return index;
    }

    public void addPrescription(Prescription prescription) {
        if (prescription.getDosage() <= prescription.Medicine.getStock()) {
            PrescriptionList.add(prescription);
            prescription.Medicine.setStock(prescription.Medicine.getStock() - prescription.getDosage() );
        } else {
            System.out.println("There is not enough medicine.");
        }

    }
    
    
     
            
        }
        
 
            
                
            
            
        
        
    

