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
public class AppointmentItem {

    private int iDAppItem;
    private Date itemDate;
    private String appIteDesc;
    private String result;
    private double price;
    private int appItTypeID;
    private int appItemStatusID;
    private int appointmentID;
    private int medStaffID;

    public int getiDAppItem() {
        return iDAppItem;
    }

    public Date getItemDate() {
        return itemDate;
    }

    public void setItemDate(Date itemDate) {
        this.itemDate = itemDate;
    }

    public String getAppIteDesc() {
        return appIteDesc;
    }

    public void setAppIteDesc(String appIteDesc) {
        this.appIteDesc = appIteDesc;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAppItTypeID() {
        return appItTypeID;
    }

    public void setAppItTypeID(int appItTypeID) {
        this.appItTypeID = appItTypeID;
    }

    public int getAppointmentID() {
        return appointmentID;
    }

    public void setAppointmentID(int appointmentID) {
        this.appointmentID = appointmentID;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public int getAppItemStatusID() {
        return appItemStatusID;
    }

    public void setAppItemStatusID(int appItemStatusID) {
        this.appItemStatusID = appItemStatusID;
    }

    public int getMedStaffID() {
        return medStaffID;
    }

    public void setMedStaffID(int medStaffID) {
        this.medStaffID = medStaffID;
    }

    public AppointmentItem(int iDAppItem, Date itemDate, String appIteDesc, String result, double price, int appItTypeID, int appItemStatusID, int appointmentID, int medStaffID) {
        this.iDAppItem = iDAppItem;
        this.itemDate = itemDate;
        this.appIteDesc = appIteDesc;
        this.result = result;
        this.price = price;
        this.appItTypeID = appItTypeID;
        this.appItemStatusID = appItemStatusID;
        this.appointmentID = appointmentID;
        this.medStaffID = medStaffID;
    }
    
    public static String[] appointmentItemsColumns() {
        String[] columns = {
            "TaskID", "Date", "Type", "Status"
        };
        return columns;
    }
}
