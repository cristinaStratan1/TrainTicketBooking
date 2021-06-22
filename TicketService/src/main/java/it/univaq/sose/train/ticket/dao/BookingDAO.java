package it.univaq.sose.train.ticket.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import it.univaq.sose.train.ticket.controller.TicketController;
import it.univaq.sose.train.ticket.model.BookingModel;

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
	

	public static List<BookingModel> getUserBooking(int userId) {
		
		List<BookingModel> tickets= new ArrayList<>();
		
		try {
			
		Connection connection = DatabaseConnector.connessioneDB();

		String sql = "SELECT * FROM usertickets WHERE iduser = ?";
		PreparedStatement statement;
		
		statement = connection.prepareStatement(sql);

		statement.setInt(1, userId);

		ResultSet result = statement.executeQuery();

		BookingModel booking = null;		
		
		while (result.next()) {
			booking = new BookingModel();
			booking.setBookingId(result.getInt("id"));

			booking.setUserId(result.getInt("iduser"));
			booking.setTicket(TicketController.getTicket(result.getInt("idticket")));
			booking.setSeat(result.getString("seat"));
			booking.setStatus(result.getString("status"));
			
			tickets.add(booking);
		}

		connection.close();

		return tickets;		
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return tickets;
	}

}
