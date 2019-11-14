package main.java.vn.edu.hust.data.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

public class Product {
    private int id;
    private String name;
    private float price;
    private String description;
    private Timestamp lastUpdate;
    private int categoryId;
    private String image;
    private String thumbImage;
    private String descriptionDetail;

    private Product(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.price = builder.price;
        this.description = builder.description;
        this.lastUpdate = builder.lastUpdate;
        this.categoryId = builder.categoryId;
        this.image = builder.image;
        this.thumbImage = builder.thumbImage;
        this.descriptionDetail = builder.descriptionDetail;
    }

    public Product(ResultSet resultSet) throws SQLException {
        id = resultSet.getInt("product_id");
        name = resultSet.getString("name");
        description = resultSet.getString("description");
        lastUpdate = resultSet.getTimestamp("last_update");
        categoryId = resultSet.getInt("category_id");
        image = resultSet.getString("image");
        thumbImage = resultSet.getString("thumb_image");
        descriptionDetail = resultSet.getString("description_detail");
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public Timestamp getLastUpdate() {
        return lastUpdate;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public String getImage() {
        return image;
    }

    public String getThumbImage() {
        return thumbImage;
    }

    public String getDescriptionDetail() {
        return descriptionDetail;
    }

    public static class Builder {
        private int id;
        private String name;
        private float price;
        private String description;
        private Timestamp lastUpdate;
        private int categoryId;
        private String image;
        private String thumbImage;
        private String descriptionDetail;

        public Builder() {
        }

        public Product build() {
            return new Product(this);
        }

        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setPrice(float price) {
            this.price = price;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder setLastUpdate(Timestamp lastUpdate) {
            this.lastUpdate = lastUpdate;
            return this;
        }

        public Builder setCategoryId(int categoryId) {
            this.categoryId = categoryId;
            return this;
        }

        public Builder setImage(String image) {
            this.image = image;
            return this;
        }

        public Builder setThumbImage(String thumbImage) {
            this.thumbImage = thumbImage;
            return this;
        }

        public Builder setDescriptionDetail(String descriptionDetail) {
            this.descriptionDetail = descriptionDetail;
            return this;
        }
    }
}
