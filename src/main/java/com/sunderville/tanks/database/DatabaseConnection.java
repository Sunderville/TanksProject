//package com.sunderville.tanks.database;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.SQLException;
//
//
//
////Заготовка для подключения DB
//
//
//
//public class DatabaseConnection extends dbConfigs {
//    Connection dbConnection;
//
//    public Connection getDbConnection() throws ClassNotFoundException, SQLException {
//        String connectionString = "jdbc:mysql://" + dbHost + ":" + dbPort + "/" + dbName;
//
//        Class.forName("com.mysql.jdbc.Driver");
//
//        dbConnection = DriverManager.getConnection(connectionString, dbUser, dbPass);
//
//        return dbConnection;
//    }
//
//public void sighUpUser(String firstName, String lastName, String login, String password){
//    String insert = "INSERT INTO " + ColumnsBending.USERS_TABLE +
//            "(" + ColumnsBending.USER_FIRSTNAME + ", " + ColumnsBending.USER_LASTNAME + ", " +
//            ColumnsBending.USER_LOGIN + ", " + ColumnsBending.USER_PASSWORD + ") " +
//            "VALUES (?, ?, ?, ?)";
//
//    try {
//        PreparedStatement pS = getDbConnection().prepareStatement(insert);
//        pS.setString(1, firstName);
//        pS.setString(2, lastName);
//        pS.setString(3, login);
//        pS.setString(4, password);
//
//        pS.executeUpdate();
//    } catch (SQLException e) {
//        e.printStackTrace();
//    } catch (ClassNotFoundException e) {
//        e.printStackTrace();
//    }
//}
//
//    public ResultSet getUser(String login, String password) {
//        ResultSet rS = null;
//
//        String select = "SELECT * FROM " + ColumnsBending.USERS_TABLE + " WHERE " +
//                ColumnsBending.USER_LOGIN + "=? AND " + ColumnsBending.USER_PASSWORD + "=?";
//
//        try {
//            PreparedStatement pS = getDbConnection().prepareStatement(select);
//            pS.setString(1, login);
//            pS.setString(2, password);
//
//            rS = pS.executeQuery();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//
//        return rS;
//    }
//}
