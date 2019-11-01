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
public class NextOfKin extends Person {

    private int iDNextOfKin;
    private String relationship;
    private int personID;
    private int OutPatId;


    public int getiDNextOfKin() {
        return iDNextOfKin;
    }

    public String getRelationship() {
        return relationship;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }

    public int getPersonID() {
        return personID;
    }

    public void setPersonID(int personID) {
        this.personID = personID;
    }

    public int getOutPatId() {
        return OutPatId;
    }

    public void setOutPatId(int OutPatId) {
        this.OutPatId = OutPatId;
    }
    
    public NextOfKin() {

    }
    
    public NextOfKin(String relationship, int personID, int outpatId) {
        this.OutPatId = outpatId;
        this.relationship = relationship;
        this.personID = personID;
    }
    
    public NextOfKin(String relationship, int personID, int outpatId, String firstName, String middleName, String surname) {
        super(firstName, middleName, surname);
        this.OutPatId = outpatId;
        this.relationship = relationship;
        this.personID = personID;
    }

}
