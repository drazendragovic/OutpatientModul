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
public class Appointment {

    private int iDAppoint;
    private Date dateCreated;
    private String title;
    private String symptoms;
    private String diagnose;
    private Date preferredDate;
    private Date followUpDate;
    private boolean state;
    private int statusID;
    private int outpatientID;
    private int doctorID;
    private int addressID;

    public int getiDAppoint() {
        return iDAppoint;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(String symptoms) {
        this.symptoms = symptoms;
    }

    public String getDiagnose() {
        return diagnose;
    }

    public void setDiagnose(String diagnose) {
        this.diagnose = diagnose;
    }

    public Date getPreferredDate() {
        return preferredDate;
    }

    public void setPreferredDate(Date preferredDate) {
        this.preferredDate = preferredDate;
    }

    public Date getFollowUpDate() {
        return followUpDate;
    }

    public void setFollowUpDate(Date followUpDate) {
        this.followUpDate = followUpDate;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public int getStatusID() {
        return statusID;
    }

    public void setStatusID(int statusID) {
        this.statusID = statusID;
    }

    public int getOutpatientID() {
        return outpatientID;
    }

    public void setOutpatientID(int outpatientID) {
        this.outpatientID = outpatientID;
    }

    public int getDoctorID() {
        return doctorID;
    }

    public void setDoctorID(int doctorID) {
        this.doctorID = doctorID;
    }

    public int getAddressID() {
        return addressID;
    }

    public void setAddressID(int addressID) {
        this.addressID = addressID;
    }

    public Appointment(int appId, Date dateCreated, String title, String symptoms, String diagnose, Date preferredDate, Date followUpDate, boolean state, int statusID, int outpatientID, int doctorID, int addressID) {
        this.iDAppoint = appId;
        this.dateCreated = dateCreated;
        this.title = title;
        this.symptoms = symptoms;
        this.diagnose = diagnose;
        this.preferredDate = preferredDate;
        this.followUpDate = followUpDate;
        this.state = state;
        this.statusID = statusID;
        this.outpatientID = outpatientID;
        this.doctorID = doctorID;
        this.addressID = addressID;
    }

    public static String[] appointmentColumns() {
        String[] columns = {
            "AppointmentID", "Title", "Date", "Doctor", "Patient"
        };
        return columns;
    }

    public static String[] appointmentDocColumns() {
        String[] columns = {
            "AppointmentID", "Title", "Date", "Patient"
        };
        return columns;
    }

    public static String[] appointmentPatColumns() {
        String[] columns = {
            "AppointmentID", "Title", "Date", "Doctor"
        };
        return columns;
    }

}
