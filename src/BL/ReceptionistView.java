/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BL;

import DAL.model.Contact;
import DAL.model.NextOfKin;
import DAL.model.Outpatient;
import DAL.model.Person;
import DAL.model.PersonAddress;

/**
 *
 * @author Drazen Dragovic
 */
public class ReceptionistView extends ViewBase {
    
        public int insertPerson(Person person) {
        return repository.insertPerson(person);
        }
        
        public int insertOutpatient(Outpatient patient) {
        return repository.insertOutpatient(patient);
        }
        
        public void insertNextOfKin(NextOfKin nok) {
            repository.insertNextOfKin(nok);
        }
        
        public void insertContact(Contact contact) {
            repository.insertContact(contact);
        }
        
        public void insertAddress(PersonAddress address) {
            repository.insertAddress(address);
        }
    
}
