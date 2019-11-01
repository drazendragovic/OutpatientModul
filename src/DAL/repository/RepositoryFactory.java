/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL.repository;

/**
 *
 * @author Drazen Dragovic
 */
public final class RepositoryFactory {
    
    public static IRepository getIRepository(int repo) {
        
        switch (repo) {
            case 1:
                return new SqlRepository();
            case 2:
                return new MemoryRepo();
            default:
                return new SqlRepository();
        }
    }
}
