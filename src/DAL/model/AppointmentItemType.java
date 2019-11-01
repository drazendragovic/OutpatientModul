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
public class AppointmentItemType {

    private int iDAppItType;
    private String appIteName;
    private String appIteDesc;

    public int getiDAppItType() {
        return iDAppItType;
    }

    public String getAppIteName() {
        return appIteName;
    }

    public void setAppIteName(String appIteName) {
        this.appIteName = appIteName;
    }

    public String getAppIteDesc() {
        return appIteDesc;
    }

    public void setAppIteDesc(String appIteDesc) {
        this.appIteDesc = appIteDesc;
    }

    public AppointmentItemType(int idAppType, String appIteName) {
        this.iDAppItType = idAppType;
        this.appIteName = appIteName;
    }
}
