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
public class MedCat {

    private int iDMedCat;
    private String medCatName;
    private String medCatDescr;

    public int getiDMedCat() {
        return iDMedCat;
    }

    public String getMedCatName() {
        return medCatName;
    }

    public void setMedCatName(String medCatName) {
        this.medCatName = medCatName;
    }

    public String getMedCatDescr() {
        return medCatDescr;
    }

    public void setMedCatDescr(String medCatDescr) {
        this.medCatDescr = medCatDescr;
    }

    public MedCat(String medCatName) {
        this.medCatName = medCatName;
    }
}
