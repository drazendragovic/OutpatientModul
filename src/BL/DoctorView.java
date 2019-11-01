/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BL;

import DAL.model.Appointment;
import DAL.model.Doctor;
import java.util.List;

/**
 *
 * @author Drazen Dragovic
 */
public class DoctorView extends ViewBase {

    public List<Doctor> getAllDoctors() {
        return repository.getAllDoctors();
    }

    public Doctor getDoctorById(int id) {
        return repository.getDoctorById(id);
    }

    public List<Appointment> getAppointmentsForDoctor(int id) {
        return repository.getAppointmentsForDoctor(id);
    }

}
