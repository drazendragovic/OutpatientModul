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
public class AppointmentStatus {

    private int iDAppStat;
    private String appStat;

    public int getiDAppStat() {
        return iDAppStat;
    }

    public String getAppStat() {
        return appStat;
    }

    public void setAppStat(String appStat) {
        this.appStat = appStat;
    }

    public AppointmentStatus(int iDAppStat, String appStat) {
        this.iDAppStat = iDAppStat;
        this.appStat = appStat;
    }

}
