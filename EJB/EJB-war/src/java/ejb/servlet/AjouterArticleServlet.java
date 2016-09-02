/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb.servlet;

import ejb.bean.ArticleFacadeLocal;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import ejb.entity.Article;
import ejb.service.ArticleService;
import javax.ejb.EJB;

/**
 *
 * @author admin
 */
@WebServlet(name = "AjouterArticleServlet", urlPatterns = {"/ajouterArticle"})
public class AjouterArticleServlet extends HttpServlet {
    
    @EJB
    private ArticleFacadeLocal afl;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        req.getRequestDispatcher("ajouterArticle.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        Article a = new Article();
        a.setNom(req.getParameter("nom"));
        a.setPrix(Long.parseLong(req.getParameter("prix")));
        a.setStock(Integer.parseInt(req.getParameter("stock")));
        
        afl.create(a);
        
//        ArticleService aserv = new ArticleService();
//        aserv.enregistrerNewArticle(a);
        
        resp.sendRedirect("listeArticle");
    }



}
