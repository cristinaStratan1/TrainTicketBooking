package it.univaq.sose.train.booking.model;

import it.univaq.sose.train.schedule.service.ItineraryModel;
import it.univaq.sose.train.schedule.service.TrainModel;

public class RouteModel {
	
	private ItineraryModel schedule;
	
	private TrainModel train;
	
	private int availability;

	public RouteModel(ItineraryModel schedule, TrainModel train, int availability) {
		super();
		this.schedule = schedule;
		this.train = train;
		this.availability = availability;
	}

	public ItineraryModel getSchedule() {
		return schedule;
	}

	public void setSchedule(ItineraryModel schedule) {
		this.schedule = schedule;
	}

	public TrainModel getTrain() {
		return train;
	}

	public void setTrain(TrainModel train) {
		this.train = train;
	}

	public int getAvailability() {
		return availability;
	}

	public void setAvailability(int availability) {
		this.availability = availability;
	}

}
