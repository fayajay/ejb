/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb.servlet;

import ejb.bean.UtilisateurFacadeLocal;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import ejb.entity.Utilisateur;
import ejb.service.UtilisateurService;
import ejb.service.UtilisateurServiceEjbLocal;
import javax.ejb.EJB;

/**
 *
 * @author admin
 */
@WebServlet(name = "ConnexionServlet", urlPatterns = {"/connexion"})
public class ConnexionServlet extends HttpServlet {

    @EJB
    private UtilisateurServiceEjbLocal usel;
    
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        req.getRequestDispatcher("connexion.jsp").forward(req, resp);
    }
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        String login = req.getParameter("login");
        String mdp = req.getParameter("mdp");
        
        //Utilisateur u = new UtilisateurService().connexion(login, mdp);
        
        usel.connexion(login, mdp);
        
        // je suis logué correctement
        //req.getSession().setAttribute("utilConnecte", usel);
        
        
        resp.sendRedirect("ajouterArticle");
 
    }

}
