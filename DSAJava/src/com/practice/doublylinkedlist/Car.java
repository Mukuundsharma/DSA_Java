package com.practice.doublylinkedlist;

public class Car {
	private String carBrand, carModel;
	private int horsePower;

	public String getCarBrand() {
		return carBrand;
	}

	public String getCarModel() {
		return carModel;
	}

	public int getHorsePower() {
		return horsePower;
	}

	public void setCarBrand(String carBrand) {
		this.carBrand = carBrand;
	}

	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}

	public void setHorsePower(int horsePower) {
		this.horsePower = horsePower;
	}

	public Car(String carBrand, String carModel, int horsePower) {
		this.carBrand = carBrand;
		this.carModel = carModel;
		this.horsePower = horsePower;
	}

	@Override
	public String toString() {
		return "Car [carBrand=" + carBrand + ", carModel=" + carModel + ", horsePower=" + horsePower + "]";
	}

}
