package main.java.vn.edu.hust.controller;

import main.java.vn.edu.hust.data.database.dao.product.ProductDAOImpl;
import main.java.vn.edu.hust.data.database.dao.product.ProductDao;
import main.java.vn.edu.hust.data.model.Product;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

@WebServlet(name = "ControllerServlet", loadOnStartup = 1, urlPatterns = {"/products"})
public class ControllerServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ProductDao productDao = new ProductDAOImpl();
        List<Product> products = productDao.getProducts(1);
        System.out.println(products.stream().map(Product::getName).collect(Collectors.toList()));
        req.setAttribute("newProducts", products);
        req.getRequestDispatcher("products.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
