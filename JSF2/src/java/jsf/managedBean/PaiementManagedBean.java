/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsf.managedBean;

import javax.faces.bean.ManagedBean;

/**
 *
 * @author admin
 */
@ManagedBean
public class PaiementManagedBean {
    
    
    private String nom;
    private String numCarte;
    private String crypto;
    private String dateValidite;
    private Double somme;
    
    
    public String paiement(){
        
        return "/login_ok.xhtml";
    }

    
    
    
    
    
    
    
    
    
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNumCarte() {
        return numCarte;
    }

    public void setNumCarte(String numCarte) {
        this.numCarte = numCarte;
    }

    public String getCrypto() {
        return crypto;
    }

    public void setCrypto(String crypto) {
        this.crypto = crypto;
    }

    

    public String getDateValidite() {
        return dateValidite;
    }

    public void setDateValidite(String dateValidite) {
        this.dateValidite = dateValidite;
    }

    public Double getSomme() {
        return somme;
    }

    public void setSomme(Double somme) {
        this.somme = somme;
    }
    
    
    
    
}
