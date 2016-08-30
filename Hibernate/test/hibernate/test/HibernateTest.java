
package hibernate.test;

import hibernate.entity.Client;
import hibernate.util.NewHibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author admin
 */
public class HibernateTest {
    
    @Test
    public void test1() {
        
        
        
        Session s = NewHibernateUtil.getSessionFactory().openSession();
        
        s.getTransaction().begin();
        
        //s.persist(new Client()); //persist un nouveau client
        
        // enregistre nouveau ou modifie si existe deja   
        Client c = new Client();
        c.setId(4L);
        c.setPrenom("Bibi");
        c.setNom("Baba");
               
        s.saveOrUpdate(c);
        
        // supprime un client 
        //Client c1 = (Client) s.get(Client.class, 2L);
        //s.delete(c1);
        
        // liste 
        Query query = s.createQuery("SELECT c FROM Client c ORDER BY c.nom");
        System.out.println("***************" + query.list());
        
        s.getTransaction().commit();

    }
}
