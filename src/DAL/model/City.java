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
public class City {
    
    private int iDCity;
    private String name;
    private String pincode;
    private int countryID;

    public int getiDCity() {
        return iDCity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }
    
    public int getCountryID() {
        return countryID;
    }

    public void setCountryID(int countryID) {
        this.countryID = countryID;
    }

    public City(int iDCity, String name, String pincode, int countryID) {
        this.iDCity = iDCity;
        this.name = name;
        this.pincode = pincode;
        this.countryID = countryID;
    }

}
