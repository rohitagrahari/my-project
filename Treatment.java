package com.mycompany.londaonassignment;

import java.util.Scanner;

public class Treatment {
    int TreatmentID;
    String DiseaseName;
    String TreatmentType;
    int ApproxTreatmentCost;
    Scanner sc2= new Scanner(System.in);
    void treatmentDetails(){
        System.out.println("Enter Treatment ID-");
        TreatmentID= sc2.nextInt();
        System.out.println("Enter disease Name-");
        DiseaseName=sc2.next();
        System.out.println("Enter Treatment Type-");
        TreatmentType= sc2.next();
        System.out.println("Enter Approx Treatment Cost-");
        ApproxTreatmentCost= sc2.nextInt();
    }

    void Display(){
        System.out.println("Treatment ID- "+TreatmentID);
        System.out.println("Disease Name- " + DiseaseName);
        System.out.println("Treatment Type- "+ TreatmentType);
        System.out.println("Approx Treatment Cost- "+ ApproxTreatmentCost);
    }

    void updateTreatmentdetais(){
        System.out.println("Enter disease Name-");
        DiseaseName=sc2.next();
        System.out.println("Enter Treatment Type-");
        TreatmentType= sc2.next();
        System.out.println("Enter Approx Treatment Cost-");
        ApproxTreatmentCost= sc2.nextInt();
    }

    void removeTreatmentDetails(){
        TreatmentID= 0;
        DiseaseName= null;
        TreatmentType= null;
        ApproxTreatmentCost=0;
    }
}
