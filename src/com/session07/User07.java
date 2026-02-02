package com.session07;

public class User07 {
    public final int id;
    public String username;
    protected String password;

    @Override
    public String toString() {
        return "ID: " + id + " - Tên đăng nhập: " + username;
    }

    public User07(int id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }
}
