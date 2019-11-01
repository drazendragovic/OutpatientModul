/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL.model;

import java.time.LocalDateTime;

/**
 *
 * @author Drazen Dragovic
 */
public class FinalBill {

    private int iDBill;
    private LocalDateTime billDate;
    private String billNum;
    private String billDesc;
    private double totalPrice;
    private int outpatientID;
    private int doctorID;
    private int payTypeID;

    public int getiDBill() {
        return iDBill;
    }

    public LocalDateTime getBillDate() {
        return billDate;
    }

    public void setBillDate(LocalDateTime billDate) {
        this.billDate = billDate;
    }

    public String getBillNum() {
        return billNum;
    }

    public void setBillNum(String billNum) {
        this.billNum = billNum;
    }

    public String getBillDesc() {
        return billDesc;
    }

    public void setBillDesc(String billDesc) {
        this.billDesc = billDesc;
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

    public int getPayTypeID() {
        return payTypeID;
    }

    public void setPayTypeID(int payTypeID) {
        this.payTypeID = payTypeID;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
    
    public FinalBill(LocalDateTime billDate, String billNum, String billDesc, int outpatientID, int doctorID, int payTypeID) {
        this.billDate = billDate;
        this.billNum = billNum;
        this.billDesc = billDesc;
        this.outpatientID = outpatientID;
        this.doctorID = doctorID;
        this.payTypeID = payTypeID;
    }
}
