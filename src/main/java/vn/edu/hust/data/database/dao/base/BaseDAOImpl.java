package main.java.vn.edu.hust.data.database.dao.base;

import main.java.vn.edu.hust.data.database.DBConnection;
import main.java.vn.edu.hust.data.database.OnDataLoadedCallback;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class BaseDAOImpl {

    protected void executeQuery(String sql, OnDataLoadedCallback<ResultSet> callback) {
        try {
            Connection connection = DBConnection.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet == null) {
                callback.onFailed(new Exception("Data not found"));
            } else {
                callback.onSuccess(resultSet);
            }
        } catch (Exception e) {
            callback.onFailed(e);
        }
    }
}
