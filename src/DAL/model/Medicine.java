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
public class Medicine {

    private int iDMed;
    private String medName;
    private String medUnit;
    private double medPrice;
    private String medDescr;
    private int medCatID;

    public int getiDMed() {
        return iDMed;
    }

    public String getMedName() {
        return medName;
    }

    public void setMedName(String medName) {
        this.medName = medName;
    }

    public String getMedUnit() {
        return medUnit;
    }

    public void setMedUnit(String medUnit) {
        this.medUnit = medUnit;
    }

    public double getMedPrice() {
        return medPrice;
    }

    public void setMedPrice(double medPrice) {
        this.medPrice = medPrice;
    }

    public String getMedDescr() {
        return medDescr;
    }

    public void setMedDescr(String medDescr) {
        this.medDescr = medDescr;
    }

    public int getMedCatID() {
        return medCatID;
    }

    public void setMedCatID(int medCatID) {
        this.medCatID = medCatID;
    }

    public Medicine(String medName, String medUnit, double medPrice, String medDescr, int medCatID) {
        this.medName = medName;
        this.medUnit = medUnit;
        this.medPrice = medPrice;
        this.medDescr = medDescr;
        this.medCatID = medCatID;
    }
}
