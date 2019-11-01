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
public class MedicalPerson extends Person {

    private int iDOMedPerson;
    private double fees;
    private String userName;
    private String password;
    private int mPTypeID;
    private int personID;

    public int getiDOMedPerson() {
        return iDOMedPerson;
    }

    public double getFees() {
        return fees;
    }

    public void setFees(double fees) {
        this.fees = fees;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getmPTypeID() {
        return mPTypeID;
    }

    public void setmPTypeID(int mPTypeID) {
        this.mPTypeID = mPTypeID;
    }

    public int getPersonID() {
        return personID;
    }

    public void setPersonID(int personID) {
        this.personID = personID;
    }
    
    public MedicalPerson(String firstName, String middleName, String surname) {
        super(firstName, middleName, surname);
    }
    
    public MedicalPerson(String firstName, String middleName, String surname, boolean sex, Date dateOFBirth, String maritalStatus, int NoDependents, String occupation, double gaIncome) {
        super(firstName, middleName, surname, sex, dateOFBirth, maritalStatus, NoDependents, occupation, gaIncome);
    }

    public MedicalPerson(String firstName, String middleName, String surname, boolean sex, Date dateOFBirth, String maritalStatus, int NoDependents, String occupation, double gaIncome, double fees, String userName, String password, int mPTypeID, int personID) {
        super(firstName, middleName, surname, sex, dateOFBirth, maritalStatus, NoDependents, occupation, gaIncome);
        this.fees = fees;
        this.userName = userName;
        this.password = password;
        this.mPTypeID = mPTypeID;
        this.personID = personID;
    }
    
    public MedicalPerson(int idPers, String firstName, String middleName, String surname, boolean sex, Date dateOFBirth, String maritalStatus, int NoDependents, String occupation, double gaIncome, double fees, String userName, String password, int mPTypeID, int personID) {
        super(firstName, middleName, surname, sex, dateOFBirth, maritalStatus, NoDependents, occupation, gaIncome);
        this.iDOMedPerson = idPers;
        this.fees = fees;
        this.userName = userName;
        this.password = password;
        this.mPTypeID = mPTypeID;
        this.personID = personID;
    }

}
