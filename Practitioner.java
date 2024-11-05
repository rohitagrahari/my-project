package com.mycompany.londaonassignment;
import java.util.Scanner;

public class Practitioner extends Persons{
    String Speciality;
    int DoctorID;

    Scanner sc= new Scanner(System.in);
    void addpractitionerDetails(){
        System.out.println("Enter Doctor ID-");
        DoctorID= sc.nextInt();
        System.out.println("Enter Doctor Speciality-");
        Speciality= sc.next();
        System.out.println("Enter Doctor Name-");
        Name= sc.next();
        System.out.println("Enter Doctor Gender-");
        Gender= sc.next();
        System.out.println("Enter Doctor Mobile Number-");
        ContactNumber= sc.next();

    }
    void Display(){
        System.out.println("Doctor id is- "+ DoctorID);
        System.out.println("Doctor Speciality is- "+ Speciality);
        System.out.println("Doctor Name is- "+ Name);
        System.out.println("Doctor Gender is- "+ Gender);
        System.out.println("Doctor Contact Number is- "+ ContactNumber);
    }
    void removePractitionerDetails(){
        DoctorID=0;
        Speciality=null;
        Name=null;
        Gender=null;
        ContactNumber= null;
    }
}
