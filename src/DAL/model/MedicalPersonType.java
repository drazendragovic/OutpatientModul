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
public class MedicalPersonType {

    private int iDOMedPerType;
    private String name;
    private String Descr;

    public int getiDOMedPerType() {
        return iDOMedPerType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescr() {
        return Descr;
    }

    public void setDescr(String Descr) {
        this.Descr = Descr;
    }

    public MedicalPersonType(int iDType, String name) {
        this.iDOMedPerType = iDType;
        this.name = name;
    }

}
