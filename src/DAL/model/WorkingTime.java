/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL.model;

import java.time.LocalDateTime;

/**
 *
 * @author Drazen Dragovic
 */
public class WorkingTime {
    
    private int iDWorkingTime;
    private LocalDateTime day;
    private LocalDateTime beginTime;
    private LocalDateTime endTime;
    private int medPersID;

    public int getiDWorkingTime() {
        return iDWorkingTime;
    }

    public LocalDateTime getDay() {
        return day;
    }

    public void setDay(LocalDateTime day) {
        this.day = day;
    }

    public LocalDateTime getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(LocalDateTime beginTime) {
        this.beginTime = beginTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public int getMedPersID() {
        return medPersID;
    }

    public void setMedPersID(int medPersID) {
        this.medPersID = medPersID;
    }

    public WorkingTime(LocalDateTime day, LocalDateTime beginTime, LocalDateTime endTime, int medPersID) {
        this.day = day;
        this.beginTime = beginTime;
        this.endTime = endTime;
        this.medPersID = medPersID;
    }
}
