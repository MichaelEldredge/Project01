package com.revature.Animals;

public class Lion extends Feline {

	@Override
	public String getAnimalName() {
		return "Lion";
	}

	@Override
	public String getFood() {
		return "20 lbs of meat";
	}
	@Override
	public void makeNoise(){
		System.out.print("The "+this.getAnimalName()+" roars.");
	}

}
