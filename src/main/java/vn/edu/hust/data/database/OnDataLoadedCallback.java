package main.java.vn.edu.hust.data.database;

public interface OnDataLoadedCallback<T> {
    void onSuccess(T data) throws Exception;

    void onFailed(Exception exception);
}
