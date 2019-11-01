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
import DAL.sql.DataSourceSingleton;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;
import javax.sql.DataSource;

/**
 *
 * @author Drazen Dragovic
 */
public class SqlRepository implements IRepository {

//    private static final String INSERT_DOCTOR = "{ CALL insertDoctor (?,?,?,?) }";
//    private static final String UPDATE_DOCTOR = "{ CALL updateDoctor (?,?,?,?) }";
//    private static final String DELETE_DOCTOR = "{ CALL deleteDoctor (?) }";
    private static final String GET_DOCTOR = "{ CALL getDoctorById (?) }";
    private static final String GET_DOCTORS = "{ CALL getDoctors }";
    private static final String GET_MED_PERSONS = "{ CALL getMedPersons }";
    private static final String GET_MEDPER_TYPES = "{ CALL getMedPersonsTypes }";
    private static final String GET_MEDPER_WORKTIME = "{ CALL getMedPersonWorkTime (?) }";
    private static final String GET_PATIENT = "{ CALL getOutpatientById (?) }";
    private static final String GET_PATIENTS = "{ CALL getOutpatients }";
    private static final String GET_APPOINTMENTS = "{ CALL getAppointments }";
    private static final String GET_APPSTATUS = "{ CALL getAppointmentStatus }";
    private static final String GET_APPITEMTYPE = "{ CALL getAppointmentItemType }";
    private static final String GET_APPOINTMENT = "{ CALL getAppointmentById (?) }";
    private static final String GET_APPOINTMENTITEMS = "{ CALL getAppointmentItems }";
    private static final String GET_APPITEMSBYAPPID = "{ CALL getAppointmentItemsById (?) }";
    private static final String GET_APPITEMBYID = "{ CALL getAppointmentItemById (?) }";
    private static final String GET_NEXTOFKIN = "{ CALL getNextOfKinById (?) }";
    private static final String GET_PATBASCOMPL = "{ CALL getPatBasCompl (?) }";
    private static final String GET_PATMEDCOMPL = "{ CALL getPatMedicCompl (?) }";
    private static final String GET_PATLIFESTYLE = "{ CALL getPatLifeStyle (?) }";
    private static final String GET_PERSON = "{ CALL getPersonById (?) }";
    private static final String INSERT_PERSON = "{ CALL AddPerson (?,?,?,?,?,?,?,?,?,?) }";
    private static final String INSERT_OUTPATIENT = "{ CALL AddPatient (?,?,?,?,?,?,?,?) }";
    private static final String INSERT_NEXTOFKIN = "{ CALL AddNextOfKin (?,?,?) }";
    private static final String INSERT_CONTACT = "{ CALL AddPersonContact (?,?,?,?,?,?,?) }";
    private static final String INSERT_ADDRESS = "{ CALL AddPersonAddress (?,?,?,?,?,?) }";
    private static final String GET_PERSON_CONTACT = "{ CALL getPersonContact (?) }";
    private static final String GET_PERSON_ADDRESS = "{ CALL getPersonAddress (?) }";
    private static final String GET_ADDRESS_TYPES = "{ CALL getAddressTypes }";
    private static final String GET_CITYS = "{ CALL getCitys }";
    private static final String GET_COUNTRYS = "{ CALL getCountrys }";
    private static final String GET_AREAS = "{ CALL getAreas }";
    private static final String GET_APPOINTMENTS_FOR_DOCTOR = "{ CALL getAppointmentsForDoctor (?) }";
    private static final String GET_APPOINTMENTS_FOR_PATIENT = "{ CALL getAppointmentsForPatient (?) }";

//    private static final String GET_PATIENTS_FOR_DOCTOR = "{ CALL getPatientsForDoctor (?) }";
    @Override
    public List<Doctor> getAllDoctors() {
        List<Doctor> doctors = new ArrayList<>();
        DataSource dataSource = DataSourceSingleton.getInstance();
        try (Connection con = dataSource.getConnection();
                CallableStatement stmt = con.prepareCall(GET_DOCTORS);
                ResultSet resultSet = stmt.executeQuery()) {
            while (resultSet.next()) {
                doctors.add(
                        new Doctor(
                                resultSet.getInt("IDDoctor"),
                                resultSet.getString("FirstName"),
                                resultSet.getString("MiddleName"),
                                resultSet.getString("Surname"),
                                resultSet.getString("Degree"),
                                resultSet.getString("Spec")
                        ));
            }
            return doctors;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Doctor getDoctorById(int IdDoc) {
        DataSource dataSource = DataSourceSingleton.getInstance();
        try (Connection con = dataSource.getConnection();
                CallableStatement stmt = con.prepareCall(GET_DOCTOR)) {
            stmt.setInt(1, IdDoc);
            try (ResultSet resultSet = stmt.executeQuery()) {
                if (resultSet.next()) {
                    return new Doctor(
                            resultSet.getInt("IDDoctor"),
                            resultSet.getString("FirstName"),
                            resultSet.getString("MiddleName"),
                            resultSet.getString("Surname"),
                            resultSet.getBoolean("Sex"),
                            resultSet.getDate("DateOFBirth"),
                            resultSet.getString("MaritalStatus"),
                            resultSet.getInt("NoDependents"),
                            resultSet.getString("Occupation"),
                            resultSet.getDouble("GaIncome"),
                            resultSet.getDouble("Fees"),
                            resultSet.getString("UserName"),
                            resultSet.getString("Password"),
                            resultSet.getInt("MPTypeID"),
                            resultSet.getString("Degree"),
                            resultSet.getString("Spec"),
                            resultSet.getString("Descr"),
                            resultSet.getInt("PersonID")
                    );
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Outpatient> getPatients() {
        List<Outpatient> patients = new ArrayList<>();
        DataSource dataSource = DataSourceSingleton.getInstance();
        try (Connection con = dataSource.getConnection();
                CallableStatement stmt = con.prepareCall(GET_PATIENTS);
                ResultSet resultSet = stmt.executeQuery()) {
            while (resultSet.next()) {
                patients.add(
                        new Outpatient(
                                resultSet.getInt("iDOutpat"),
                                resultSet.getString("FirstName"),
                                resultSet.getString("MiddleName"),
                                resultSet.getString("Surname"),
                                resultSet.getDate("DateOFBirth"),
                                resultSet.getInt("oPNumber"),
                                resultSet.getDouble("oPHeight"),
                                resultSet.getDouble("opWeight"),
                                resultSet.getString("opBloodType"),
                                resultSet.getString("OpComplaint"),
                                resultSet.getInt("opTypeID"),
                                resultSet.getInt("personID")
                        ));
            }
            return patients;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Outpatient getPatientById(int IdPat) {
        DataSource dataSource = DataSourceSingleton.getInstance();
        try (Connection con = dataSource.getConnection();
                CallableStatement stmt = con.prepareCall(GET_PATIENT)) {
            stmt.setInt(1, IdPat);
            try (ResultSet resultSet = stmt.executeQuery()) {
                if (resultSet.next()) {
                    return new Outpatient(
                            resultSet.getInt("IDOutpat"),
                            resultSet.getInt("oPNumber"),
                            resultSet.getDouble("oPHeight"),
                            resultSet.getDouble("opWeight"),
                            resultSet.getString("opBloodType"),
                            resultSet.getString("OpComplaint"),
                            resultSet.getInt("opTypeID"),
                            resultSet.getInt("personID"),
                            resultSet.getString("firstName"),
                            resultSet.getString("middleName"),
                            resultSet.getString("surname"),
                            resultSet.getBoolean("sex"),
                            resultSet.getDate("DateOFBirth"),
                            resultSet.getString("maritalStatus"),
                            resultSet.getInt("noDependents"),
                            resultSet.getString("occupation"),
                            resultSet.getDouble("gaIncome")
                    );
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Person getPersonById(int IdPer) {
        DataSource dataSource = DataSourceSingleton.getInstance();
        try (Connection con = dataSource.getConnection();
                CallableStatement stmt = con.prepareCall(GET_PERSON)) {
            stmt.setInt(1, IdPer);
            try (ResultSet resultSet = stmt.executeQuery()) {
                if (resultSet.next()) {
                    return new Person(
                            resultSet.getInt("IDPerson"),
                            resultSet.getString("FirstName"),
                            resultSet.getString("MiddleName"),
                            resultSet.getString("Surname"),
                            resultSet.getBoolean("Sex"),
                            resultSet.getDate("DateOFBirth"),
                            resultSet.getString("MaritalStatus"),
                            resultSet.getInt("NoDependents"),
                            resultSet.getString("Occupation"),
                            resultSet.getDouble("GaIncome")
                    );
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<AddressType> getAddressTypes() {
        List<AddressType> addrtype = new ArrayList<>();
        DataSource dataSource = DataSourceSingleton.getInstance();
        try (Connection con = dataSource.getConnection();
                CallableStatement stmt = con.prepareCall(GET_ADDRESS_TYPES);
                ResultSet resultSet = stmt.executeQuery()) {
            while (resultSet.next()) {
                addrtype.add(
                        new AddressType(
                                resultSet.getInt("IDAddrType"),
                                resultSet.getString("AddrName"),
                                resultSet.getString("AddrDesc")
                        ));
            }
            return addrtype;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<City> getCitys() {
        List<City> citys = new ArrayList<>();
        DataSource dataSource = DataSourceSingleton.getInstance();
        try (Connection con = dataSource.getConnection();
                CallableStatement stmt = con.prepareCall(GET_CITYS);
                ResultSet resultSet = stmt.executeQuery()) {
            while (resultSet.next()) {
                citys.add(
                        new City(
                                resultSet.getInt("IDCity"),
                                resultSet.getString("Name"),
                                resultSet.getString("Pincode"),
                                resultSet.getInt("CountryID")
                        ));
            }
            return citys;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Country> getCountrys() {
        List<Country> countrys = new ArrayList<>();
        DataSource dataSource = DataSourceSingleton.getInstance();
        try (Connection con = dataSource.getConnection();
                CallableStatement stmt = con.prepareCall(GET_COUNTRYS);
                ResultSet resultSet = stmt.executeQuery()) {
            while (resultSet.next()) {
                countrys.add(
                        new Country(
                                resultSet.getInt("IDCountry"),
                                resultSet.getString("Name")
                        ));
            }
            return countrys;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Area> getAreas() {
        List<Area> areas = new ArrayList<>();
        DataSource dataSource = DataSourceSingleton.getInstance();
        try (Connection con = dataSource.getConnection();
                CallableStatement stmt = con.prepareCall(GET_AREAS);
                ResultSet resultSet = stmt.executeQuery()) {
            while (resultSet.next()) {
                areas.add(
                        new Area(
                                resultSet.getInt("IDArea"),
                                resultSet.getString("Name")
                        ));
            }
            return areas;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public PersonAddress getPersonAddress(int idPer) {
        DataSource dataSource = DataSourceSingleton.getInstance();
        try (Connection con = dataSource.getConnection();
                CallableStatement stmt = con.prepareCall(GET_PERSON_ADDRESS)) {
            stmt.setInt(1, idPer);
            try (ResultSet resultSet = stmt.executeQuery()) {
                if (resultSet.next()) {
                    return new PersonAddress(
                            resultSet.getInt("IDAddress"),
                            resultSet.getString("DoorNo"),
                            resultSet.getString("Street"),
                            resultSet.getInt("CityID"),
                            resultSet.getInt("AreaID"),
                            resultSet.getInt("AddrTypeID"),
                            resultSet.getInt("PersonID")
                    );
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Contact getPersonContact(int idPer) {
        DataSource dataSource = DataSourceSingleton.getInstance();
        try (Connection con = dataSource.getConnection();
                CallableStatement stmt = con.prepareCall(GET_PERSON_CONTACT)) {
            stmt.setInt(1, idPer);
            try (ResultSet resultSet = stmt.executeQuery()) {
                if (resultSet.next()) {
                    return new Contact(
                            resultSet.getInt("IDContact"),
                            resultSet.getString("WorkTel"),
                            resultSet.getString("HomeTel"),
                            resultSet.getString("Mobile"),
                            resultSet.getString("Pager"),
                            resultSet.getString("Fax"),
                            resultSet.getString("Email"),
                            resultSet.getInt("PersonID")
                    );
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<MedicalPerson> getMedPersons() {
        List<MedicalPerson> medPersons = new ArrayList<>();
        DataSource dataSource = DataSourceSingleton.getInstance();
        try (Connection con = dataSource.getConnection();
                CallableStatement stmt = con.prepareCall(GET_MED_PERSONS);
                ResultSet resultSet = stmt.executeQuery()) {
            while (resultSet.next()) {
                medPersons.add(
                        new MedicalPerson(
                                resultSet.getInt("IDOMedPerson"),
                                resultSet.getString("FirstName"),
                                resultSet.getString("MiddleName"),
                                resultSet.getString("Surname"),
                                resultSet.getBoolean("Sex"),
                                resultSet.getDate("DateOFBirth"),
                                resultSet.getString("MaritalStatus"),
                                resultSet.getInt("NoDependents"),
                                resultSet.getString("Occupation"),
                                resultSet.getDouble("GaIncome"),
                                resultSet.getDouble("Fees"),
                                resultSet.getString("UserName"),
                                resultSet.getString("Password"),
                                resultSet.getInt("MPTypeID"),
                                resultSet.getInt("PersonID")
                        ));
            }
            return medPersons;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<MedicalPersonType> getMedPersonType() {
        List<MedicalPersonType> medpertypes = new ArrayList<>();
        DataSource dataSource = DataSourceSingleton.getInstance();
        try (Connection con = dataSource.getConnection();
                CallableStatement stmt = con.prepareCall(GET_MEDPER_TYPES);
                ResultSet resultSet = stmt.executeQuery()) {
            while (resultSet.next()) {
                medpertypes.add(
                        new MedicalPersonType(
                                resultSet.getInt("IDOMedPerType"),
                                resultSet.getString("Name")
                        ));
            }
            return medpertypes;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public WorkingTime getMedPerWorkTime(int idMedPer) {
        DataSource dataSource = DataSourceSingleton.getInstance();
        try (Connection con = dataSource.getConnection();
                CallableStatement stmt = con.prepareCall(GET_MEDPER_WORKTIME)) {
            stmt.setInt(1, idMedPer);
            try (ResultSet resultSet = stmt.executeQuery()) {
                if (resultSet.next()) {
                    return new WorkingTime(
                            resultSet.getTimestamp("Day").toLocalDateTime(),
                            resultSet.getTimestamp("BeginTime").toLocalDateTime(),
                            resultSet.getTimestamp("EndTime").toLocalDateTime(),
                            resultSet.getInt("MedPersID")
                    );
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public NextOfKin getNextOfKinById(int idPat) {
        DataSource dataSource = DataSourceSingleton.getInstance();
        try (Connection con = dataSource.getConnection();
                CallableStatement stmt = con.prepareCall(GET_NEXTOFKIN)) {
            stmt.setInt(1, idPat);
            try (ResultSet resultSet = stmt.executeQuery()) {
                if (resultSet.next()) {
                    return new NextOfKin(
                            resultSet.getString("Relationship"),
                            resultSet.getInt("PersonID"),
                            resultSet.getInt("OutPatId"),
                            resultSet.getString("FirstName"),
                            resultSet.getString("MiddleName"),
                            resultSet.getString("Surname")
                    );
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public BasicComplaints getBasComplById(int idPat) {
        DataSource dataSource = DataSourceSingleton.getInstance();
        try (Connection con = dataSource.getConnection();
                CallableStatement stmt = con.prepareCall(GET_PATBASCOMPL)) {
            stmt.setInt(1, idPat);
            try (ResultSet resultSet = stmt.executeQuery()) {
                if (resultSet.next()) {
                    return new BasicComplaints(
                            resultSet.getString("StateCompl"),
                            resultSet.getString("HistPrevTreat"),
                            resultSet.getString("HospTreat"),
                            resultSet.getInt("OutpatientID")
                    );
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public MedicalComplaints getMedComplById(int idPat) {
        DataSource dataSource = DataSourceSingleton.getInstance();
        try (Connection con = dataSource.getConnection();
                CallableStatement stmt = con.prepareCall(GET_PATMEDCOMPL)) {
            stmt.setInt(1, idPat);
            try (ResultSet resultSet = stmt.executeQuery()) {
                if (resultSet.next()) {
                    return new MedicalComplaints(
                            resultSet.getInt("IDMedCompl"),
                            resultSet.getString("Diabetic"),
                            resultSet.getString("Hypertensive"),
                            resultSet.getString("CardiacCond"),
                            resultSet.getString("RespCond"),
                            resultSet.getString("DigCon"),
                            resultSet.getString("OrthCon"),
                            resultSet.getString("MuscCon"),
                            resultSet.getString("NeurCon"),
                            resultSet.getString("Allergies"),
                            resultSet.getString("ReactSpecDrug"),
                            resultSet.getString("Surgeries"),
                            resultSet.getInt("OutpatID")
                    );
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Lifestyle getLifestlById(int idPat) {
        DataSource dataSource = DataSourceSingleton.getInstance();
        try (Connection con = dataSource.getConnection();
                CallableStatement stmt = con.prepareCall(GET_PATLIFESTYLE)) {
            stmt.setInt(1, idPat);
            try (ResultSet resultSet = stmt.executeQuery()) {
                if (resultSet.next()) {
                    return new Lifestyle(
                            resultSet.getInt("IDLifeStyle"),
                            resultSet.getBoolean("Vegeterian"),
                            resultSet.getBoolean("Smoker"),
                            resultSet.getInt("AvNoCigarNo"),
                            resultSet.getBoolean("ConAlcBever"),
                            resultSet.getInt("AvNoDrinksNo"),
                            resultSet.getString("Stimulants"),
                            resultSet.getInt("ConCoffeTea"),
                            resultSet.getInt("ConSoftDrinks"),
                            resultSet.getString("RegularMeals"),
                            resultSet.getString("HomeFood"),
                            resultSet.getInt("PersonID")
                    );
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Appointment> getAppointments() {
        List<Appointment> appointments = new ArrayList<>();
        DataSource dataSource = DataSourceSingleton.getInstance();
        try (Connection con = dataSource.getConnection();
                CallableStatement stmt = con.prepareCall(GET_APPOINTMENTS);
                ResultSet resultSet = stmt.executeQuery()) {
            while (resultSet.next()) {
                appointments.add(
                        new Appointment(
                                resultSet.getInt("IDAppoint"),
                                resultSet.getDate("DateCreated"),
                                resultSet.getString("Title"),
                                resultSet.getString("Symptoms"),
                                resultSet.getString("Diagnose"),
                                resultSet.getDate("PreferredDate"),
                                resultSet.getDate("FollowUpDate"),
                                resultSet.getBoolean("State"),
                                resultSet.getInt("StatusID"),
                                resultSet.getInt("OutpatientID"),
                                resultSet.getInt("DoctorID"),
                                resultSet.getInt("AddressID")
                        ));
            }
            return appointments;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Appointment getAppointmentById(int idApp) {
        DataSource dataSource = DataSourceSingleton.getInstance();
        try (Connection con = dataSource.getConnection();
                CallableStatement stmt = con.prepareCall(GET_APPOINTMENT)) {
            stmt.setInt(1, idApp);
            try (ResultSet resultSet = stmt.executeQuery()) {
                if (resultSet.next()) {
                    return new Appointment(
                            resultSet.getInt("IDAppoint"),
                            resultSet.getDate("DateCreated"),
                            resultSet.getString("Title"),
                            resultSet.getString("Symptoms"),
                            resultSet.getString("Diagnose"),
                            resultSet.getDate("PreferredDate"),
                            resultSet.getDate("FollowUpDate"),
                            resultSet.getBoolean("State"),
                            resultSet.getInt("StatusID"),
                            resultSet.getInt("OutpatientID"),
                            resultSet.getInt("DoctorID"),
                            resultSet.getInt("AddressID")
                    );
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<AppointmentItem> getAppointmentItems() {
        List<AppointmentItem> appItems = new ArrayList<>();
        DataSource dataSource = DataSourceSingleton.getInstance();
        try (Connection con = dataSource.getConnection();
                CallableStatement stmt = con.prepareCall(GET_APPOINTMENTITEMS);
                ResultSet resultSet = stmt.executeQuery()) {
            while (resultSet.next()) {
                appItems.add(
                        new AppointmentItem(
                                resultSet.getInt("IDAppItem"),
                                resultSet.getDate("ItemDate"),
                                resultSet.getString("AppIteDesc"),
                                resultSet.getString("Result"),
                                resultSet.getDouble("Price"),
                                resultSet.getInt("AppItTypeID"),
                                resultSet.getInt("AppItemStatusID"),
                                resultSet.getInt("AppointmentID"),
                                resultSet.getInt("MedStaffID")
                        ));
            }
            return appItems;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<AppointmentItem> getAppointmentItemsById(int idApp) {
        List<AppointmentItem> appItems = new ArrayList<>();
        DataSource dataSource = DataSourceSingleton.getInstance();
        try (Connection con = dataSource.getConnection();
                CallableStatement stmt = con.prepareCall(GET_APPITEMSBYAPPID)) {
            stmt.setInt(1, idApp);
            try (ResultSet resultSet = stmt.executeQuery()) {
                while (resultSet.next()) {
                    appItems.add(
                            new AppointmentItem(
                                    resultSet.getInt("IDAppItem"),
                                    resultSet.getDate("ItemDate"),
                                    resultSet.getString("AppIteDesc"),
                                    resultSet.getString("Result"),
                                    resultSet.getDouble("Price"),
                                    resultSet.getInt("AppItTypeID"),
                                    resultSet.getInt("AppItemStatusID"),
                                    resultSet.getInt("AppointmentID"),
                                    resultSet.getInt("MedStaffID")
                            ));
                }
                return appItems;

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public AppointmentItem getAppointmentItemById(int idAppItemId) {
        DataSource dataSource = DataSourceSingleton.getInstance();
        try (Connection con = dataSource.getConnection();
                CallableStatement stmt = con.prepareCall(GET_APPITEMBYID)) {
            stmt.setInt(1, idAppItemId);
            try (ResultSet resultSet = stmt.executeQuery()) {
                if (resultSet.next()) {
                    return new AppointmentItem(
                            resultSet.getInt("IDAppItem"),
                            resultSet.getDate("ItemDate"),
                            resultSet.getString("AppIteDesc"),
                            resultSet.getString("Result"),
                            resultSet.getDouble("Price"),
                            resultSet.getInt("AppItTypeID"),
                            resultSet.getInt("AppItemStatusID"),
                            resultSet.getInt("AppointmentID"),
                            resultSet.getInt("MedStaffID")
                    );
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<AppointmentStatus> getAppointmentStatus() {
        List<AppointmentStatus> appStat = new ArrayList<>();
        DataSource dataSource = DataSourceSingleton.getInstance();
        try (Connection con = dataSource.getConnection();
                CallableStatement stmt = con.prepareCall(GET_APPSTATUS);
                ResultSet resultSet = stmt.executeQuery()) {
            while (resultSet.next()) {
                appStat.add(
                        new AppointmentStatus(
                                resultSet.getInt("IDAppStat"),
                                resultSet.getString("AppStat")
                        ));
            }
            return appStat;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<AppointmentItemType> getAppointmentItemType() {
        List<AppointmentItemType> appItemType = new ArrayList<>();
        DataSource dataSource = DataSourceSingleton.getInstance();
        try (Connection con = dataSource.getConnection();
                CallableStatement stmt = con.prepareCall(GET_APPITEMTYPE);
                ResultSet resultSet = stmt.executeQuery()) {
            while (resultSet.next()) {
                appItemType.add(
                        new AppointmentItemType(
                                resultSet.getInt("IDAppItType"),
                                resultSet.getString("AppIteName")
                        ));
            }
            return appItemType;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Appointment> getAppointmentsForDoctor(int idDoc) {
        List<Appointment> apps = new ArrayList<>();
        DataSource dataSource = DataSourceSingleton.getInstance();
        try (Connection con = dataSource.getConnection();
                CallableStatement stmt = con.prepareCall(GET_APPOINTMENTS_FOR_DOCTOR)) {
            stmt.setInt(1, idDoc);
            try (ResultSet resultSet = stmt.executeQuery()) {
                while (resultSet.next()) {
                    apps.add(
                            new Appointment(
                                    resultSet.getInt("IDAppoint"),
                                    resultSet.getDate("DateCreated"),
                                    resultSet.getString("Title"),
                                    resultSet.getString("Symptoms"),
                                    resultSet.getString("Diagnose"),
                                    resultSet.getDate("PreferredDate"),
                                    resultSet.getDate("FollowUpDate"),
                                    resultSet.getBoolean("State"),
                                    resultSet.getInt("StatusID"),
                                    resultSet.getInt("OutpatientID"),
                                    resultSet.getInt("DoctorID"),
                                    resultSet.getInt("AddressID")
                            ));
                }
                return apps;

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Appointment> getAppointmentsForPatient(int idPat) {
        List<Appointment> apps = new ArrayList<>();
        DataSource dataSource = DataSourceSingleton.getInstance();
        try (Connection con = dataSource.getConnection();
                CallableStatement stmt = con.prepareCall(GET_APPOINTMENTS_FOR_PATIENT)) {
            stmt.setInt(1, idPat);
            try (ResultSet resultSet = stmt.executeQuery()) {
                while (resultSet.next()) {
                    apps.add(
                            new Appointment(
                                    resultSet.getInt("IDAppoint"),
                                    resultSet.getDate("DateCreated"),
                                    resultSet.getString("Title"),
                                    resultSet.getString("Symptoms"),
                                    resultSet.getString("Diagnose"),
                                    resultSet.getDate("PreferredDate"),
                                    resultSet.getDate("FollowUpDate"),
                                    resultSet.getBoolean("State"),
                                    resultSet.getInt("StatusID"),
                                    resultSet.getInt("OutpatientID"),
                                    resultSet.getInt("DoctorID"),
                                    resultSet.getInt("AddressID")
                            ));
                }
                return apps;

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public int insertPerson(Person person) {
        DataSource dataSource = DataSourceSingleton.getInstance();
        try(Connection con = dataSource.getConnection();
                CallableStatement stmt = con.prepareCall(INSERT_PERSON)) {
            stmt.setString(1, person.getFirstName());
            stmt.setString(2, person.getMiddleName());
            stmt.setString(3, person.getSurname());
            stmt.setBoolean(4, person.getSex());
            stmt.setDate(5, person.getDateOFBirth());
            stmt.setString(6, person.getMaritalStatus());
            stmt.setInt(7, person.getNoDependents());
            stmt.setString(8, person.getOccupation());
            stmt.setDouble(9, person.getGaIncome());
            stmt.registerOutParameter(10, Types.INTEGER);
            stmt.executeUpdate();
            
            return stmt.getInt(10);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }

    @Override
    public int insertOutpatient(Outpatient patient) {
        DataSource dataSource = DataSourceSingleton.getInstance();
        try(Connection con = dataSource.getConnection();
                CallableStatement stmt = con.prepareCall(INSERT_OUTPATIENT)) {
            stmt.setInt(1, patient.getoPNumber());
            stmt.setDouble(2, patient.getoPHeight());
            stmt.setDouble(3, patient.getOpWeight());
            stmt.setString(4, patient.getOpBloodType());
            stmt.setString(5, patient.getBreafComplaint());
            stmt.setInt(6, patient.getOpTypeID());
            stmt.setInt(7, patient.getPersonID());
            stmt.registerOutParameter(8, Types.INTEGER);
            stmt.executeUpdate();
            
            return stmt.getInt(8);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }

    @Override
    public void insertNextOfKin(NextOfKin nok) {
        DataSource dataSource = DataSourceSingleton.getInstance();
        try(Connection con = dataSource.getConnection();
                CallableStatement stmt = con.prepareCall(INSERT_NEXTOFKIN)) {
            stmt.setString(1, nok.getRelationship());
            stmt.setInt(2, nok.getPersonID());
            stmt.setInt(3, nok.getOutPatId());
            stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void insertContact(Contact contact) {
        DataSource dataSource = DataSourceSingleton.getInstance();
        try(Connection con = dataSource.getConnection();
                CallableStatement stmt = con.prepareCall(INSERT_CONTACT)) {
            stmt.setString(1, contact.getWorkTel());
            stmt.setString(2, contact.getHomeTel());
            stmt.setString(3, contact.getMobile());
            stmt.setString(4, contact.getPager());
            stmt.setString(5, contact.getFax());
            stmt.setString(6, contact.getEmail());
            stmt.setInt(7, contact.getPersonID());
            stmt.executeUpdate();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void insertAddress(PersonAddress address) {
        DataSource dataSource = DataSourceSingleton.getInstance();
        try(Connection con = dataSource.getConnection();
                CallableStatement stmt = con.prepareCall(INSERT_ADDRESS)) {
            stmt.setString(1, address.getDoorNo());
            stmt.setString(2, address.getStreet());
            stmt.setInt(3, address.getCityID());
            stmt.setInt(4, address.getAreaID());
            stmt.setInt(5, address.getAddrTypeID());
            stmt.setInt(6, address.getPersonID());
            stmt.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
