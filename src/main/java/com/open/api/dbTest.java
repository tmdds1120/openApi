package com.open.api;

import java.sql.*;

public class dbTest {
    public static void main(String[] args) throws SQLException {
        //1.  ip port user_id password "instance"



        //2. 커넥션 상에서 url, user_id , pass word 상으로
        //  url 에서 담는 정보 jdbc:DB_VENDER://IP_ADDR:IP_PORT/INSTANCE;
//        String url1 ="jdbc:mariadb://localhost:3306/api;

        String dbUserId = "root";
        String dbPassword = "tmdds";
        try {
            Class.forName("org.mariadb.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


//        try {
//            Connection connection = DriverManager.getConnection(url1,dbUserId,dbPassword);
//            Statement statement = connection.createStatement();// conect 객체에서 가져옴
//            String sql =" select member_type, user_id, password, name "
//                    + "from member "+ " where member_type ='email'";
//            PreparedStatement preparedStatement = null;
//            CallableStatement callableStatement = null;
//
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
    }
}
