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
public class PersonAddress {

    private int idAddress;
    private String doorNo;
    private String street;
    private int cityID;
    private int areaID;
    private int AddrTypeID;
    private int PersonID;

    public int getIdAddress() {
        return idAddress;
    }

    public String getDoorNo() {
        return doorNo;
    }

    public void setDoorNo(String doorNo) {
        this.doorNo = doorNo;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getCityID() {
        return cityID;
    }

    public void setCityID(int cityID) {
        this.cityID = cityID;
    }

    public int getAddrTypeID() {
        return AddrTypeID;
    }

    public void setAddrTypeID(int AddrTypeID) {
        this.AddrTypeID = AddrTypeID;
    }

    public int getPersonID() {
        return PersonID;
    }

    public void setPersonID(int PersonID) {
        this.PersonID = PersonID;
    }

    public int getAreaID() {
        return areaID;
    }

    public void setAreaID(int areaID) {
        this.areaID = areaID;
    }

    public PersonAddress(int idAddr, String doorNo, String street, int cityID, int areaID, int AddrTypeID, int PersonID) {
        this.idAddress = idAddr;
        this.doorNo = doorNo;
        this.street = street;
        this.cityID = cityID;
        this.areaID = areaID;
        this.AddrTypeID = AddrTypeID;
        this.PersonID = PersonID;
    }

    @Override
    public String toString() {
        return String.format(this.street + " " + this.doorNo);
    }
    

    

}
