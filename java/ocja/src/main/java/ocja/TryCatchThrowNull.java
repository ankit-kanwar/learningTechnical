package ocja;

import java.sql.SQLException;

public class TryCatchThrowNull {

	private static void checkData() throws SQLException {
        try {
            throw new SQLException();
        } catch (Exception e) {
            e = null; //Line 10
            //throw e; //Line 11
        }
    }
 
    public static void main(String[] args) {
        try {
            checkData(); //Line 17
        } catch(SQLException e) {
            System.out.println("NOT AVAILABLE");
        }
    }

}
