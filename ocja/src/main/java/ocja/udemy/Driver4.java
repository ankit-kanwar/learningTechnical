package ocja.udemy;

import java.sql.SQLException;

public class Driver4 {
	
	private static void availableSeats() throws SQLException{
		throw null;
	}
	
	public static void main(String[] args) {
		try {
			availableSeats();
		} catch (SQLException e) {
			System.out.println("SEATS NOT AVAILABLE");
		}
	}

}
