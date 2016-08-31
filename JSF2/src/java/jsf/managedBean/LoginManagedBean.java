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
public class LoginManagedBean {
    
    private String login;
    private String mdp;
    
    
    public String identification() {
        System.out.println("*********************************" + login + "" + mdp);
        
        if(login.equals("Jay") && mdp.equals("jay"))
            return "reservation.xhtml";
        
        
        return "login.xhtml";
        
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }
    
    
}
