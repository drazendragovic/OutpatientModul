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
public class BillItem {

    private int iDBillItem;
    private double price;
    private int billID;
    private int appItemID;

    public int getiDBillItem() {
        return iDBillItem;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getBillID() {
        return billID;
    }

    public void setBillID(int billID) {
        this.billID = billID;
    }

    public int getAppItemID() {
        return appItemID;
    }

    public void setAppItemID(int appItemID) {
        this.appItemID = appItemID;
    }

    public BillItem(double price, int billID, int appItemID) {
        this.price = price;
        this.billID = billID;
        this.appItemID = appItemID;
    }

}
