package main.java.vn.edu.hust.data.database.dao.product;

import main.java.vn.edu.hust.data.model.Product;

import java.util.List;

public interface ProductDao {

    List<Product> getProducts(int number);
}
