package it.univaq.sose.train.booking.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BookingDAO {
	
	public static boolean setBooking (int userId, int ticketId, String seat, String status) {
		
		try {
			
			Connection connection = DatabaseConnector.connessioneDB();
				
			PreparedStatement insertBooking = connection.prepareStatement("INSERT INTO usertickets (iduser, idticket, seat, status)\r\n" + 
					"VALUES (?, ?, ?, ?)");
			insertBooking.setInt(1, userId);
			insertBooking.setInt(2, ticketId);
			insertBooking.setString(3, seat);
			insertBooking.setString(4, status);
			
			boolean insert = insertBooking.execute();
			
			insertBooking.close();
			connection.close();		
			
			return insert;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}

}
