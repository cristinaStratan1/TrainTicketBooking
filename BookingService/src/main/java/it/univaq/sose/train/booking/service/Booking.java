package it.univaq.sose.train.booking.service;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import it.univaq.sose.train.booking.model.RouteModel;

@WebService
public interface Booking {
	
	@WebMethod
	List<RouteModel> getRoutes(String from, String to, String time);
	
	@WebMethod
	boolean setBooking (int userId, int ticketId, String seat, String status);

}
