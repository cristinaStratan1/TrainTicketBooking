package it.univaq.sose.train.ticket.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import it.univaq.sose.train.ticket.model.TicketModel;

public class TicketDAO {
	
	public static TicketModel getTicketByID (int id) {
		
		TicketModel train = null;
		
		try {
			
			Connection connection = DatabaseConnector.connessioneDB();
			
			PreparedStatement sTicketById = connection.prepareStatement("SELECT * FROM tickets WHERE id=?");
			sTicketById.setInt(1, id);
			
			ResultSet resObj = sTicketById.executeQuery();
			
			while (resObj.next()) {
				train = new TicketModel(resObj.getInt("id"), resObj.getInt("noOfPeople"), resObj.getFloat("price"), resObj.getString("class"), ItineraryDAO.getItineraryByID(resObj.getInt("iditinerary")));
			}
			
			resObj.close();
			sTicketById.close();
			connection.close();
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return train;
	}
	
	public static Integer getBookingByItineraryId (int itineraryId) {
		
		int booked = 0;
		
		try {
			
			Connection connection = DatabaseConnector.connessioneDB();
			
			PreparedStatement getAvailabilityById = connection.prepareStatement("SELECT COUNT(*) AS booked FROM train_ticket_booking.usertickets "
					+ "JOIN tickets ON usertickets.idticket=tickets.id WHERE tickets.iditinerary=?");
			getAvailabilityById.setInt(1, itineraryId);
			
			ResultSet resObj = getAvailabilityById.executeQuery();
			
			while (resObj.next()) {
				booked = resObj.getInt("booked");
			}
			
			resObj.close();
			getAvailabilityById.close();
			connection.close();			
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return booked;
	}

}
