/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL.model;

/**
 *
 * @author Drazen Dragovic
 */
public class Prescription {

    private int iDPresc;
    private int quantity;
    private int duration;
    private String usage;
    private String perDescr;
    private int medID;
    private int appItemID;

    public int getiDPresc() {
        return iDPresc;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getUsage() {
        return usage;
    }

    public void setUsage(String usage) {
        this.usage = usage;
    }

    public String getPerDescr() {
        return perDescr;
    }

    public void setPerDescr(String perDescr) {
        this.perDescr = perDescr;
    }

    public int getMedID() {
        return medID;
    }

    public void setMedID(int medID) {
        this.medID = medID;
    }

    public int getAppItemID() {
        return appItemID;
    }

    public void setAppItemID(int appItemID) {
        this.appItemID = appItemID;
    }

    public Prescription(int quantity, int duration, String usage, String perDescr, int medID, int appItemID) {
        this.quantity = quantity;
        this.duration = duration;
        this.usage = usage;
        this.perDescr = perDescr;
        this.medID = medID;
        this.appItemID = appItemID;
    }
}
