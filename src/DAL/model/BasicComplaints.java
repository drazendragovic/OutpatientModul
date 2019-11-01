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
public class BasicComplaints {

    private int iDBasCompl;
    private String stateCompl;
    private String histPrevTreat;
    private String hospTreat;
    private int outpatID;

    public int getiDBasCompl() {
        return iDBasCompl;
    }

    public String getStateCompl() {
        return stateCompl;
    }

    public void setStateCompl(String stateCompl) {
        this.stateCompl = stateCompl;
    }

    public String getHistPrevTreat() {
        return histPrevTreat;
    }

    public void setHistPrevTreat(String histPrevTreat) {
        this.histPrevTreat = histPrevTreat;
    }

    public String getHospTreat() {
        return hospTreat;
    }

    public void setHospTreat(String hospTreat) {
        this.hospTreat = hospTreat;
    }

    public int getOutpatID() {
        return outpatID;
    }

    public void setOutpatID(int outpatID) {
        this.outpatID = outpatID;
    }

    public BasicComplaints(String stateCompl, String histPrevTreat, String hospTreat, int outpatID) {
        this.stateCompl = stateCompl;
        this.histPrevTreat = histPrevTreat;
        this.hospTreat = hospTreat;
        this.outpatID = outpatID;
    }
    
    

}
