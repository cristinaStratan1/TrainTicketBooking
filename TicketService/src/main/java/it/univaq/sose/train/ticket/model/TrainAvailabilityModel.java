package it.univaq.sose.train.ticket.model;

import java.util.Map;

public class TrainAvailabilityModel {
	
	private Map<TrainModel,Integer> trainAvailability;

	public Map<TrainModel, Integer> getTrainAvailability() {
		return trainAvailability;
	}

	public void setTrainAvailability(Map<TrainModel, Integer> trainAvailability) {
		this.trainAvailability = trainAvailability;
	}

	
}
