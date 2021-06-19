package it.univaq.sose.train.account;

import java.sql.SQLException;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import it.univaq.sose.train.booking.service.BookingModel;


@Path("/account")
public interface Account {
	
	@POST
	@Path("/login")
	@Produces({ MediaType.APPLICATION_JSON })
	public AccountModel checkLogin(@QueryParam("uname") String username,@QueryParam("pass") String password)  throws SQLException, ClassNotFoundException;
	
	@POST
	@Path("/register")
	@Produces({ MediaType.APPLICATION_JSON })
	int registerAccount(AccountModel account) throws ClassNotFoundException;
	
	@POST
	@Path("/userTickets")
	@Produces({ MediaType.APPLICATION_JSON })
	List<BookingModel> accountTickets(@QueryParam("userid") int userid) ;

}
