/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BL;

import DAL.repository.IRepository;
import DAL.repository.RepositoryFactory;

/**
 *
 * @author Drazen Dragovic
 */
public class ViewBase {
    
    final IRepository repository;
    private int repoId;
    
    public ViewBase() {
        repository = RepositoryFactory.getIRepository(repoId);
    }

    public void setRepoId(int repoId) {
        this.repoId = repoId;
    }
    
    
}
