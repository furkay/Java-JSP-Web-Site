package Islemler;
import java.sql.*;

    public class Saglayici
           {

                public static Connection Baglanti()
                   {
                        final String JDBC_DRIVER="com.mysql.jdbc.Driver";   
                        final String DB_URL ="jdbc:mysql://localhost:3306/websitesi?useUnicode=yes&characterEncoding=UTF-8";     
                        final String USER ="root";    
                        final String PASS="";   
                        Connection conn = null;


                        try{
                        Class.forName("com.mysql.jdbc.Driver");
                        conn = DriverManager.getConnection(DB_URL, USER, PASS);
                            }
                        catch (ClassNotFoundException e){}
                        catch (SQLException e){}
                        return conn;
                   }

            }
