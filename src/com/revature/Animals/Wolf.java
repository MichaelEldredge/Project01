package com.revature.Animals;

public class Wolf extends Canine {

	@Override
	public String getAnimalName() {
		return "Wolf";
	}

	@Override
	public String getFood() {
		return "3 lbs of meat";
	}
	@Override
	public void makeNoise() {
		System.out.print("The "+this.getAnimalName()+" howls.\n");
	}

}
