package sk.itsovy.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJDBC {
    public static void main(String[] args) {

        String URL = "jdbc:mysql://localhost:3306/hb-01-one-to-one-uni?useSSL=false&serverTimezone=UTC";
        String user = "hbstudent";
        String psw = "hbstudent";

        try{
            System.out.println("Connecting to database: " + URL);
            Connection connection = DriverManager.getConnection(URL, user, psw);
            System.out.println("Connection successful");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
