/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb.service;


import ejb.dao.UtilisateurDAOEjbLocal;
import ejb.entity.Utilisateur;
import javax.ejb.EJB;

import javax.ejb.Local;

/**
 *
 * @author admin
 */
@Local
public interface UtilisateurServiceEjbLocal {
    
   
    
    public Utilisateur connexion(String login, String mdp);
    
    
    
}
