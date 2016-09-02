/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb.dao;

import ejb.entity.Utilisateur;
import javax.ejb.Local;

/**
 *
 * @author admin
 */
@Local
public interface UtilisateurDAOEjbLocal {
    
    public Utilisateur connexion(String login, String mdp);
    
}
