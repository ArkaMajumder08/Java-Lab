import java.sql.*;

public class JDBCexample {
    public static void main(String[] args) {
        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");

            
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/abc", "root", "password");

            
            Statement stmt = con.createStatement();

            
            ResultSet rs = stmt.executeQuery("SELECT * FROM employee");

            
            while(rs.next()) {
                System.out.println(rs.getInt(1) + " " +
                                   rs.getString(2) + " " +
                                   rs.getDouble(3));
            }

            con.close();

        } catch(Exception e) {
            System.out.println(e);
        }
    }
}