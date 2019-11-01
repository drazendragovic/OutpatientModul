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
public class PayType {

    private int iDPayType;
    private String payTypeName;
    private String payDescr;

    public int getiDPayType() {
        return iDPayType;
    }

    public String getPayTypeName() {
        return payTypeName;
    }

    public void setPayTypeName(String payTypeName) {
        this.payTypeName = payTypeName;
    }

    public String getPayDescr() {
        return payDescr;
    }

    public void setPayDescr(String payDescr) {
        this.payDescr = payDescr;
    }

    public PayType(String payTypeName) {
        this.payTypeName = payTypeName;
    }
}
