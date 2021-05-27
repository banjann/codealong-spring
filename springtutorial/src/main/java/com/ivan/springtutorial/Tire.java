package com.ivan.springtutorial;

public class Tire {

	private String brand;
	private Car car;
	
	public Tire(String brand, Car car) {
		this.brand = brand;
		this.car = car;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "Tire [brand=" + brand + ", car=" + car.getName() +" ]";
	}

	
}
