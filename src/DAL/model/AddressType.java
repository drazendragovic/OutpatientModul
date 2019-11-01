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
public class AddressType {
    
    private int iDAddrType;
    private String addrName;
    private String addrDesc;

    public int getiDAddrType() {
        return iDAddrType;
    }

    public String getAddrName() {
        return addrName;
    }

    public void setAddrName(String addrName) {
        this.addrName = addrName;
    }

    public String getAddrDesc() {
        return addrDesc;
    }

    public void setAddrDesc(String addrDesc) {
        this.addrDesc = addrDesc;
    }

    public AddressType(String addrName) {
        this.addrName = addrName;
    }
    
    public AddressType(int IdType, String addrName, String addrDesc) {
        this.iDAddrType = IdType;
        this.addrName = addrName;
        this.addrDesc = addrDesc;
    }

    
    
}
