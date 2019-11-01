/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL.repository;

import DAL.model.AddressType;
import DAL.model.Appointment;
import DAL.model.AppointmentItem;
import DAL.model.AppointmentItemType;
import DAL.model.AppointmentStatus;
import DAL.model.Area;
import DAL.model.BasicComplaints;
import DAL.model.City;
import DAL.model.Contact;
import DAL.model.Country;
import DAL.model.Doctor;
import DAL.model.Lifestyle;
import DAL.model.MedicalComplaints;
import DAL.model.MedicalPerson;
import DAL.model.MedicalPersonType;
import DAL.model.NextOfKin;
import DAL.model.Outpatient;
import DAL.model.Person;
import DAL.model.PersonAddress;
import DAL.model.WorkingTime;
import java.util.List;

/**
 *
 * @author Drazen Dragovic
 */
public interface IRepository {

    public List<Doctor> getAllDoctors();

    public Doctor getDoctorById(int id);

    public List<Outpatient> getPatients();

    public Outpatient getPatientById(int id);

    public Person getPersonById(int id);
    
    public int insertPerson(Person person);
    
    public int insertOutpatient(Outpatient patient);
    
    public void insertNextOfKin(NextOfKin nok);
    
    public void insertContact(Contact contact);
    
    public void insertAddress(PersonAddress address);

    public List<AddressType> getAddressTypes();

    public List<City> getCitys();

    public List<Country> getCountrys();

    public List<Area> getAreas();

    public PersonAddress getPersonAddress(int id);

    public Contact getPersonContact(int id);

    public List<MedicalPerson> getMedPersons();

    public List<MedicalPersonType> getMedPersonType();

    public WorkingTime getMedPerWorkTime(int id);

    public NextOfKin getNextOfKinById(int id);

    public BasicComplaints getBasComplById(int id);

    public MedicalComplaints getMedComplById(int id);

    public Lifestyle getLifestlById(int id);

    public List<Appointment> getAppointments();

    public Appointment getAppointmentById(int id);

    public List<AppointmentItem> getAppointmentItems();

    public List<AppointmentItem> getAppointmentItemsById(int id);

    public AppointmentItem getAppointmentItemById(int id);

    public List<AppointmentStatus> getAppointmentStatus();

    public List<AppointmentItemType> getAppointmentItemType();

    public List<Appointment> getAppointmentsForDoctor(int id);

    public List<Appointment> getAppointmentsForPatient(int idPat);

}
