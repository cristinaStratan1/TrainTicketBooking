package it.univaq.sose.train.schedule.model;

public class TrainModel {
	
	private int trainId;
	
	private int trainNo;
	
	private int capacity;

	public TrainModel(int trainId, int trainNo, int capacity) {
		super();
		this.trainId = trainId;
		this.trainNo = trainNo;
		this.capacity = capacity;
	}

	public int getTrainId() {
		return trainId;
	}

	public void setTrainId(int trainId) {
		this.trainId = trainId;
	}

	public int getTrainNo() {
		return trainNo;
	}

	public void setTrainNo(int trainNo) {
		this.trainNo = trainNo;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

}
