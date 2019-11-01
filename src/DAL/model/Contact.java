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
public class Contact {

    private int IDContact;
    private String workTel;
    private String homeTel;
    private String mobile;
    private String pager;
    private String fax;
    private String email;
    private int PersonID;

    
    public int getIDContact() {
        return IDContact;
    }

    public String getWorkTel() {
        return workTel;
    }

    public void setWorkTel(String workTel) {
        this.workTel = workTel;
    }

    public String getHomeTel() {
        return homeTel;
    }

    public void setHomeTel(String homeTel) {
        this.homeTel = homeTel;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPager() {
        return pager;
    }

    public void setPager(String pager) {
        this.pager = pager;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPersonID() {
        return PersonID;
    }

    public void setPersonID(int PersonID) {
        this.PersonID = PersonID;
    }
    
    public Contact() {
       
    }

    public Contact(int idCont, String workTel, String homeTel, String mobile, String pager, String fax, String email, int PersonID) {
        this.IDContact = idCont;
        this.workTel = workTel;
        this.homeTel = homeTel;
        this.mobile = mobile;
        this.pager = pager;
        this.fax = fax;
        this.email = email;
        this.PersonID = PersonID;
    }
    
    public Contact(String workTel, String homeTel, String mobile, String pager, String fax, String email, int PersonID) {
        this.workTel = workTel;
        this.homeTel = homeTel;
        this.mobile = mobile;
        this.pager = pager;
        this.fax = fax;
        this.email = email;
        this.PersonID = PersonID;
    }

    public Contact(String homeTel, String workTel, int PersonID) {
        this.homeTel = homeTel;
        this.workTel = workTel;
        this.PersonID = PersonID;
    }

}
