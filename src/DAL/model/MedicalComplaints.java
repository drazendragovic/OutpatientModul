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
public class MedicalComplaints {

    private int iDMedCompl;
    private String diabetic;
    private String hypertensive;
    private String cardiacCond;
    private String respCond;
    private String digCon;
    private String orthCon;
    private String muscCon;
    private String neurCon;
    private String allergies;
    private String reactSpecDrug;
    private String surgeries;
    private int outpatID;

    public int getiDWorkingTime() {
        return iDMedCompl;
    }

    public String getDiabetic() {
        return diabetic;
    }

    public void setDiabetic(String diabetic) {
        this.diabetic = diabetic;
    }

    public String getHypertensive() {
        return hypertensive;
    }

    public void setHypertensive(String hypertensive) {
        this.hypertensive = hypertensive;
    }

    public String getCardiacCond() {
        return cardiacCond;
    }

    public void setCardiacCond(String cardiacCond) {
        this.cardiacCond = cardiacCond;
    }

    public String getRespCond() {
        return respCond;
    }

    public void setRespCond(String respCond) {
        this.respCond = respCond;
    }

    public String getDigCon() {
        return digCon;
    }

    public void setDigCon(String digCon) {
        this.digCon = digCon;
    }

    public String getOrthCon() {
        return orthCon;
    }

    public void setOrthCon(String orthCon) {
        this.orthCon = orthCon;
    }

    public String getMuscCon() {
        return muscCon;
    }

    public void setMuscCon(String muscCon) {
        this.muscCon = muscCon;
    }

    public String getNeurCon() {
        return neurCon;
    }

    public void setNeurCon(String neurCon) {
        this.neurCon = neurCon;
    }

    public String getAllergies() {
        return allergies;
    }

    public void setAllergies(String allergies) {
        this.allergies = allergies;
    }

    public String getReactSpecDrug() {
        return reactSpecDrug;
    }

    public void setReactSpecDrug(String reactSpecDrug) {
        this.reactSpecDrug = reactSpecDrug;
    }

    public String getSurgeries() {
        return surgeries;
    }

    public void setSurgeries(String surgeries) {
        this.surgeries = surgeries;
    }

    public int getOutpatID() {
        return outpatID;
    }

    public void setOutpatID(int outpatID) {
        this.outpatID = outpatID;
    }

    public MedicalComplaints() {
        
    }

    public MedicalComplaints(int outpatID) {
        this.outpatID = outpatID;
    }

    public MedicalComplaints(int iDMedCompl, String diabetic, String hypertensive, String cardiacCond, String respCond, String digCon, String orthCon, String muscCon, String neurCon, String allergies, String reactSpecDrug, String surgeries, int outpatID) {
        this.iDMedCompl = iDMedCompl;
        this.diabetic = diabetic;
        this.hypertensive = hypertensive;
        this.cardiacCond = cardiacCond;
        this.respCond = respCond;
        this.digCon = digCon;
        this.orthCon = orthCon;
        this.muscCon = muscCon;
        this.neurCon = neurCon;
        this.allergies = allergies;
        this.reactSpecDrug = reactSpecDrug;
        this.surgeries = surgeries;
        this.outpatID = outpatID;
    }

    
}
