package it.univaq.sose.train.ticket.service;

import java.util.Map;
import java.util.concurrent.Future;

import javax.xml.ws.AsyncHandler;

import org.apache.cxf.annotations.UseAsyncMethod;
import org.apache.cxf.jaxws.ServerAsyncResponse;

import it.univaq.sose.train.ticket.controller.TicketController;
import it.univaq.sose.train.ticket.model.TicketModel;
import it.univaq.sose.train.ticket.model.TrainAvailabilityModel;
import it.univaq.sose.train.ticket.model.TrainModel;

public class TicketImpl implements Ticket {

	@Override
	public TicketModel getTicket (int id) {
		return TicketController.getTicket(id);
	}
	
	@Override
	@UseAsyncMethod
	public Map<TrainModel, Integer> getAvailability(String from, String to, String time) {
		// TODO Auto-generated method stub
		return null;
	}	
	

	@Override
	public Future<?> getAvailabilityAsync(String from, String to, String time, AsyncHandler<TrainAvailabilityModel> asyncHandler) {
		
		final ServerAsyncResponse<TrainAvailabilityModel> asyncResponse = new ServerAsyncResponse<TrainAvailabilityModel>();
		
		new Thread() {
			public void run() {
				/*try {
					Thread.sleep(10000); // 10s
				} catch (InterruptedException e) {
					e.printStackTrace();
				}*/
				
				TrainAvailabilityModel response = new TrainAvailabilityModel();
				response.setTrainAvailability(TicketController.getAvailability(from, to, time));
				
				asyncResponse.set(response);
				asyncHandler.handleResponse(asyncResponse);
			}
		}.start();
		
		return asyncResponse;		
	
	}

}
