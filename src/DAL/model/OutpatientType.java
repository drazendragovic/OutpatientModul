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
public class OutpatientType {

    private int iDOpType;
    private String opTypName;
    private int oPTypDescr;

    public int getiDOpType() {
        return iDOpType;
    }

    public String getOpTypName() {
        return opTypName;
    }

    public void setOpTypName(String opTypName) {
        this.opTypName = opTypName;
    }

    public int getoPTypDescr() {
        return oPTypDescr;
    }

    public void setoPTypDescr(int oPTypDescr) {
        this.oPTypDescr = oPTypDescr;
    }

    public OutpatientType(String opTypName) {
        this.opTypName = opTypName;
    }

}
