package com.mycompany.londaonassignment;
import java.util.Scanner;

public class Patient extends Persons{
    int PatientID;

    Scanner sc= new Scanner(System.in);
    void addPatientDetails(){
        System.out.println("Enter Patient ID-");
        PatientID= sc.nextInt();
        System.out.println("Enter patient Name-");
        Name= sc.next();
        System.out.println("Enter Patient Email-");
        Email= sc.next();
        System.out.println("Enter Patient Gender-");
        Gender= sc.next();
        System.out.println("Enter Patient Mobile Number-");
        ContactNumber= sc.next();
    }

    void Display(){
        System.out.println("Patient id is- "+ PatientID);
        System.out.println("Patient Email is- "+ Email);
        System.out.println("Patient Name is- "+ Name);
        System.out.println("Patient Gender is- "+ Gender);
        System.out.println("Patient Contact Number is- "+ ContactNumber);
    }

    void removePatientDetails(){
        PatientID= 0;
        Name=null;
        Email=null;
        Gender=null;
        ContactNumber=null;

    }
}
