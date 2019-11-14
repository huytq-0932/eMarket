package main.java.vn.edu.hust.data.database.dao.category;

import main.java.vn.edu.hust.data.database.OnDataLoadedCallback;
import main.java.vn.edu.hust.data.database.dao.base.BaseDAOImpl;
import main.java.vn.edu.hust.data.model.Category;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class CategoryDaoImpl extends BaseDAOImpl implements CategoryDao {

    @Override
    public List<Category> getCategories() {

        List<Category> categories = new ArrayList<>();

        String query = "SELECT * FROM category";

        executeQuery(query, new OnDataLoadedCallback<ResultSet>() {
            @Override
            public void onSuccess(ResultSet data) throws Exception {
                while (data.next()) {
                    categories.add(new Category(data));
                }
            }

            @Override
            public void onFailed(Exception exception) {
                exception.printStackTrace();
            }
        });

        return categories;
    }
}
