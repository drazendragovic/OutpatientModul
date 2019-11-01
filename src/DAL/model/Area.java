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
public class Area {
    private int iDArea;
    private String name;

    public int getiDArea() {
        return iDArea;
    }

    public void setiDArea(int iDArea) {
        this.iDArea = iDArea;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Area(int iDArea, String name) {
        this.iDArea = iDArea;
        this.name = name;
    }
    
    
}
