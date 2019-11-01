/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BL;

import DAL.model.AddressType;
import DAL.model.Area;
import DAL.model.City;
import DAL.model.Contact;
import DAL.model.Country;
import DAL.model.Person;
import DAL.model.PersonAddress;
import java.util.List;

/**
 *
 * @author Drazen Dragovic
 */
public class PersonView extends ViewBase {

    public Person getPersonById(int id) {
        return repository.getPersonById(id);
    }

    public Contact getPersonContact(int id) {
        return repository.getPersonContact(id);
    }

    public List<AddressType> GetAddressTypes() {
        return repository.getAddressTypes();
    }

    public List<City> GetCitys() {
        return repository.getCitys();
    }

    public List<Country> GetCountrys() {
        return repository.getCountrys();
    }

    public List<Area> GetAreas() {
        return repository.getAreas();
    }

    public PersonAddress getPersonAddress(int id) {
        return repository.getPersonAddress(id);
    }

}
