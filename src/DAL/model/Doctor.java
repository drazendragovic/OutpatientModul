/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL.model;

import java.time.LocalDateTime;
import java.sql.Date;

/**
 *
 * @author Drazen Dragovic
 */
public class Doctor extends MedicalPerson {

    private int iDDoctor;
    private String degree;
    private String spec;
    private String descr;
    private int medPersonID;

    public int getiDDoctor() {
        return iDDoctor;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    public int getMedPersonID() {
        return medPersonID;
    }

    public void setMedPersonID(int medPersonID) {
        this.medPersonID = medPersonID;
    }

    public Doctor(int Id, String firstName, String middletname, String surname, String degree, String spec) {
        super(firstName, middletname, surname);
        this.iDDoctor = Id;
        this.degree = degree;
        this.spec = spec;
    }
    
    public Doctor(int Id, String firstName, String middletname, String surname, String degree, String spec, int MedPerId) {
        super(firstName, middletname, surname);
        this.iDDoctor = Id;
        this.degree = degree;
        this.spec = spec;
        this.medPersonID = MedPerId;
    }
    
    public Doctor(int Id, String firstName, String middleName, String surname, boolean sex, Date dateOFBirth, String maritalStatus, int NoDependents, String occupation, double gaIncome, double fees, String userName, String password, int mPTypeID, String degree, String spec, String descr, int personID) {
        super(firstName, middleName, surname, sex, dateOFBirth, maritalStatus, NoDependents, occupation, gaIncome, fees, userName, password, mPTypeID, personID);
        this.iDDoctor = Id;
        this.degree = degree;
        this.spec = spec;
        this.descr = descr;
    }
        
    
    public static String[] doctorColumns() {
        String[] columns = {
            "DoctorID", "First Name", "Middle Name", "Surname", "Degree", "Specialization"
        };
        return columns;
    }
}
