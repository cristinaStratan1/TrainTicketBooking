package it.univaq.sose.train.booking.service;

import java.util.ArrayList;
import java.util.List;

import it.univaq.sose.train.booking.controller.RouteController;
import it.univaq.sose.train.booking.dao.BookingDAO;
import it.univaq.sose.train.booking.model.RouteModel;

public class BookingImpl implements Booking {
	
	@Override
	public List<RouteModel> getRoutes(String from, String to, String time) {	
		
		List<RouteModel> routes = new ArrayList<>();
		
		try {
			routes = RouteController.getRoutes(from, to, time);
			return routes;
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return routes;
	}

	@Override
	public boolean setBooking(int userId, int ticketId, String seat, String status) {
		BookingDAO.setBooking(userId, ticketId, seat, status);
		return true;
	}
	
	@Override
	public List<BookingModel> getUserBooking(int userId){
		 List<BookingModel> userTickets = BookingDAO.getUserBooking(userid);
		 return userTickets;
		
	}

}
