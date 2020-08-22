package ocja;

import java.sql.SQLException;

public class ExceptionNew {
    private static void getData() throws SQLException {
        try {
            throw new SQLException();
        } catch (Exception e) {
            //e = new SQLException();
            throw e;
        }
    }
 
    public static void main(String[] args) {
        try {
            getData();
        } catch(SQLException e) {
            System.out.println("SQL");
        }
    }
}
