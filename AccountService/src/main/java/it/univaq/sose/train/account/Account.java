package it.univaq.sose.train.account;

import java.sql.SQLException;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;


@Path("/account")
public interface Account {
	
	@GET
	@Path("/login")
	@Produces({ MediaType.APPLICATION_JSON })
	public AccountModel checkLogin(@QueryParam("uname") String username,@QueryParam("pass") String password)  throws SQLException, ClassNotFoundException;
	
	@GET
	@Path("/register")
	@Produces({ MediaType.APPLICATION_JSON })
	int registerAccount(AccountModel account) throws ClassNotFoundException;

}
