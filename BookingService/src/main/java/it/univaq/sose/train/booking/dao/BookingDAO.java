package it.univaq.sose.train.booking.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import it.univaq.sose.train.booking.model.BookingModel;

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
	
	public static List<BookingModel> getUserBooking(int userId) throws SQLException{
		Connection connection = DatabaseConnector.connessioneDB();

		String sql = "SELECT * FROM usertickets WHERE iduser = ?";
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setInt(1, userId);

		ResultSet result = statement.executeQuery();

		BookingModel booking = null;
		
		List<BookingModel> tickets= new ArrayList<>();
		
		
		while (result.next()) {
			booking = new BookingModel();
			booking.setBookingId(result.getInt("id"));
			booking.setStatus(result.getString("status"));
			booking.setTicketId(result.getInt("idticket"));
			
			tickets.add(booking);
		}

		
		connection.close();

		return tickets;
	}

}
