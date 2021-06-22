package it.univaq.sose.train.ticket.model;

public class BookingModel {
	
	private int bookingId;
	
	private int userId;
	
	private TicketModel ticket;
	
	private String seat;
	
	private String status;
	
	public BookingModel() {
		super();
	}

	public BookingModel(int bookingId, int userId, TicketModel ticket, String seat, String status) {
		super();
		this.bookingId = bookingId;
		this.userId = userId;
		this.ticket = ticket;
		this.seat = seat;
		this.status = status;
	}

	public int getBookingId() {
		return bookingId;
	}

	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public TicketModel getTicket() {
		return ticket;
	}

	public void setTicket(TicketModel ticket) {
		this.ticket = ticket;
	}

	public String getSeat() {
		return seat;
	}

	public void setSeat(String seat) {
		this.seat = seat;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
