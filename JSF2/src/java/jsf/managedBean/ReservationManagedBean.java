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
public class ReservationManagedBean {
    
    public  String[] tabPays = {"FRANCE", "USA", "ITALIE", "GROLAND", "JAMAIQUE", "AUSTRALIE"};
    
    private String paysDepart;
    private String[] paysArrivee;
    private String nom;
    private String prenom;
    private Short age;
    private Boolean premiereClasse;
    
    
    
    public String reservation(){
        return "login_ok.xhtml";
    }

    public String[] getTabPays() {
        return tabPays;
    }

    public void setTabPays(String[] tabPays) {
        this.tabPays = tabPays;
    }

    public String getPaysDepart() {
        return paysDepart;
    }

    public void setPaysDepart(String paysDepart) {
        this.paysDepart = paysDepart;
    }

    public String[] getPaysArrivee() {
        return paysArrivee;
    }

    public void setPaysArrivee(String[] paysArrivee) {
        this.paysArrivee = paysArrivee;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Short getAge() {
        return age;
    }

    public void setAge(Short age) {
        this.age = age;
    }

    public Boolean getPremiereClasse() {
        return premiereClasse;
    }

    public void setPremiereClasse(Boolean premiereClasse) {
        this.premiereClasse = premiereClasse;
    }
    
    
}
