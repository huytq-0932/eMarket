package main.java.vn.edu.hust.data.database.dao.product;

import main.java.vn.edu.hust.data.database.OnDataLoadedCallback;
import main.java.vn.edu.hust.data.database.dao.base.BaseDAOImpl;
import main.java.vn.edu.hust.data.model.Product;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ProductDAOImpl extends BaseDAOImpl implements ProductDao {

    @Override
    public List<Product> getProducts(int number) {
        List<Product> products = new ArrayList<>();
        String query = "SELECT * FROM product";

        executeQuery(query, new OnDataLoadedCallback<ResultSet>() {
            @Override
            public void onSuccess(ResultSet resultSet) throws Exception {
                while(resultSet.next()){
                    products.add(new Product(resultSet));
                }
            }

            @Override
            public void onFailed(Exception exception) {
                exception.printStackTrace();
            }
        });
        return products;
    }
}
