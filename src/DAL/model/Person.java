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
public class Person {

    private int iDPerson;
    private String firstName;
    private String middleName;
    private String surname;
    private boolean sex;
    //rivate LocalDateTime dateOFBirth;
    private Date dateOFBirth;
    private String maritalStatus;
    private int NoDependents;
    private String occupation;
    private double gaIncome;

    public int getiDPerson() {
        return iDPerson;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public boolean getSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public Date getDateOFBirth() {
        return dateOFBirth;
    }

    public void setDateOFBirth(Date dateOFBirth) {
        this.dateOFBirth = dateOFBirth;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public int getNoDependents() {
        return NoDependents;
    }

    public void setNoDependents(int NoDependents) {
        this.NoDependents = NoDependents;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public double getGaIncome() {
        return gaIncome;
    }

    public void setGaIncome(double gaIncome) {
        this.gaIncome = gaIncome;
    }

    public Person() {
    }

    public Person(String firstName, String middleName, String surname) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.surname = surname;
    }

    public Person(String firstName, String middleName, String surname, Date dateOfBirth) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.surname = surname;
        this.dateOFBirth = dateOfBirth;
    }

    public Person(String firstName, String middleName, String surname, boolean sex, Date dateOFBirth, String maritalStatus, int NoDependents, String occupation, double gaIncome) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.surname = surname;
        this.sex = sex;
        this.dateOFBirth = dateOFBirth;
        this.maritalStatus = maritalStatus;
        this.NoDependents = NoDependents;
        this.occupation = occupation;
        this.gaIncome = gaIncome;
    }

    public Person(int iDPerson, String firstName, String middleName, String surname, boolean sex, Date dateOFBirth, String maritalStatus, int NoDependents, String occupation, double gaIncome) {
        this.iDPerson = iDPerson;
        this.firstName = firstName;
        this.middleName = middleName;
        this.surname = surname;
        this.sex = sex;
        this.dateOFBirth = dateOFBirth;
        this.maritalStatus = maritalStatus;
        this.NoDependents = NoDependents;
        this.occupation = occupation;
        this.gaIncome = gaIncome;
    }

    @Override
    public String toString() {
        return firstName + "(" + middleName + ")" + surname;
    }

}
