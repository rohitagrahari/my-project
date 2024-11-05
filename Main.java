package com.mycompany.londaonassignment;

import java.util.ArrayList;

public class Main {
    ArrayList arr= new ArrayList();
    public static void main(String[] args) {

        Patient Patients= new Patient();
        Patients.addPatientDetails();

        Practitioner Practitioners= new Practitioner();
        Practitioners.addpractitionerDetails();

        Treatment Treatments= new Treatment();
        Treatments.treatmentDetails();

        Prescription priscription= new Prescription();
        priscription.createprescription(Patients,Practitioners,Treatments );
        priscription.show();

    }
}
