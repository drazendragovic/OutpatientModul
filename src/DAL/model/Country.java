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
public class Country {
    
    private int iDCountry;
    private String name;

    public int getiDCountry() {
        return iDCountry;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Country(int idCountry, String name) {
        this.iDCountry = idCountry;
        this.name = name;
    }

    
    
}
