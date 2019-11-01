/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL.model;

import java.sql.Date;
import java.time.LocalDateTime;

/**
 *
 * @author Drazen Dragovic
 */
public class Outpatient extends Person {

    private int iDOutpat;
    private int oPNumber;
    private double oPHeight;
    private double opWeight;
    private String opBloodType;
    private String BreafComplaint;
    private int opTypeID;
    private int personID;

    public int getiDOutpat() {
        return iDOutpat;
    }

    public int getoPNumber() {
        return oPNumber;
    }

    public void setoPNumber(int oPNumber) {
        this.oPNumber = oPNumber;
    }

    public double getoPHeight() {
        return oPHeight;
    }

    public void setoPHeight(double oPHeight) {
        this.oPHeight = oPHeight;
    }

    public double getOpWeight() {
        return opWeight;
    }

    public void setOpWeight(double opWeight) {
        this.opWeight = opWeight;
    }

    public String getOpBloodType() {
        return opBloodType;
    }

    public void setOpBloodType(String opBloodType) {
        this.opBloodType = opBloodType;
    }

    public int getOpTypeID() {
        return opTypeID;
    }

    public void setOpTypeID(int opTypeID) {
        this.opTypeID = opTypeID;
    }

    public int getPersonID() {
        return personID;
    }

    public void setPersonID(int personID) {
        this.personID = personID;
    }

    public String getBreafComplaint() {
        return BreafComplaint;
    }

    public void setBreafComplaint(String BreafComplaint) {
        this.BreafComplaint = BreafComplaint;
    }

    public Outpatient() {

    }

    public Outpatient(int oPId, int oPNumber, double oPHeight, double opWeight, String opBloodType, int opTypeID, int personID) {
        this.iDOutpat = oPId;
        this.oPNumber = oPNumber;
        this.oPHeight = oPHeight;
        this.opWeight = opWeight;
        this.opBloodType = opBloodType;
        this.opTypeID = opTypeID;
        this.personID = personID;
    }

    public Outpatient(int oPId, int oPNumber, double oPHeight, double opWeight, String opBloodType, String complaint, int opTypeID, int personID) {
        this.iDOutpat = oPId;
        this.oPNumber = oPNumber;
        this.oPHeight = oPHeight;
        this.opWeight = opWeight;
        this.opBloodType = opBloodType;
        this.BreafComplaint = complaint;
        this.opTypeID = opTypeID;
        this.personID = personID;
    }

    public Outpatient(int oPId, String name, String middleName, String surname, Date birthDate, int oPNumber, double oPHeight, double opWeight, String opBloodType, String complaint, int opTypeID, int personID) {
        super(name, middleName, surname, birthDate);
        this.iDOutpat = oPId;
        this.oPNumber = oPNumber;
        this.oPHeight = oPHeight;
        this.opWeight = opWeight;
        this.opBloodType = opBloodType;
        this.BreafComplaint = complaint;
        this.opTypeID = opTypeID;
        this.personID = personID;
    }

    public Outpatient(int opId, int oPNumber, double oPHeight, double opWeight, String opBloodType, String complaint, int opTypeID, int personID, String firstName, String middleName, String surname, boolean sex, Date dateOFBirth, String maritalStatus, int NoDependents, String occupation, double gaIncome) {
        super(firstName, middleName, surname, sex, dateOFBirth, maritalStatus, NoDependents, occupation, gaIncome);
        this.iDOutpat = opId;
        this.oPNumber = oPNumber;
        this.oPHeight = oPHeight;
        this.opWeight = opWeight;
        this.opBloodType = opBloodType;
        this.BreafComplaint = complaint;
        this.opTypeID = opTypeID;
        this.personID = personID;
    }

    public static String[] patientColumns() {
        String[] columns = {
            "PatientID", "First Name", "Middle Name", "Surname", "Date of Birth", "Blood Type", "OPID"
        };
        return columns;
    }

    public static String[] newPatientColumns() {
        String[] columns = {
            "PatientID", "First Name", "Surname", "Complaint"
        };
        return columns;
    }

}
