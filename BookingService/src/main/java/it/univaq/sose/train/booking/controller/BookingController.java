package it.univaq.sose.train.booking.controller;

import java.util.List;

import it.univaq.sose.train.ticket.service.BookingModel;
import it.univaq.sose.train.ticket.service.SQLException_Exception;
import it.univaq.sose.train.ticket.service.Ticket;
import it.univaq.sose.train.ticket.service.TicketImplService;

public class BookingController {

	public static boolean setBooking(int userId, int ticketId, String seat, String status) {
		
		TicketImplService service = new TicketImplService();
		Ticket port = service.getTicketImplPort();
		boolean response = port.setBooking(userId, ticketId, seat, status);
		return response;
	}

	public static List<BookingModel> getUserBooking(int userId) throws SQLException_Exception {

		TicketImplService service = new TicketImplService();
		Ticket port = service.getTicketImplPort();
		List<BookingModel> response = port.getBookingByUserId(userId);
		return response;
	}
	
	

}
