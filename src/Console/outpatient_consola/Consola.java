/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Console.outpatient_consola;

import BL.PatientView;
import DAL.model.Outpatient;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Drazen Dragovic
 */
public class Consola implements Runnable {
    
    private PatientView pw = new PatientView();
    Scanner sc = new Scanner(System.in);

    @Override
    public void run() {
        ShowMenu();
    }
    
    public void ShowMenu() {
        
       int option = 0;
       
        do {
            menu();
            
            if (sc.hasNextInt()) {
                option = sc.nextInt();
            }
            else{
                System.out.println("Wrong entry!");
            }
            
            switch(option){
                case 1:
                    showPatients();
                    break;
                case 2:
                    showPatientById();
                    break;
            
            }
            
        } while (option != 0);
    }

    private void menu() {
        System.out.println("------------------------------------------------------");
        System.out.println("OUTPATIENT MANAGER");
        System.out.println("------------------------------------------------------");
        System.out.println("[1] Show all patients");
        System.out.println("[2] Show patient by ID");
        System.out.println("[0] Exit");

    }

    private void showPatientById() {
        
        try {
                
            System.out.println("Insert patient ID");
            int id = sc.nextInt();
            
            Outpatient op = pw.getPatientById(id);
            System.out.printf( "%-13s %-10s %-13s %-10s %-15s %-13s %s %n", "PatientID", "Name", "Middle Name", "Surname", "Date of Birth", "Blood Type", "OPID");
            System.out.printf("%5s %14s %10s %13s %14s %7s %21s %n", op.getiDOutpat(), op.getFirstName(), op.getMiddleName(), op.getSurname(), op.getDateOFBirth().toLocalDate(), op.getOpBloodType(), op.getoPNumber());
            System.out.println("\n");
            
        } catch (Exception e) {
            System.out.println(e.getMessage());     
        }
    }

    private void showPatients() {
        try {
            List<Outpatient> patients = pw.getPatients();
            System.out.printf( "%-13s %-10s %-13s %-10s %-15s %-13s %s %n", "PatientID", "Name", "Middle Name", "Surname", "Date of Birth", "Blood Type", "OPID");
            for (Outpatient op : patients) {
                System.out.printf("%5s %14s %10s %13s %14s %7s %21s %n", op.getiDOutpat(), op.getFirstName(), op.getMiddleName(), op.getSurname(), op.getDateOFBirth().toLocalDate(), op.getOpBloodType(), op.getoPNumber());
            }
            System.out.println("\n");
        } catch (Exception e) {
            System.out.println(e.getMessage());     
        }
    }
    
}
