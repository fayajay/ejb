/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsf.managedBean;

import entity.Pays;
import java.util.List;
import javax.faces.bean.ManagedBean;
import service.PaysService;

/**
 *
 * @author admin
 */
@ManagedBean
public class PaysManagedBean {
    
    private Pays pays = new Pays();
    
    public List<Pays> getListPays(){
        return new PaysService().lister();
    }
    
    public String ajouterPays(){
        new PaysService().ajouterPays(pays);
        
        return "liste_pays.xhtml";
    }

    
    
    
    

    public Pays getPays() {
        return pays;
    }

    public void setPays(Pays pays) {
        this.pays = pays;
    }
    
    
}
