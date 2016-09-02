/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb.servlet;

import ejb.bean.ArticleFacadeLocal;
import ejb.bean.UtilisateurFacadeLocal;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
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
@WebServlet(name = "ListeArticleServlet", urlPatterns = {"/listeArticle"})
public class ListeArticleServlet extends HttpServlet {
    
    @EJB
    private ArticleFacadeLocal afl;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
//        ArticleService aserv = new ArticleService();
       //List<Article> articleEnStock = aserv.listerArticle();
    
        
        //req.setAttribute("article", articleEnStock);
        
        
        afl.findAll();
        
        req.getRequestDispatcher("listeArticle.jsp").forward(req, resp);
        
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        Article a = new ArticleService().rechercherParId(Long.parseLong(req.getParameter("id")));
        a.setStock(Integer.parseInt(req.getParameter("stock")));
        
        ArticleService aserv = new ArticleService();
        aserv.modifierStockArticle(a);
        resp.sendRedirect("listeArticle");
        
    }
    
}
