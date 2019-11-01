/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BL;

import DAL.model.MedicalPerson;
import DAL.model.MedicalPersonType;
import DAL.model.WorkingTime;
import java.util.List;

/**
 *
 * @author Drazen Dragovic
 */
public class MedicPersonView extends ViewBase {

    public List<MedicalPerson> getMedPersons() {
        return repository.getMedPersons();
    }

    public List<MedicalPersonType> getMedPersonType() {
        return repository.getMedPersonType();
    }
    
    public WorkingTime getMedPerWorkTime(int id) {
        return repository.getMedPerWorkTime(id);
    }
    
}
