package main.java.vn.edu.hust.data.model;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Category {
    private int id;
    private String name;
    private String image;

    public Category(int id, String name, String image) {
        this.id = id;
        this.name = name;
        this.image = image;
    }

    public Category(ResultSet resultSet) throws SQLException {
        this.id = resultSet.getInt("category_id");
        this.name = resultSet.getString("name");
        this.image = resultSet.getString("image");
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getImage() {
        return image;
    }
}
