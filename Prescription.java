package com.mycompany.londaonassignment;

public class Prescription implements Commandinterface{

    int ID;
    Patient Patients= new Patient();
    Practitioner Practitioners= new Practitioner();
    Treatment Treatments= new Treatment();


    public void createprescription(Patient patient, Practitioner practitioner, Treatment treatment){
        this.Patients= patient;
        this.Practitioners=practitioner;
        this.Treatments=treatment;
    }

    public void show(){
        Patients.Display();
        Practitioners.Display();
       Treatments.Display();
    }
    void suspend(int ID){


    }
}
