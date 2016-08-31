/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import dao.PaysDAO;
import entity.Pays;
import java.util.List;

/**
 *
 * @author admin
 */
public class PaysService {
    
    public List<Pays> lister() {
        return new PaysDAO().lister();
    }
    
    public void ajouterPays(Pays p) {
        new PaysDAO().ajouterPays(p);
    }
    
}
