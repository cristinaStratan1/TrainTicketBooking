package it.univaq.sose.train.account;

import java.sql.SQLException;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import it.univaq.sose.train.booking.service.BookingModel;


@Path("/account")
public interface Account {
	
	@Operation(
		       description = "The description of the getTodo operation goes here!",
		       responses = {
		          @ApiResponse(
		             description = "The description of the Response goes here!", 
		             content = @Content(mediaType = MediaType.APPLICATION_JSON, 
		                                schema = @Schema(implementation = AccountModel.class)))
		           }
			)
	
	@GET
	@Path("{login}")
	public AccountModel checkLogin(@PathParam(value ="uname") String username, @PathParam(value ="pass") String password)  throws SQLException, ClassNotFoundException;
	
	@Operation(
		       description = "The description of the getTodo operation goes here!",
		       responses = {
		          @ApiResponse(
		             description = "The description of the Response goes here!", 
		             content = @Content(mediaType = MediaType.APPLICATION_JSON, 
		                                schema = @Schema(implementation = int.class)))
		           }
			)
	@GET
	@Path("{register}")
	int registerAccount(@PathParam(value ="firstname") String firstname, @PathParam(value ="lastname") String lastname, @PathParam(value ="username") String username, 
			@PathParam(value ="password") String password, @PathParam(value ="age") int age, @PathParam(value ="gender") String gender, @PathParam(value ="address") String address) throws ClassNotFoundException;
	
	@Operation( 
		       description = "The description of the getTodos operation goes here!",
				responses = {
			       @ApiResponse(
			          description = "The description of the Response goes here!",
			          content = {
			              @Content(mediaType = MediaType.APPLICATION_JSON,
			                 array = @ArraySchema(schema = @Schema(implementation = BookingModel.class)))
			          }
			       )
			    }
			 )
	@GET
	@Path("{userTickets}")
	List<BookingModel> accountTickets(@PathParam(value ="userid") int userid) ;

}
