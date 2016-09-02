/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb.dao;

import ejb.entity.Utilisateur;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author admin
 */
@Stateless
public class UtilisateurDAOEjb implements UtilisateurDAOEjbLocal {

    
    @Override
    public Utilisateur connexion(String login, String mdp) {

        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();

        Query query = em.createQuery("SELECT u FROM Utilisateur u WHERE u.login=:monLogin AND u.mdp=:monMdp");

        query.setParameter("monLogin", login);
        query.setParameter("monMdp", mdp);

        return (Utilisateur) query.getSingleResult();

    }
    
}
