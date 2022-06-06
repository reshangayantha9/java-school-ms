package schoolmanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class MyConn {

    static Connection c;
        public static void getMyConn()throws Exception{
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/schoolManagement";
            c=DriverManager.getConnection(url,"root","123");
            
        }
        public static void save(String sql)throws Exception{
            if(c==null)
                getMyConn();
            c.createStatement().executeUpdate(sql);
        }
        public static ResultSet search(String sql)throws Exception{
            if(c==null)
                getMyConn();
            ResultSet rs=c.createStatement().executeQuery(sql);
            return rs;
        }
}
