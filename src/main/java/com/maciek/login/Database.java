package com.maciek.login;

import java.sql.*;

public class Database {

    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://77.55.192.67/mgozdalik";

    static final String DB_USERNAME = "mgozdalik";
    static final String DB_PASSWORD = "mgozdalik";

    private Connection con;
    private PreparedStatement ps;
    private ResultSet rs;
    private String sql;

    public Database() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(DB_URL, DB_USERNAME,DB_PASSWORD);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void close() {
        try {
            if (con != null) con.setAutoCommit(true);
            if (ps != null) ps.close();
            if (rs != null) rs.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public boolean register(String username, String password) {
        if (username.length() <= 0 || password.length() <= 0) {
            return false;
        }

        sql = "INSERT INTO users (USERNAME, PASSWORD) VALUES (?, ?)";

        try {
            ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, username);
            ps.setString(2, password);

            ps.executeUpdate();

            rs = ps.getGeneratedKeys();
            return rs.next();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        } finally {
            close();
        }
    }

    public boolean login(String username, String password) {
        if (username.length() <= 0 || password.length() <= 0) {
            return false;
        }

        sql = "SELECT ID_USER FROM users WHERE `USERNAME` = ? AND `PASSWORD` = ?";

        try {

            ps = con.prepareStatement(sql);
            ps.setString(1, username);
            ps.setString(2, password);

            rs = ps.executeQuery();
            return rs.next();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        } finally {
            close();
        }
    }

}
