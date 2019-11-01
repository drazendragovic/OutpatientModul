/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BL;

import DAL.model.Appointment;
import DAL.model.AppointmentItem;
import DAL.model.AppointmentItemType;
import DAL.model.AppointmentStatus;
import DAL.model.BasicComplaints;
import DAL.model.Lifestyle;
import DAL.model.MedicalComplaints;
import DAL.model.NextOfKin;
import DAL.model.Outpatient;
import java.util.List;

/**
 *
 * @author Drazen Dragovic
 */
public class PatientView extends ViewBase {

    public List<Outpatient> getPatients() {
        return repository.getPatients();
    }

    public Outpatient getPatientById(int id) {
        return repository.getPatientById(id);
    }

    public NextOfKin getNextOfKinById(int id) {
        return repository.getNextOfKinById(id);
    }

    public BasicComplaints getBasComplById(int id) {
        return repository.getBasComplById(id);
    }

    public MedicalComplaints getMedComplById(int id) {
        return repository.getMedComplById(id);
    }

    public Lifestyle getLifestlById(int id) {
        return repository.getLifestlById(id);
    }

    public List<Appointment> getAppointments() {
        return repository.getAppointments();
    }

    public Appointment getAppointmentById(int id) {
        return repository.getAppointmentById(id);
    }

    public List<AppointmentItem> getAppointmentItems() {
        return repository.getAppointmentItems();
    }

    public List<AppointmentItem> getAppointmentItemsById(int id) {
        return repository.getAppointmentItemsById(id);
    }

    public AppointmentItem getAppointmentItemById(int id) {
        return repository.getAppointmentItemById(id);
    }

    public List<AppointmentStatus> getAppointmentStatus() {
        return repository.getAppointmentStatus();
    }

    public List<AppointmentItemType> getAppointmentItemType() {
        return repository.getAppointmentItemType();
    }

    public List<Appointment> getAppointmentsForPatient(int idPat) {
        return repository.getAppointmentsForPatient(idPat);
    }
}
