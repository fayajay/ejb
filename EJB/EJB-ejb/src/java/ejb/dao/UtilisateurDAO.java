
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;
import ejb.entity.Utilisateur;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author admin
 */

public class UtilisateurDAO {
    
    

    public Utilisateur connexion(String login, String mdp) {

        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();

        Query query = em.createQuery("SELECT u FROM Utilisateur u WHERE u.login=:monLogin AND u.mdp=:monMdp");

        query.setParameter("monLogin", login);
        query.setParameter("monMdp", mdp);

        return (Utilisateur) query.getSingleResult();

    }
    
    public List<Utilisateur> rechercherParLogin(String login) {
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();

        return em.createQuery("SELECT u FROM Utilisateur u WHERE u.login=:login").setParameter("login", login).getResultList();
    }

    
    
    public void ajouterUtilisateur(Utilisateur u) {
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();

        em.getTransaction().begin();
        em.persist(u);
        em.getTransaction().commit();
    }

}
